package com.geeui.face

import android.content.ComponentName
import android.content.Context
import android.content.Intent
import android.content.ServiceConnection
import android.os.Bundle
import android.os.IBinder
import android.util.Log
import android.view.SurfaceHolder
import android.view.View
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import androidx.media3.common.MediaItem
import androidx.media3.common.Player
import androidx.media3.exoplayer.ExoPlayer
import com.geeui.face.databinding.ActivityMainBinding
import com.geeui.face.service.AutoService
import com.renhejia.robot.commandlib.consts.RobotRemoteConsts
import com.renhejia.robot.commandlib.log.LogUtils

class MainActivity : AppCompatActivity(),
    AutoService.OnFaceChangeListener {
    private var surfaceAvailable: Boolean = false
    private var isPlaying: Boolean = false
    private lateinit var binding: ActivityMainBinding
    private var dispatchService: AutoService? = null
    private var currentMode = ""
    private var currentFace = ""
    private var intentFace = ""
    private var dispatchConnection = object : ServiceConnection {
        override fun onServiceConnected(name: ComponentName?, service: IBinder?) {
            val binder: AutoService.MyBinder = service as AutoService.MyBinder
            dispatchService = binder.service
            dispatchService?.setFaceChangeListener(this@MainActivity)
            dispatchService?.setRobotMode(currentMode)
        }

        override fun onServiceDisconnected(name: ComponentName?) {
            dispatchService?.setFaceChangeListener(null)
            dispatchService = null
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        LogUtils.logd("MainActivity", "onCreate: " + System.currentTimeMillis());
        super.onCreate(savedInstanceState)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
        window.decorView.systemUiVisibility =
            View.SYSTEM_UI_FLAG_HIDE_NAVIGATION or View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        currentMode =
            intent.getStringExtra("mode") ?: RobotRemoteConsts.COMMAND_VALUE_CHANGE_MODE_ROBOT
        intentFace = intent.getStringExtra("face") ?: "h0059"
        bindDispatchService()

        LogUtils.logd(
            "MainActivity",
            "onCreate: " + intent.getStringExtra("face") + "   " + intent.getStringExtra("mode")
        );
        initSurface()
    }

    private fun initSurface() {
        binding.playerView.holder.addCallback(object : SurfaceHolder.Callback {
            override fun surfaceCreated(holder: SurfaceHolder) {
                surfaceAvailable = true
                LogUtils.logd("MainActivity", "surfaceCreated: ");
                mediaPlayer?.setVideoSurfaceHolder(holder)
                if (currentFace.isBlank() && intentFace.isNotEmpty()) {
                    openVideo(intentFace)
                } else if (currentFace.isNotEmpty()) {
                    mediaPlayer?.play()
                }
            }

            override fun surfaceChanged(
                holder: SurfaceHolder, format: Int, width: Int, height: Int
            ) {
                LogUtils.logd("MainActivity", "surfaceChanged: ");
            }

            override fun surfaceDestroyed(holder: SurfaceHolder) {
                surfaceAvailable = false
                mediaPlayer?.clearVideoSurfaceHolder(holder)
                LogUtils.logd("MainActivity", "surfaceDestroyed: ");
            }
        })
    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        setIntent(intent)
        LogUtils.logd(
            "MainActivity",
            "onNewIntent: " + intent?.getStringExtra("face") + "   " + intent?.getStringExtra("mode")
        )
        val face = intent?.getStringExtra("face")
        if (face != null) {
            openVideo(face)
        }
        val mode = intent?.getStringExtra("mode")
        if (mode != null) {
            if (dispatchService != null) {
                LogUtils.logd("MainActivity", "onNewIntent: $mode");
                dispatchService!!.setRobotMode(mode)
                currentMode = mode
            } else {
                currentMode = mode
                bindDispatchService()
            }
        }
    }

    override fun onResume() {
        super.onResume()
        hideNavigationBar()
        binding.root.keepScreenOn = true
        if (isPlaying) {
            mediaPlayer?.play()
        }
    }

    private fun hideNavigationBar() {
        val decorView = window.decorView
        decorView.setOnSystemUiVisibilityChangeListener { visibility: Int ->
            if (visibility and View.SYSTEM_UI_FLAG_FULLSCREEN == 0) {
                window.decorView.systemUiVisibility =
                    View.SYSTEM_UI_FLAG_HIDE_NAVIGATION or View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
            }
        }
    }

    private fun bindDispatchService() {
        val intent = Intent(this@MainActivity, AutoService::class.java)
        bindService(intent, dispatchConnection, Context.BIND_AUTO_CREATE)
    }

    private var mediaPlayer: ExoPlayer? = null

    @Synchronized
    private fun openVideo(name: String) {
        if (!surfaceAvailable) {
            LogUtils.logd("MainActivity", "openVideo: 不展示视频");
            currentFace = name
            return
        }
        currentFace = name
        Log.e("MainActivity", "openVideo_name: $name surfaceAvailable: $surfaceAvailable")
        val player = mediaPlayer ?: ExoPlayer.Builder(this).build().also {
            it.repeatMode = Player.REPEAT_MODE_ALL
            mediaPlayer = it
        }
        player.setVideoSurfaceHolder(binding.playerView.holder)
        player.setMediaItem(MediaItem.fromUri("asset:///video/$name.mp4"))
        player.prepare()
        player.play()
        isPlaying = true
    }

    override fun onPause() {
        super.onPause()
        LogUtils.logd("MainActivity", "onPause: ");
        isPlaying = mediaPlayer?.isPlaying == true
        mediaPlayer?.pause()
    }

    override fun onStop() {
        super.onStop()
        LogUtils.logd("MainActivity", "onStop: ");
        mediaPlayer?.release()
        mediaPlayer = null
    }

    override fun onDestroy() {
        super.onDestroy()
        unbindService(dispatchConnection)
        LogUtils.logd("MainActivity", "onDestroy: ");
    }

    override fun changeFace(faceName: String?) {
        LogUtils.logd("MainActivity", "changeFace: $faceName");
        faceName?.let { name ->
            runOnUiThread { openVideo(name) }
        }
    }

    var finished = false
    override fun finishProcess() {
        if (!finished) {
            finished = true
            finish()
        }
    }
}
