package com.geeui.face.gesture;

import android.content.Context;
import android.os.RemoteException;

import com.renhejia.robot.commandlib.consts.RobotRemoteConsts;
import com.renhejia.robot.commandlib.log.LogUtils;
import com.renhejia.robot.commandlib.parser.motion.Motion;
import com.renhejia.robot.gesturefactory.parser.GestureData;
import com.renhejia.robot.letianpaiservice.ILetianpaiService;

import java.util.ArrayList;

/**
 * 语音命令执行单元
 *
 * @author liujunbin
 */
public class AudioCmdResponseManager {

    private static AudioCmdResponseManager instance;
    private Context mContext;

    private AudioCmdResponseManager(Context context) {
        init(context);
    }

    private void init(Context context) {
        this.mContext = context;
    }

    public static AudioCmdResponseManager getInstance(Context context) {
        synchronized (AudioCmdResponseManager.class) {
            if (instance == null) {
                instance = new AudioCmdResponseManager(context.getApplicationContext());
            }
            return instance;
        }
    }

    public void responseGestures(ArrayList<GestureData> list, int taskId, ILetianpaiService iLetianpaiService) {
        GestureDataThreadExecutor.getInstance().execute(() -> {
            LogUtils.logd("AudioCmdResponseManager", "run start: taskId:" + taskId);
            for (GestureData gestureData : list) {
                if (Thread.currentThread().isInterrupted()) {
                    LogUtils.logd("AudioCmdResponseManager", "run aborted: taskId:" + taskId);
                    return;
                }
                responseGestureData(gestureData, iLetianpaiService);
                try {
                    long wait = gestureData.getInterval() == 0 ? 2000L : gestureData.getInterval();
                    Thread.sleep(wait);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    LogUtils.logd("AudioCmdResponseManager", "run interrupted: taskId:" + taskId);
                    return;
                }
            }
            LogUtils.logd("AudioCmdResponseManager", "run end: taskId:" + taskId);
            GestureCallback.getInstance().setGesturesComplete("list", taskId);
        });
    }

    public static void responseGestureData(GestureData gestureData, ILetianpaiService iLetianpaiService) {

        logGestureData(gestureData);
        if (gestureData == null) {
            return;
        }
        try {
            if (gestureData.getTtsInfo() != null) {
                iLetianpaiService.setTTS("speakText", gestureData.getTtsInfo().getTts());
            }
            if (gestureData.getExpression() != null) {
                iLetianpaiService.setExpression(RobotRemoteConsts.COMMAND_TYPE_FACE, (gestureData.getExpression()).toString());
            }
            if (gestureData.getAntennalight() != null) {
                iLetianpaiService.setMcuCommand(RobotRemoteConsts.COMMAND_TYPE_ANTENNA_LIGHT, (gestureData.getAntennalight()).toString());
            }
            if (gestureData.getSoundEffects() != null) {
                iLetianpaiService.setAudioEffect(RobotRemoteConsts.COMMAND_TYPE_SOUND, (gestureData.getSoundEffects()).toString());
            }
            if (gestureData.getFootAction() != null) {
                iLetianpaiService.setMcuCommand(RobotRemoteConsts.COMMAND_TYPE_MOTION, (gestureData.getFootAction()).toString());
            } else {
                Motion motion = new Motion();
                motion.setNumber(0);
                iLetianpaiService.setMcuCommand(RobotRemoteConsts.COMMAND_TYPE_MOTION, motion.toString());
            }
            if (gestureData.getEarAction() != null) {
                iLetianpaiService.setMcuCommand(RobotRemoteConsts.COMMAND_TYPE_ANTENNA_MOTION, (gestureData.getEarAction()).toString());
            }

        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    private static void logGestureData(GestureData gestureData) {
        LogUtils.logd("AudioCmdResponseManager", "解析给实际执行单元 " + gestureData);
    }


}
