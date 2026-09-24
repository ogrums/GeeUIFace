package com.geeui.face

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.media3.common.MediaItem
import androidx.media3.common.Player
import androidx.media3.exoplayer.ExoPlayer
import com.geeui.face.databinding.ActivityExoplayerBinding

/** Debug player. Not exported. Plays an asset expression with Media3. */
class ExoplayerActivity : AppCompatActivity() {
    private lateinit var binding: ActivityExoplayerBinding
    private var player: ExoPlayer? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityExoplayerBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.playerView.background = ColorDrawable(Color.TRANSPARENT)
        player = ExoPlayer.Builder(this).build().also {
            it.repeatMode = Player.REPEAT_MODE_ALL
            binding.playerView.player = it
            it.setMediaItem(MediaItem.fromUri("asset:///video/h0005.mp4"))
            it.prepare()
            it.play()
        }
    }

    override fun onStop() {
        player?.release()
        player = null
        binding.playerView.player = null
        super.onStop()
    }
}
