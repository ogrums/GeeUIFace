package com.renhejia.robot.gesturefactory.manager;

import android.util.Log;
import com.renhejia.robot.commandlib.consts.MCUCommandConsts;
import com.renhejia.robot.commandlib.consts.SoundEffect;
import com.renhejia.robot.commandlib.parser.antennalight.AntennaLight;
import com.renhejia.robot.commandlib.parser.antennamotion.AntennaMotion;
import com.renhejia.robot.commandlib.parser.face.Face;
import com.renhejia.robot.commandlib.parser.motion.Motion;
import com.renhejia.robot.commandlib.parser.sound.Sound;
import com.renhejia.robot.commandlib.parser.tts.Tts;
import com.renhejia.robot.gesturefactory.parser.GestureData;

import java.util.ArrayList;
import java.util.Random;

/**
 * 姿态中心
 *
 * @author liujunbin
 */
public class GestureCenter {

    /**
     * @return
     */
    public static ArrayList<GestureData> demoGestureData() {
        ArrayList<GestureData> list = new ArrayList<>();
        GestureData data = new GestureData();
        data.setExpression(new Face("h0020"));
        data.setEarAction(new AntennaMotion(3));
        data.setFootAction(new Motion(63));
        data.setSoundEffects(new Sound("a0051"));
        list.add(data);
        return list;
    }

    public static ArrayList<GestureData> resetStandGestureData() {
        ArrayList<GestureData> list = new ArrayList<>();
        GestureData data = new GestureData();
        data.setFootAction(new Motion(0));
        data.setSoundEffects(new Sound("a0053"));
        data.setAntennalight(new AntennaLight(MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_ON, MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_COLOR_BLACK));//TODO  更新为蓝色,亮3秒
        data.setInterval(500);
        list.add(data);
        return list;
    }

    public static ArrayList<GestureData> resetStandGesture() {
        ArrayList<GestureData> list = new ArrayList<>();
        GestureData data = new GestureData();
        data.setFootAction(new Motion(0));
        data.setAntennalight(new AntennaLight(MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_ON, MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_COLOR_BLACK));//TODO  更新为蓝色,亮3秒
        data.setInterval(500);
        list.add(data);
        return list;
    }

    /**
     * 正常 normal
     *
     * @return
     */
    public static ArrayList<GestureData> normalGestureData() {
        ArrayList<GestureData> list = new ArrayList<>();
        GestureData data = new GestureData();
        data.setFootAction(new Motion(0));
        data.setExpression(new Face("bluehole0415"));
        list.add(data);
        //TODO 待添加
        return list;
    }

    public static ArrayList<GestureData> commonGestureData() {
        ArrayList<GestureData> list = new ArrayList<>();
        GestureData data = new GestureData();
        data.setExpression(new Face("h0020"));
        data.setExpressionTime(2);
        data.setInterval(500);
        data.setSoundEffects(new Sound("a0040"));

        list.add(data);
        GestureData data2 = new GestureData();
        data2.setExpression(new Face("h0019"));
        data2.setExpressionTime(2);
        data2.setSoundEffects(new Sound("a0070"));
        data.setInterval(500);

        list.add(data2);

        //TODO 待添加
        return list;
    }

    public static ArrayList<GestureData> stopSoundEffectData() {
        ArrayList<GestureData> list = new ArrayList<>();
        GestureData data = new GestureData();
        data.setInterval(500);
        data.setSoundEffects(new Sound(SoundEffect.COMMAND_FUNCTION_STOP));
        list.add(data);
        return list;
    }

    //    public static ArrayList<GestureData> clockGestureData() {
//        ArrayList<GestureData> list = new ArrayList<>();
//        GestureData data = new GestureData();
//        data.setExpression(new Face("h0008"));
//        data.setInterval(1000 * 60);
////        data.setFootAction(new Motion(SHAKE_SWAYING_UP_AND_DOWN1, 17,35));
//        data.setFootAction(new Motion(null, 17, 35));
//        data.setAntennalight(new AntennaLight(MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_ON, MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_COLOR_BLUE));//TODO  更新为蓝色,亮3秒
//        data.setSoundEffects(new Sound("a0029"));
//        list.add(data);
//
//        //TODO 待添加
//        return list;
//    }

    public static ArrayList<GestureData> clockGestureData() {
        ArrayList<GestureData> list = new ArrayList<>();
        GestureData data = new GestureData();
        data.setInterval(1000 * 10);
        data.setFootAction(new Motion(null, 17, 40));
        data.setAntennalight(new AntennaLight(MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_ON, MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_COLOR_RED));//TODO  更新为红色,亮3秒
        data.setSoundEffects(new Sound("a0029"));
        list.add(data);

        //TODO 待添加
        return list;
    }

    public static ArrayList<GestureData> closeClockGestureData() {
        ArrayList<GestureData> list = new ArrayList<>();
        GestureData data = new GestureData();
        data.setFootAction(new Motion(0));
        data.setAntennalight(new AntennaLight(MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_ON, MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_COLOR_BLACK));//TODO  更新为蓝色,亮3秒
        data.setInterval(500);
        list.add(data);
        return list;
    }


    public static ArrayList<GestureData> countdownGestureData() {
        ArrayList<GestureData> list = new ArrayList<>();
        GestureData data = new GestureData();
        data.setInterval(1000 * 60);
//        data.setFootAction(new Motion(SHAKE_SWAYING_UP_AND_DOWN1, 17,35));
        data.setFootAction(new Motion(null, 17, 35));
        data.setAntennalight(new AntennaLight(MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_ON, MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_COLOR_BLUE));//TODO  更新为蓝色,亮3秒
        data.setSoundEffects(new Sound("a0029"));
        list.add(data);

        //TODO 待添加
        return list;
    }

    public static ArrayList<GestureData> standGestureData() {
        ArrayList<GestureData> list = new ArrayList<>();
        GestureData data = new GestureData();
        data.setExpression(new Face("h0020"));
        data.setExpressionTime(2);
        data.setInterval(3000);
        data.setSoundEffects(new Sound("a0040"));
        list.add(data);
        return list;
    }

    /**
     * 通用随机
     *
     * @return
     */
    public static ArrayList<GestureData> common01GestureData() {
        ArrayList<GestureData> list = new ArrayList<>();
        GestureData data = new GestureData();
        data.setExpression(new Face("h0063"));
        data.setFootAction(new Motion(26));
        data.setInterval(500);
        list.add(data);

        GestureData data1 = new GestureData();
        data1.setFootAction(new Motion(0));
        data.setInterval(500);
        list.add(data1);

        GestureData data2 = new GestureData();
        data2.setFootAction(new Motion(25));
        data.setInterval(500);
        list.add(data2);

        GestureData data3 = new GestureData();
        data3.setFootAction(new Motion(0));
        data.setInterval(500);
        list.add(data3);
        //TODO 待添加
        return list;
    }

    /**
     * 通用随机
     *
     * @return
     */
    public static ArrayList<GestureData> commonStandGestureData() {
        ArrayList<GestureData> list = new ArrayList<>();
        GestureData data = new GestureData();
        data.setExpression(new Face("h0063"));
        data.setFootAction(new Motion(34));
        data.setInterval(500);
        list.add(data);


        //TODO 待添加
        return list;
    }

    /**
     * pair
     *
     * @return
     */
    public static ArrayList<GestureData> pairGestureData() {
        ArrayList<GestureData> list = new ArrayList<>();
        GestureData data = new GestureData();
        data.setFootAction(new Motion(0));
        data.setSoundEffects(new Sound("a0030"));
        data.setAntennalight(new AntennaLight(MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_ON, MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_COLOR_ORANGE));
        data.setInterval(4000);
        list.add(data);

        GestureData data1 = new GestureData();
        data1.setAntennalight(new AntennaLight(MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_ON, MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_COLOR_BLACK));
        data1.setInterval(1000);
        list.add(data1);

        //TODO 待添加
        return list;
    }

    public static ArrayList<GestureData> dodgeGestureData() {
        ArrayList<GestureData> list = new ArrayList<>();
        GestureData data = new GestureData();
        data.setExpression(new Face("h0031"));
        data.setFootAction(new Motion(5));
        data.setInterval(2000);

        GestureData data1 = new GestureData();
        data1.setFootAction(new Motion(5));
        data1.setSoundEffects(new Sound("a0007"));
        data1.setInterval(2000);
        list.add(data);
        list.add(data1);
        return list;
    }

    public static ArrayList<GestureData> sleepyGestureData() {
        ArrayList<GestureData> list = new ArrayList<>();
        GestureData data = new GestureData();
        data.setExpression(new Face("h0041"));
        data.setFootAction(new Motion(41));
        data.setSoundEffects(new Sound("a0040"));
        data.setAntennalight(new AntennaLight("on", 3));
        data.setInterval(getRandomMotion(new int[]{1, 2, 3}) * 1000);

        GestureData data1 = new GestureData();
        data1.setExpression(new Face("h0053"));
        data1.setFootAction(new Motion(46));
        data1.setAntennalight(new AntennaLight("off", 0));
        data1.setInterval(getRandomMotion(new int[]{2, 3}) * 1000);

        GestureData data2 = new GestureData();
        data2.setFootAction(new Motion("null", getRandomMotion(new int[]{55, 56}), 2));
        data2.setAntennalight(new AntennaLight("on", 6));
        data2.setInterval(getRandomMotion(new int[]{2, 3, 4}) * 1000);

        list.add(data);
        list.add(data1);
        list.add(data2);
        return list;
    }

    /**
     * 开机  startup
     *
     * @return
     */
    public static ArrayList<GestureData> startupGestureData2() {
        ArrayList<GestureData> list = new ArrayList<>();
        GestureData data = new GestureData();
        //展示主表情
        data.setExpression(new Face("h0055"));
        data.setFootAction(new Motion(63));
        data.setInterval(3000);
        list.add(data);

        GestureData data1 = new GestureData();
        data1.setFootAction(new Motion(64));
        data.setInterval(3000);
        list.add(data1);

        GestureData data2 = new GestureData();
        data2.setFootAction(new Motion(5));
        data2.setInterval(2000);
        list.add(data2);

        GestureData data3 = new GestureData();
        data3.setFootAction(new Motion(6));
        data3.setInterval(2000);
        list.add(data3);

        //TODO 待添加
        return list;
    }

    /**
     * 关机
     *
     * @return
     */
    public static ArrayList<GestureData> shutdownGestureData() {
        ArrayList<GestureData> list = new ArrayList<>();
        GestureData data = new GestureData();
        data.setExpression(new Face("h0055"));
        data.setFootAction(new Motion(0));
        data.setSoundEffects(new Sound("a0088"));
        list.add(data);
        //TODO 待添加
        return list;
    }

    /**
     * 低电量
     *
     * @return
     */
    public static ArrayList<GestureData> batteryLowerGestureData() {
        ArrayList<GestureData> list = new ArrayList<>();
        GestureData data = new GestureData();
        data.setAntennalight(new AntennaLight(MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_ON, MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_COLOR_RED));//TODO 颜色为红色
        data.setSoundEffects(new Sound("a0055"));
        data.setInterval(2000);
        //TODO 待添加
        list.add(data);

        GestureData data1 = new GestureData();
        data1.setAntennalight(new AntennaLight(MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_ON, MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_COLOR_BLACK));//TODO 颜色为红色
        //TODO 待添加
        list.add(data1);
        return list;
    }


    public static ArrayList<GestureData> startChargingGestureData() {
        ArrayList<GestureData> list = new ArrayList<>();
        GestureData data = new GestureData();
        data.setSoundEffects(new Sound("a0025"));
        data.setAntennalight(new AntennaLight(MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_ON, MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_COLOR_BLUE));//TODO  更新为蓝色,亮3秒
        data.setSoundEffects(new Sound("a0044"));
        data.setInterval(3000);
        list.add(data);

        GestureData data1 = new GestureData();
        data1.setAntennalight(new AntennaLight(MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_ON, MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_COLOR_BLACK));
        data1.setInterval(1000);
        list.add(data1);
        //TODO 待添加
        return list;
    }

    public static ArrayList<GestureData> powerOnChargingGestureData() {
        ArrayList<GestureData> list = new ArrayList<>();
        GestureData data = new GestureData();
        data.setExpression(new Face("h0059"));
        data.setFootAction(new Motion(86));
        data.setInterval(1500);
        list.add(data);

        GestureData data1 = new GestureData();
        data1.setInterval(3000);
        data1.setFootAction(new Motion(64));
        //更换成制定动作
        list.add(data1);
        //TODO 待添加
        return list;
    }


    /**
     * h0087表情，1次
     * 23动作，1次
     * 50动作，1次
     * 59动作，一直循环至表情播放结束
     * 同时天线慢速摆动，一直循环至表情结束
     * #FF8F1F，常亮
     *
     * @return
     */
    public static ArrayList<GestureData> birthdayGestureData() {
        ArrayList<GestureData> list = new ArrayList<>();
        GestureData data = new GestureData();
//        data.setExpression(new Face("h0087"));
        data.setExpression(new Face("h0204"));
        data.setEarAction(new AntennaMotion(3));
        data.setFootAction(new Motion(23));
        AntennaMotion antennaMotion = new AntennaMotion(3);
        antennaMotion.setSpeed(600);
        data.setEarAction(antennaMotion);
        data.setAntennalight(new AntennaLight("on", 1));
        data.setInterval(2000);

        GestureData data1 = new GestureData();
        data1.setFootAction(new Motion(50));
        data1.setEarAction(antennaMotion);
        data1.setInterval(2000);

        GestureData data2 = new GestureData();
        data2.setFootAction(new Motion(59));
        data.setEarAction(antennaMotion);
        data2.setInterval(2000);
        GestureData data3 = new GestureData();
        data3.setFootAction(new Motion(59));
        data3.setEarAction(antennaMotion);
        data3.setInterval(3000);

        list.add(data);
        list.add(data1);
        list.add(data2);
        list.add(data2);
        list.add(data2);
        list.add(data2);
        list.add(data2);
        list.add(data2);
        list.add(data2);
        list.add(data3);
        return list;
    }

    public static ArrayList<GestureData> birthdayWaitGestureData() {
        ArrayList<GestureData> list = new ArrayList<>();
        GestureData data = new GestureData();
        data.setExpression(new Face("h0293"));
        data.setInterval(10 * 1000);
        list.add(data);
        return list;
    }

    public static ArrayList<GestureData> birthdayBlowOutGestureData() {
        ArrayList<GestureData> list = new ArrayList<>();
        GestureData data = new GestureData();
        data.setExpression(new Face("h0294"));
        data.setInterval(11000);
        list.add(data);
        return list;
    }

    public static ArrayList<GestureData> volumeUpGestureData() {
        ArrayList<GestureData> list = new ArrayList<>();
        GestureData data = new GestureData();
        data.setExpression(new Face("44squintLfetUp"));
        data.setSoundEffects(new Sound("a0028"));
        data.setInterval(3000);
        list.add(data);
        //TODO 待添加
        return list;
    }

    public static ArrayList<GestureData> volumeDownGestureData() {
        ArrayList<GestureData> list = new ArrayList<>();
        GestureData data = new GestureData();
        data.setExpression(new Face("h0007"));
        data.setSoundEffects(new Sound("a0028"));
        data.setInterval(3000);
        list.add(data);
        //TODO 待添加
        return list;
    }

    public static ArrayList<GestureData> scanGestureData() {
        ArrayList<GestureData> list = new ArrayList<>();

        GestureData data = new GestureData();
        data.setExpression(new Face("h0019"));
        data.setExpressionTime(3);
        data.setFootAction(new Motion(6));
        data.setInterval(4000);

        list.add(data);

        GestureData data2 = new GestureData();
        data2.setExpression(new Face("h0045"));
        data2.setExpressionTime(1);
        data.setInterval(4000);

        list.add(data2);

        GestureData data3 = new GestureData();
        data3.setExpression(new Face("h0036"));
        data3.setExpressionTime(3);
        data3.setFootAction(new Motion(5));
        data3.setSoundEffects(new Sound("a0094"));
        data.setInterval(4000);

        list.add(data3);

        GestureData data4 = new GestureData();
        data4.setExpression(new Face("h0042"));
        data4.setExpressionTime(1);
        data.setInterval(4000);

        list.add(data4);

        GestureData data5 = new GestureData();
        data5.setExpression(new Face("h0042"));//左顾右盼表情
        data5.setExpressionTime(3);
        data5.setFootAction(new Motion(6));
        data5.setSoundEffects(new Sound("a0040"));
        data5.setInterval(4000);
        list.add(data5);
        //TODO 待添加
        return list;
    }

    public static ArrayList<GestureData> foundOwnerGestureData() {
        ArrayList<GestureData> list = new ArrayList<>();
        GestureData data = new GestureData();
        data.setExpression(new Face("h0006"));
        data.setExpressionTime(2);
        data.setFootAction(new Motion(7));
        data.setInterval(2000);
        list.add(data);

        GestureData data1 = new GestureData();
        data1.setFootAction(new Motion(8));
        data1.setInterval(2000);
        list.add(data1);

        GestureData data2 = new GestureData();
        data2.setFootAction(new Motion(8));
        data2.setInterval(2000);
        list.add(data2);

        GestureData data3 = new GestureData();
        data3.setExpression(new Face("h0027"));
        data3.setEarAction(new AntennaMotion(3));
        data1.setInterval(2000);
        list.add(data3);

        //TODO 待添加
        return list;
    }

    private static String[] ttsData = new String[]{"累了，让我休息休息", "好累，让我恢复下", "我需要休息下，待会回来"};

    public static ArrayList<GestureData> getHighTempTTSGestureData() {
        ArrayList<GestureData> list = new ArrayList<>();
        GestureData data = new GestureData();
        data.setTtsInfo(new Tts(getRandomString(ttsData)));
        data.setInterval(3000);
        list.add(data);
        return list;
    }

    public static ArrayList<GestureData> foundPeoGestureData() {
        ArrayList<GestureData> list = new ArrayList<>();
        GestureData data = new GestureData();
        data.setExpression(new Face("h0006"));
        data.setFootAction(new Motion(null, 63, 3));
        data.setSoundEffects(new Sound("a0032"));
        data.setAntennalight(new AntennaLight("on", 7));
        data.setInterval(6000);

        GestureData data1 = new GestureData();
        data1.setFootAction(new Motion(null, 50, 2));
        data1.setExpression(new Face("h0027"));
        data1.setSoundEffects(new Sound("a0079"));
        data1.setInterval(6000);
        list.add(data);
        list.add(data1);
        return list;
    }

    /**
     * @return
     */
    public static ArrayList<GestureData> foundNoPeoGestureData() {
        ArrayList<GestureData> list = new ArrayList<>();
        GestureData data = new GestureData();
        data.setExpression(new Face("h0058"));
        data.setFootAction(new Motion(null, 49, 2));
        data.setSoundEffects(new Sound("a0020"));
        data.setAntennalight(new AntennaLight("on", 8));
        data.setInterval(4000);

        GestureData data1 = new GestureData();
        data1.setFootAction(new Motion(null, 64, 2));
        data1.setExpression(new Face("h0031"));
        data1.setSoundEffects(new Sound("a0089"));
        data1.setInterval(5000);
        list.add(data);
        list.add(data1);
        return list;
    }


    /**
     * @return
     */
    public static ArrayList<GestureData> robotFoundPeoGestureData() {
        ArrayList<GestureData> list = new ArrayList<>();
        ArrayList<Motion> motionList = new ArrayList<>();
        Random random = new Random();
        ArrayList<Face> expressionList = new ArrayList<>();
        expressionList = initExpression2(expressionList);
        //TODO 需要更换 MontionList
        motionList = initMotionList(motionList);
        GestureData data = new GestureData();
        data.setExpression(getRandomExpression(random, expressionList));
        data.setFootAction(getRandomFoot(random, motionList));
//        data.setFootAction(new Motion(MCUCommandConsts.COMMAND_VALUE_MOTION_LEFT_ROUND,1));
        data.setExpressionTime(1);
        data.setInterval(2000);
        list.add(data);

        GestureData data1 = new GestureData();
        data1.setFootAction(new Motion(22));
        data1.setInterval(2000);
        list.add(data1);
        //TODO 待添加
        return list;
    }

    /**
     * @return
     */
    public static ArrayList<GestureData> robotStandGestureData() {
        ArrayList<GestureData> list = new ArrayList<>();
        ArrayList<Motion> motionList = new ArrayList<>();
        Random random = new Random();
        ArrayList<Face> expressionList = new ArrayList<>();
        expressionList = initExpression3(expressionList);
        motionList = initMotionList2(motionList);

        GestureData data = new GestureData();
        data.setExpression(getRandomExpression(random, expressionList));
        data.setFootAction(getRandomFoot(random, motionList));
        data.setExpressionTime(1);
        data.setInterval(2000);
        list.add(data);

        //TODO 待添加
        return list;
    }

    /**
     * 待机
     * standby
     *
     * @return
     */
    public static ArrayList<GestureData> standByGestureData() {
        ArrayList<GestureData> list = new ArrayList<>();
        GestureData data = new GestureData();
        data.setFootAction(new Motion(0));
        data.setSoundEffects(new Sound("a0050"));
        data.setAntennalight(new AntennaLight(MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_ON, MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_COLOR_WHITE));
        data.setInterval(1000);
        list.add(data);

        GestureData data1 = new GestureData();
        data1.setAntennalight(new AntennaLight(MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_ON, MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_COLOR_BLACK));
        data1.setInterval(1000);
        list.add(data1);

        //TODO 待添加
        return list;
    }

    /**
     * 唤醒(未完成)
     * assistant
     *
     * @return
     */
    public static ArrayList<GestureData> assistantGestureData() {
        ArrayList<GestureData> list = new ArrayList<>();
        GestureData data = new GestureData();
        data.setExpression(new Face("h0015"));
        data.setSoundEffects(new Sound("a0025"));
        data.setExpressionTime(1);
        data.setInterval(2000);
        list.add(data);

        GestureData data1 = new GestureData();
        data1.setExpression(new Face("h0015"));
        data1.setFootAction(new Motion(8));
        data1.setInterval(2000);
        list.add(data1);

        //TODO 待添加
        return list;
    }


    private static final String[] wakeupListenFace = new String[]{"h0015", "h0019", "h0037", "h0038", "h0059"};

    /**
     * 唤醒监听中
     *
     * @return
     */
    public static ArrayList<GestureData> wakeupListenGesture() {
        ArrayList<GestureData> list = new ArrayList<>();
        GestureData gestureData = new GestureData();
        gestureData.setExpression(new Face(wakeupListenFace[getRandomIndex(wakeupListenFace.length)]));
        //停止音效播放
        gestureData.setSoundEffects(new Sound("stop"));
        Motion motion = new Motion();
        motion.setNumber(0);
        gestureData.setFootAction(motion);
        list.add(gestureData);
        return list;
    }

    public static ArrayList<GestureData> wakeupUnderstandGesture() {
        ArrayList<GestureData> list = new ArrayList<>();
        GestureData gestureData = new GestureData();
        gestureData.setExpression(new Face("h0050"));
        Motion motion = new Motion();
        motion.setNumber(34);
        gestureData.setFootAction(motion);
        list.add(gestureData);
        return list;
    }

    public static ArrayList<GestureData> wakeupSpeakGesture() {
        ArrayList<GestureData> list = new ArrayList<>();
        GestureData gestureData = new GestureData();
        gestureData.setExpression(new Face("h0006"));
        Motion motion = new Motion();
        motion.setNumber(25);
        gestureData.setFootAction(motion);
        list.add(gestureData);
        return list;
    }

    //--------------------------传感器相关姿态 start
    //避障
    public static ArrayList<GestureData> getTofGesture() {
        ArrayList<GestureData> list = new ArrayList<>();
        // gestureData.setSoundEffects(new Sound("a0043"));
        GestureData gestureData2 = new GestureData();
        Motion leftMotion = new Motion();
        leftMotion.setNumber(21);
        leftMotion.setStepNum(2);
        gestureData2.setExpression(new Face("h0192"));
        gestureData2.setFootAction(leftMotion);
        gestureData2.setInterval(3000);
        list.add(gestureData2);
        return list;
    }


    //摇晃
    private static final String[] waggleFace = new String[]{"h0011", "h0018", "h0034", "h0053"};
    private static final String[] waggleSound = new String[]{"a0034", "a0035", "a0069"};
    private static final int[] waggleMotion = new int[]{62, 17, 18, 27, 50};

    /**
     * 摇晃姿态s
     */
    public static ArrayList<GestureData> getWaggleGesture() {
        ArrayList<GestureData> list = new ArrayList<>();
        GestureData gestureData = new GestureData();
        gestureData.setExpression(new Face(waggleFace[getRandomIndex(waggleFace.length)]));
        gestureData.setSoundEffects(new Sound(waggleSound[getRandomIndex(waggleSound.length)]));
        Motion downMotion = new Motion();
        downMotion.setNumber(waggleMotion[getRandomIndex(waggleMotion.length)]);
        gestureData.setFootAction(downMotion);
        AntennaMotion antennaMotion = new AntennaMotion(3);
        AntennaLight light = new AntennaLight("on", getRandomIndex(9));
        gestureData.setAntennalight(light);
        gestureData.setEarAction(antennaMotion);
        gestureData.setInterval(2000);
        list.add(gestureData);
        return list;
    }

    //落地
    private static final String[] fallGroundFace = new String[]{"h0054", "h0003", "h0029", "h0011"};
    private static final String[] fallGroundSound = new String[]{"a0083", "a0076", "a0064", "a0068", "a0078"};
    private static final int[] fallGroundMotion = new int[]{33, 34, 1, 2, 49, 60};

    /**
     * 落地姿态
     */
    public static ArrayList<GestureData> getFallGroundGesture() {
        ArrayList<GestureData> list = new ArrayList<>();
        GestureData gestureData = new GestureData();
        gestureData.setExpression(new Face(fallGroundFace[getRandomIndex(fallGroundFace.length)]));
        gestureData.setSoundEffects(new Sound(fallGroundSound[getRandomIndex(fallGroundSound.length)]));
        // Motion downMotion = new Motion();
        // downMotion.setNumber(fallGroundMotion[getRandomIndex(fallGroundMotion.length)]);
        // gestureData.setFootAction(downMotion);
        // AntennaMotion antennaMotion = new AntennaMotion(fallEar[getRandomIndex(fallEar.length)]);
        // AntennaLight light = new AntennaLight("on", getRandomIndex(9));
        // gestureData.setAntennalight(light);
        // gestureData.setEarAction(antennaMotion);
        gestureData.setInterval(2000);
        list.add(gestureData);
        return list;
    }

    // 倒下
    private static final String[] fallDownFace = new String[]{"h0001", "h0005", "h0011", "h0016", "h0033", "h0052"};
    private static final String[] fallDownSound = new String[]{"a0003", "a0006", "a0098", "a0086", "a0082", "a0020"};
    private static final int[] fallDownMotion = new int[]{49, 59, 17, 48};

    /**
     * 倒下姿态
     */
    public static ArrayList<GestureData> getFallDownGesture() {
        ArrayList<GestureData> list = new ArrayList<>();
        GestureData gestureData = new GestureData();
        gestureData.setExpression(new Face(fallDownFace[getRandomIndex(fallDownFace.length)]));
        gestureData.setSoundEffects(new Sound(fallDownSound[getRandomIndex(fallDownSound.length)]));
        Motion downMotion = new Motion();
        downMotion.setNumber(fallDownMotion[getRandomIndex(fallDownMotion.length)]);
        gestureData.setFootAction(downMotion);
        // AntennaMotion antennaMotion = new AntennaMotion(fallEar[getRandomIndex(fallEar.length)]);
        // AntennaLight light = new AntennaLight("on", getRandomIndex(9));
        // gestureData.setAntennalight(light);
        // gestureData.setEarAction(antennaMotion);
        gestureData.setInterval(2000);
        list.add(gestureData);
        return list;
    }

    // 单击
    private static final String[] tapFace = new String[]{"h0190"};
    // private static final String[] tapSound = new String[]{"a0124"};
    private static final int[] tapMotion = new int[]{49};

    /**
     * 单击姿态
     */
    public static ArrayList<GestureData> getTapGesture() {
        ArrayList<GestureData> list = new ArrayList<>();
        GestureData gestureData = new GestureData();
        gestureData.setExpression(new Face(tapFace[getRandomIndex(tapFace.length)]));
        // gestureData.setSoundEffects(new Sound(tapSound[getRandomIndex(tapSound.length)]));
        Motion downMotion = new Motion();
        downMotion.setNumber(tapMotion[getRandomIndex(tapMotion.length)]);
        gestureData.setFootAction(downMotion);
        // AntennaMotion antennaMotion = new AntennaMotion(fallEar[getRandomIndex(fallEar.length)]);
        AntennaLight light = new AntennaLight("on", 3);
        gestureData.setAntennalight(light);
        // gestureData.setEarAction(antennaMotion);
        gestureData.setInterval(4000);
        list.add(gestureData);
        return list;
    }

    // 双击
    private static final String[] doubleTapFace = new String[]{"h0189"};
    // private static final String[] doubleTapSound = new String[]{"a0017"};
    private static final int[] doubleTapMotion = new int[]{27};

    /**
     * 双击姿态
     */
    public static ArrayList<GestureData> getdoubleTapGesture() {
        ArrayList<GestureData> list = new ArrayList<>();
        GestureData gestureData = new GestureData();
        gestureData.setExpression(new Face(doubleTapFace[getRandomIndex(doubleTapFace.length)]));
        // gestureData.setSoundEffects(new Sound(doubleTapSound[getRandomIndex(doubleTapSound.length)]));
        Motion downMotion = new Motion();
        downMotion.setNumber(doubleTapMotion[getRandomIndex(doubleTapMotion.length)]);
        downMotion.setSpeed(3);
        downMotion.setStepNum(5);
        gestureData.setFootAction(downMotion);
        // AntennaMotion antennaMotion = new AntennaMotion(fallEar[getRandomIndex(fallEar.length)]);
        AntennaLight light = new AntennaLight("on", 6);
        gestureData.setAntennalight(light);
        // gestureData.setEarAction(antennaMotion);
        gestureData.setInterval(8000);
        list.add(gestureData);
        return list;
    }

    /**
     * 长按姿态
     */
    public static ArrayList<GestureData> getLongPressGesture() {
        ArrayList<GestureData> list = new ArrayList<>();
        GestureData timeData = new GestureData();
        timeData.setExpression(new Face(getRandomString(new String[]{"h0191"})));
        timeData.setInterval(800);

        GestureData gestureData1 = new GestureData();
        Motion motion = new Motion(17);
        motion.setSpeed(1);
        motion.setStepNum(5);
        gestureData1.setFootAction(motion);

        AntennaLight light = new AntennaLight("on", 1);
        gestureData1.setAntennalight(light);
        gestureData1.setInterval(3500);

        GestureData gestureData2 = new GestureData();
        Motion motion2 = new Motion(1);
        motion2.setSpeed(1);
        motion2.setStepNum(2);
        gestureData2.setFootAction(motion2);
        gestureData2.setInterval(3500);

        list.add(timeData);
        list.add(gestureData1);
        list.add(gestureData2);

        return list;
    }

    private static final String[] danglingFace = new String[]{"h0196"};
    private static final int[] danglingMotion = new int[]{1, 17};

    /**
     * 悬空 (天线一直转)
     * assistant
     *
     * @return
     */
    public static ArrayList<GestureData> danglingGestureData() {
        ArrayList<GestureData> list = new ArrayList<>();
        GestureData timeData = new GestureData();
        timeData.setInterval(800);
        timeData.setExpression(new Face(danglingFace[getRandomIndex(danglingFace.length)]));

        GestureData data1 = new GestureData();
        Motion motion = new Motion();
        motion.setNumber(1);
        motion.setStepNum(2);
        motion.setSpeed(1);
        data1.setFootAction(motion);
        data1.setSoundEffects(new Sound("a0076"));
        data1.setEarAction(new AntennaMotion(3));
        data1.setInterval(7000);
        AntennaLight light = new AntennaLight("on", getRandomIndex(9));
        data1.setAntennalight(light);

        GestureData data2 = new GestureData();
        Motion motion2 = new Motion();
        motion2.setNumber(17);
        motion2.setStepNum(5);
        motion2.setSpeed(1);
        data2.setFootAction(motion2);

        list.add(timeData);
        list.add(data1);
        list.add(data2);

        return list;
    }

    public static ArrayList<GestureData> danglingStopGestureData() {
        ArrayList<GestureData> list = new ArrayList<>();
        GestureData data1 = new GestureData();
//        data1.setFootAction(new Motion(9));
        Motion motion = new Motion();
        motion.setNumber(34);
        motion.setStepNum(4);
        data1.setFootAction(motion);
        data1.setExpression(new Face("h0027"));
        data1.setSoundEffects(new Sound("click"));
        AntennaMotion antennaMotion = new AntennaMotion(3);
        data1.setEarAction(antennaMotion);
        data1.setInterval(1000);
        list.add(data1);
        return list;
    }

    /**
     * 防跌落统一表情与声音等
     *
     * @return
     */
    private static GestureData getFallGesture() {
        GestureData gestureData = new GestureData();
        gestureData.setExpression(new Face(getRandomString(new String[]{"h0016", "h0011", "h0028", "h0001", "h0049"})));
        gestureData.setSoundEffects(new Sound(getRandomString(new String[]{"a0003", "a0012", "a0007", "a0019"})));
        AntennaMotion antennaMotion = new AntennaMotion(getRandomMotion(new int[]{1, 2, 3}));
        AntennaLight light = new AntennaLight("on", getRandomIndex(9));
        gestureData.setAntennalight(light);
        gestureData.setEarAction(antennaMotion);
        gestureData.setInterval(2000);
        return gestureData;
    }

    /**
     * 防跌落前进不调整动作，可以调整其他
     */
    public static ArrayList<GestureData> fallForwardGestureData() {
        ArrayList<GestureData> list = new ArrayList<>();
        GestureData data1 = getFallGesture();
        Motion motion = new Motion();
        motion.setNumber(63);
        motion.setStepNum(3);
        motion.setSpeed(2);
        data1.setFootAction(motion);
        data1.setInterval(5000);
        list.add(data1);
        return list;
    }

    /**
     * 防跌落后退不调整动作，可以调整其他
     */
    public static ArrayList<GestureData> fallBackendGestureData() {
        ArrayList<GestureData> list = new ArrayList<>();
        GestureData data1 = getFallGesture();
        Motion motion = new Motion();
        motion.setNumber(64);
        motion.setStepNum(3);
        motion.setSpeed(2);
        data1.setFootAction(motion);
        data1.setInterval(5000);
        list.add(data1);
        return list;
    }

    /**
     * 防跌落走左不调整动作，可以调整其他
     */
    public static ArrayList<GestureData> fallLeftGestureData() {
        ArrayList<GestureData> list = new ArrayList<>();
        GestureData data1 = getFallGesture();
        Motion motion = new Motion();
        motion.setNumber(5);
        motion.setStepNum(3);
        data1.setFootAction(motion);
        data1.setInterval(5000);
        list.add(data1);
        return list;
    }

    /**
     * 防跌落右走不调整动作，可以调整其他
     */
    public static ArrayList<GestureData> fallRightGestureData() {
        ArrayList<GestureData> list = new ArrayList<>();
        GestureData data1 = getFallGesture();
        Motion motion = new Motion();
        motion.setNumber(6);
        motion.setStepNum(3);
        data1.setFootAction(motion);
        data1.setInterval(5000);
        list.add(data1);
        return list;
    }

    /**
     * 防跌落
     * assistant
     *
     * @return
     */
    public static ArrayList<GestureData> fallPreventionGestureData() {
        ArrayList<GestureData> list = new ArrayList<>();
        GestureData data = new GestureData();
        data.setExpression(new Face("h0016"));
        data.setExpressionTime(1);
        data.setSoundEffects(new Sound("a0037"));
        AntennaMotion antennaMotion = new AntennaMotion(3);
        antennaMotion.setSpeed(60);
        antennaMotion.setAngle(90);
        data.setEarAction(antennaMotion);
        data.setInterval(5000);
        list.add(data);

        //TODO 待添加
        return list;
    }

    /**
     * 落地
     * assistant
     *
     * @return
     */
    public static ArrayList<GestureData> whereaboutsGestureData() {
        ArrayList<GestureData> list = new ArrayList<>();

        GestureData data = new GestureData();
        data.setExpression(new Face("h0029"));
        data.setFootAction(new Motion(7));
        data.setInterval(1500);
        list.add(data);

        GestureData data1 = new GestureData();
        data1.setFootAction(new Motion(8));
        data1.setInterval(1000);
        list.add(data1);

        GestureData data2 = new GestureData();
        data2.setFootAction(new Motion(7));
        data2.setInterval(1000);
        list.add(data2);

        //TODO 待添加
        return list;
    }

    //--------------------------传感器相关姿态 end

    public static ArrayList<GestureData> autoDisplayGestureData() {
        ArrayList<GestureData> list = new ArrayList<>();


        GestureData data3 = new GestureData();
        data3.setExpression(new Face("h0027"));
        data3.setAntennalight(new AntennaLight(MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_ON, MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_COLOR_RED));
        data3.setInterval(1000);
        list.add(data3);

        GestureData data1 = new GestureData();
        data1.setAntennalight(new AntennaLight(MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_ON, MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_COLOR_BLACK));
        data1.setInterval(1000);
        list.add(data1);

        return list;
    }

    private static final String[] face6To8 = new String[]{"h0069", "h0067", "h0068"};
    private static final String[] face8To10 = new String[]{"h0066", "h0075"};
    private static final String[] face10To12 = new String[]{"h0071", "h0070"};
    private static final String[] face12To14 = new String[]{"h0074"};
    private static final String[] face14To16 = new String[]{"h0073"};
    private static final String[] face16To18 = new String[]{"h0064"};
    private static final String[] face18To20 = new String[]{"h0072"};
    private static final String[] face20To22 = new String[]{"h0065", "h0071"};
    private static final String[] face22To6 = new String[]{"h0004", "h0039", "h0055"};

    /**
     * 24小时展示的
     *
     * @return
     */
    public static ArrayList<GestureData> hourGestureData(int hour) {
        Log.d("GestureCenter", "hourGestureData: " + hour);
        ArrayList<GestureData> list = new ArrayList<>();
        GestureData data = new GestureData();
        String faceName = null;
        int movieDuration = 3;
        switch (hour) {
            case 6:
            case 7:
                faceName = getRandomString(face6To8);
                break;
            case 8:
            case 9:
                faceName = getRandomString(face8To10);
                break;
            case 10:
            case 11:
                faceName = getRandomString(face10To12);
                break;
            case 12:
            case 13:
                faceName = getRandomString(face12To14);
                break;
            case 14:
            case 15:
                faceName = getRandomString(face14To16);
                break;
            case 16:
            case 17:
                faceName = getRandomString(face16To18);
                break;
            case 18:
            case 19:
                faceName = getRandomString(face18To20);
                break;
            case 20:
            case 21:
                faceName = getRandomString(face20To22);
                break;
            case 22:
            case 23:
            case 24:
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                faceName = getRandomString(face22To6);
                break;
        }

        switch (faceName) {
            case "h0064":
                movieDuration = 12;
                break;
            case "h0065":
                movieDuration = 13;
                break;
            case "h0066":
                movieDuration = 17;
                break;
            case "h0067":
                movieDuration = 10;
                break;
            case "h0068":
                movieDuration = 21;
                break;
            case "h0069":
                movieDuration = 12;
                break;
            case "h0070":
                movieDuration = 6;
                break;
            case "h0071":
                movieDuration = 10;
                break;
            case "h0072":
                movieDuration = 13;
                break;
            case "h0073":
                movieDuration = 10;
                break;
            case "h0074":
                movieDuration = 9;
                break;
            case "h0075":
                movieDuration = 13;
                break;
            case "h0004":
                movieDuration = 4;
                break;
            case "h0039":
                movieDuration = 11;
                break;
            case "h0055":
                movieDuration = 3;
                break;
        }
        data.setExpression(new Face(faceName));
        data.setFootAction(new Motion("null", 0));
        int interval = movieDuration - 6;
        if (interval < 0) {
            interval = 2;
        }
        data.setInterval(interval * 1000);
        data.setAntennalight(new AntennaLight("on", getRandomIndex(9)));
        list.add(data);

        GestureData data1 = new GestureData();
        data1.setAntennalight(new AntennaLight("on", getRandomIndex(9)));
        data1.setInterval(2000);
        list.add(data1);
        GestureData data2 = new GestureData();
        data2.setAntennalight(new AntennaLight("on", getRandomIndex(9)));
        AntennaMotion antennaMotion = new AntennaMotion(3);
        antennaMotion.setSpeed(600);
        antennaMotion.setAngle(45);
        data2.setEarAction(antennaMotion);
        data2.setInterval(2000);
        list.add(data2);
        GestureData data3 = new GestureData();
        data3.setAntennalight(new AntennaLight("on", getRandomIndex(9)));
        data3.setInterval(2000);
        list.add(data3);

        return list;
    }

    public static ArrayList<GestureData> hourGestureDataWithName(String faceName) {
        ArrayList<GestureData> list = new ArrayList<>();
        GestureData data = new GestureData();
        int movieDuration = 3;

        switch (faceName) {
            case "h0064":
                movieDuration = 12;
                break;
            case "h0065":
                movieDuration = 13;
                break;
            case "h0066":
                movieDuration = 17;
                break;
            case "h004cloud":
                movieDuration = 10;
                break;
            case "h0068":
                movieDuration = 21;
                break;
            case "h0069":
                movieDuration = 12;
                break;
            case "h0070":
                movieDuration = 6;
                break;
            case "h0071":
                movieDuration = 10;
                break;
            case "h0072":
                movieDuration = 13;
                break;
            case "h0073":
                movieDuration = 10;
                break;
            case "h0074":
                movieDuration = 9;
                break;
            case "h0075":
                movieDuration = 13;
                break;
            case "h0004":
                movieDuration = 4;
                break;
            case "h0039":
                movieDuration = 11;
                break;
            case "h0055":
                movieDuration = 3;
                break;
        }
        data.setExpression(new Face(faceName));
        data.setFootAction(new Motion("null", 0));
        data.setInterval((movieDuration - 6) * 1000);
        data.setAntennalight(new AntennaLight("on", getRandomIndex(9)));
        list.add(data);

        GestureData data1 = new GestureData();
        data1.setAntennalight(new AntennaLight("on", getRandomIndex(9)));
        data1.setInterval(2000);
        data1.setFootAction(new Motion("null", 34));
        list.add(data1);
        GestureData data2 = new GestureData();
        data2.setAntennalight(new AntennaLight("on", getRandomIndex(9)));
        data2.setEarAction(new AntennaMotion(3));
        data2.setInterval(2000);
        list.add(data2);
        GestureData data3 = new GestureData();
        data3.setAntennalight(new AntennaLight("on", getRandomIndex(9)));
//        data3.setSoundEffects(new Sound(""));
        data3.setInterval(2000);
        list.add(data3);

        return list;
    }

    public static ArrayList<GestureData> getAllHour() {
        ArrayList<GestureData> list = new ArrayList<>();
        String[] allHourFace = new String[]{"h0064", "h0065", "h0066", "h0067", "h0068", "h0069", "h0070", "h0071", "h0072", "h0073", "h0074", "h0075"};
        for (int i = 0; i < allHourFace.length; i++) {
            list.addAll(hourGestureDataWithName(allHourFace[i]));
        }
        return list;
    }

    /////////////////////////////////////////////////////////////////////////////////////////////////////////

    public static ArrayList<GestureData> test_GestureData1() {
        ArrayList<GestureData> list = new ArrayList<>();
        GestureData data = new GestureData();
//        data.setExpression(new Face(MCUCommandConsts.COMMAND_VALUE_FACE_ANGRY));
        data.setFootAction(new Motion(15));
        data.setInterval(3000);
        data.setAntennalight(new AntennaLight(MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_ON, MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_COLOR_RED));
        list.add(data);

        //TODO 待添加
        return list;
    }

    public static ArrayList<GestureData> test_GestureData2() {
        ArrayList<GestureData> list = new ArrayList<>();
        GestureData data = new GestureData();
//        data.setExpression(new Face(MCUCommandConsts.COMMAND_VALUE_FACE_SAD));
        data.setFootAction(new Motion(16));
        data.setInterval(3000);
        data.setAntennalight(new AntennaLight(MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_ON, MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_COLOR_GREEN));
        list.add(data);

        //TODO 待添加
        return list;
    }

    public static ArrayList<GestureData> test_GestureData3() {
        ArrayList<GestureData> list = new ArrayList<>();
        GestureData data = new GestureData();
        data.setExpression(new Face("h0001"));
        data.setFootAction(new Motion(14));
        data.setAntennalight(new AntennaLight(MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_ON, MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_COLOR_BLUE));
        data.setInterval(3000);
        list.add(data);

        //TODO 待添加
        return list;
    }

    public static ArrayList<GestureData> test_GestureData4() {
        ArrayList<GestureData> list = new ArrayList<>();
        GestureData data = new GestureData();
        data.setExpression(new Face("55wronged"));
        data.setFootAction(new Motion(13));
        data.setAntennalight(new AntennaLight(MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_ON, MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_COLOR_ORANGE));
        data.setInterval(3000);
//        data.setSoundEffects(new Sound(SoundEffect.COMMAND_VALUE_SOUND_BASHFUL));
        list.add(data);

        //TODO 待添加
        return list;
    }

    public static ArrayList<GestureData> test_GestureData5() {
        ArrayList<GestureData> list = new ArrayList<>();
        GestureData data = new GestureData();
//        data.setExpression(new Face(MCUCommandConsts.COMMAND_VALUE_FACE_BORED));
        data.setFootAction(new Motion(10));
        data.setInterval(3000);
        data.setAntennalight(new AntennaLight(MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_ON, MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_COLOR_WHITE));
//        data.setSoundEffects(new Sound(SoundEffect.COMMAND_VALUE_SOUND_BASHFUL));
        list.add(data);

        //TODO 待添加
        return list;
    }


    public static ArrayList<GestureData> test_GestureData6() {
        ArrayList<GestureData> list = new ArrayList<>();
        GestureData data = new GestureData();
//        data.setExpression(new Face(MCUCommandConsts.COMMAND_VALUE_FACE_EXCITING));
        data.setFootAction(new Motion(9));
        data.setAntennalight(new AntennaLight(MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_ON, MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_COLOR_YELLOW));
        data.setInterval(3000);
//        data.setSoundEffects(new Sound(SoundEffect.COMMAND_VALUE_SOUND_BASHFUL));
        list.add(data);

        //TODO 待添加
        return list;
    }

    public static ArrayList<GestureData> test_GestureData7() {
        ArrayList<GestureData> list = new ArrayList<>();
        GestureData data = new GestureData();
        data.setExpression(new Face("h0010"));
        data.setFootAction(new Motion(26));
        data.setAntennalight(new AntennaLight(MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_ON, MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_COLOR_PURPLE));
        data.setInterval(3000);
//        data.setSoundEffects(new Sound(SoundEffect.COMMAND_VALUE_SOUND_BASHFUL));
        list.add(data);

        //TODO 待添加
        return list;
    }

    public static ArrayList<GestureData> test_GestureData8() {
        ArrayList<GestureData> list = new ArrayList<>();
        GestureData data = new GestureData();
//        data.setExpression(new Face(MCUCommandConsts.COMMAND_VALUE_FACE_LOSE));
        data.setFootAction(new Motion(25));
        data.setAntennalight(new AntennaLight(MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_ON, MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_COLOR_CYAN));
        data.setInterval(3000);
//        data.setSoundEffects(new Sound(SoundEffect.COMMAND_VALUE_SOUND_BASHFUL));
        list.add(data);

        //TODO 待添加
        return list;
    }

    public static ArrayList<GestureData> test_GestureData0() {
        ArrayList<GestureData> list = new ArrayList<>();
        GestureData data = new GestureData();
        data.setExpression(new Face("h0027"));
        data.setFootAction(new Motion(17));
        data.setInterval(2000);
        data.setAntennalight(new AntennaLight(MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_ON, MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_COLOR_BLACK));
//        data.setSoundEffects(new Sound(SoundEffect.COMMAND_VALUE_SOUND_BASHFUL));
        list.add(data);

        //TODO 待添加
        return list;
    }


    private ArrayList<Face> expressionList = new ArrayList<>();
    private ArrayList<Sound> soundList = new ArrayList<>();
    private ArrayList<Motion> motionList = new ArrayList<>();
    private ArrayList<AntennaLight> lightList = new ArrayList<>();
    private ArrayList<AntennaMotion> earList = new ArrayList<>();
    private ArrayList<AntennaLight> lightStatusList = new ArrayList<>();
    private Random random;

    private void initData() {
        random = new Random();
    }


    private static ArrayList<AntennaLight> initStatusLight(ArrayList<AntennaLight> lightStatusList) {
        lightStatusList.add(new AntennaLight(MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_ON, MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_COLOR_RED));
        lightStatusList.add(new AntennaLight(MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_OFF, MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_COLOR_GREEN));
        return lightStatusList;

    }

    private static ArrayList<AntennaMotion> initEarList(ArrayList<AntennaMotion> earList) {
        earList.add(new AntennaMotion(3));
        earList.add(null);
        return earList;

    }

    private static ArrayList<AntennaLight> intLightList(ArrayList<AntennaLight> lightStatusList) {
        lightStatusList.add(new AntennaLight(MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_ON, MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_COLOR_RED));
        lightStatusList.add(new AntennaLight(MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_ON, MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_COLOR_GREEN));
        lightStatusList.add(new AntennaLight(MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_ON, MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_COLOR_BLUE));
        lightStatusList.add(new AntennaLight(MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_ON, MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_COLOR_ORANGE));
        lightStatusList.add(new AntennaLight(MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_ON, MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_COLOR_WHITE));
        lightStatusList.add(new AntennaLight(MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_ON, MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_COLOR_YELLOW));
        lightStatusList.add(new AntennaLight(MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_ON, MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_COLOR_PURPLE));
        lightStatusList.add(new AntennaLight(MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_ON, MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_COLOR_CYAN));
        return lightStatusList;
    }

    //Done
    private static ArrayList<Motion> initMotionList(ArrayList<Motion> motionList) {
        motionList.add(new Motion(19));
        motionList.add(new Motion(18));
        motionList.add(new Motion(20));
        motionList.add(new Motion(9));
        motionList.add(new Motion(10));
        return motionList;

    }

    //Done 找人前
    private static ArrayList<Motion> initMotionList2(ArrayList<Motion> motionList) {

        motionList.add(new Motion(29));
        motionList.add(new Motion(30));
        motionList.add(new Motion(31));
        motionList.add(new Motion(19));
        motionList.add(new Motion(25));
        motionList.add(new Motion(18));
        return motionList;

    }

    //Done random
    private static ArrayList<Motion> initMotionList3(ArrayList<Motion> motionList) {

        motionList.add(new Motion(34));
        motionList.add(new Motion(54));
        motionList.add(new Motion(48));
        motionList.add(new Motion(49));
        motionList.add(new Motion(50));
        motionList.add(new Motion(31));
        motionList.add(new Motion(32));

        return motionList;

    }

    //Done
    private static ArrayList<Motion> initMotionList4(ArrayList<Motion> motionList) {

        motionList.add(new Motion(39));
        motionList.add(new Motion(40));
        motionList.add(new Motion(41));
        motionList.add(new Motion(42));
        motionList.add(new Motion(31));
        return motionList;

    }

    //Done
    private static ArrayList<Sound> initSoundList(ArrayList<Sound> soundList) {
        soundList.add(new Sound("a0084"));
        soundList.add(new Sound("a0051"));
        soundList.add(new Sound("a0070"));
        soundList.add(new Sound("a0039"));
        soundList.add(new Sound("a0098"));
        return soundList;
    }


    private static ArrayList<Face> initExpression1(ArrayList<Face> expressionList) {
//        expressionList.add(new Face(MCUCommandConsts.COMMAND_VALUE_EXCITING));
        expressionList.add(new Face("h0033"));
        expressionList.add(new Face("h0015"));
        expressionList.add(new Face("h0041"));
        expressionList.add(new Face("h0030"));


        return expressionList;

    }

    private static ArrayList<Face> initExpression2(ArrayList<Face> expressionList) {

        expressionList.add(new Face("h0021"));
        expressionList.add(new Face("h0011"));
        expressionList.add(new Face("h0017"));
        expressionList.add(new Face("h0044"));

        return expressionList;

    }

    private static ArrayList<Face> initExpression3(ArrayList<Face> expressionList) {
        expressionList.add(new Face("h0044"));
        expressionList.add(new Face("h0042"));
        expressionList.add(new Face("h0025"));
        expressionList.add(new Face("h0024"));
        expressionList.add(new Face("h0019"));

        return expressionList;

    }

    private static Motion getRandomFoot(Random random, ArrayList<Motion> motionList) {
        int randNum = random.nextInt(motionList.size());
        Motion motion = motionList.get(randNum);
        return motionList.get(randNum);
    }

    private static Sound getRandomSoundEffect(Random random, ArrayList<Sound> soundList) {
        int randNum = random.nextInt(soundList.size());
        return soundList.get(randNum);
    }

    private static Face getRandomExpression(Random random, ArrayList<Face> expressionList) {
        int randNum = random.nextInt(expressionList.size());
        return expressionList.get(randNum);
    }


    private static AntennaLight getRandomLight(Random random, ArrayList<AntennaLight> lightList) {
        int randNum = random.nextInt(lightList.size());
        return lightList.get(randNum);
    }

    private static AntennaMotion getRandomEarList(Random random, ArrayList<AntennaMotion> earList) {
        int randNum = random.nextInt(earList.size());
        return earList.get(randNum);
    }

    public static ArrayList<GestureData> getRandomGesture() {
        ArrayList<GestureData> list = new ArrayList<>();
        Random random = new Random();
        ArrayList<Face> expressionList = new ArrayList<>();
        ArrayList<Sound> soundList = new ArrayList<>();
        ArrayList<Motion> motionList = new ArrayList<>();
        ArrayList<AntennaLight> lightList = new ArrayList<>();
        ArrayList<AntennaMotion> earList = new ArrayList<>();
        ArrayList<AntennaLight> lightStatusList = new ArrayList<>();

        earList.add(new AntennaMotion(3));
        earList.add(null);
        expressionList = initExpression1(expressionList);
        motionList = initMotionList3(motionList);
        soundList = initSoundList(soundList);
        lightList = intLightList(lightList);

        lightStatusList = initStatusLight(lightStatusList);

        GestureData data = new GestureData();
        data.setExpression(getRandomExpression(random, expressionList));
        data.setFootAction(getRandomFoot(random, motionList));
        data.setAntennalight(getRandomLight(random, lightList));
        data.setSoundEffects(getRandomSoundEffect(random, soundList));
        data.setEarAction(getRandomEarList(random, earList));
        data.setInterval(2500);
        list.add(data);
        return list;
    }

    private static int getRandomIndex(int length) {
        Random r = new Random();
        return r.nextInt(length);
    }

    private static String getRandomString(String[] group) {
        Random r = new Random();
        return group[r.nextInt(group.length)];
    }

    private static int getRandomMotion(int[] group) {
        Random r = new Random();
        return group[r.nextInt(group.length)];
    }

    private static AntennaLight getRandomAntennaLight() {
        Random r = new Random();
        AntennaLight antennaLight = new AntennaLight("on", getRandomIndex(9) + 1);
        return antennaLight;
    }

    private static AntennaMotion getRandomAntennaMotion() {
        AntennaMotion antennaMotion = new AntennaMotion(getRandomIndex(3) + 1);
        return antennaMotion;
    }

    public static ArrayList<GestureData> youPinGestures() {
        ArrayList<GestureData> list = new ArrayList<>();
        GestureData gestureData10 = new GestureData();
        gestureData10.setTtsInfo(new Tts("wow~小米的朋友们，大家好，我是乐天派桌面机器人！很高兴认识你们！"));
        gestureData10.setInterval(1000);

        GestureData gestureData11 = new GestureData();
        gestureData11.setExpression(new Face(getRandomString(new String[]{"h0015", "h0058"})));
        gestureData11.setFootAction(new Motion("null", 25, 2));
        gestureData11.setAntennalight(getRandomAntennaLight());
        gestureData11.setInterval(3000);

        GestureData gestureData12 = new GestureData();
        gestureData12.setFootAction(new Motion("null", 26, 2));
        gestureData12.setAntennalight(getRandomAntennaLight());
        gestureData12.setInterval(4000);


        GestureData gestureData20 = new GestureData();
        gestureData20.setTtsInfo(new Tts("这还是我第一次离开乐天派的办公室,见到这么多的好朋友，有点害羞~"));
        gestureData20.setInterval(500);

        GestureData gestureData21 = new GestureData();
        gestureData21.setExpression(new Face("h0027"));
        gestureData21.setFootAction(new Motion("null", 59, 5));
        gestureData21.setInterval(2500);

        GestureData gestureData22 = new GestureData();
        gestureData22.setExpression(new Face("h0049"));
        gestureData22.setFootAction(new Motion("null", 50, 1));
        gestureData22.setSoundEffects(new Sound("a0023"));
        gestureData22.setInterval(2000);

        GestureData gestureData40 = new GestureData();
        gestureData40.setTtsInfo(new Tts("我能歌善舞"));
        gestureData40.setExpression(new Face("h0036"));
        gestureData40.setFootAction(new Motion(9));
        gestureData40.setSoundEffects(new Sound("a0030"));
        gestureData40.setEarAction(new AntennaMotion(3));
        gestureData40.setAntennalight(getRandomAntennaLight());
        gestureData40.setInterval(1000);

        GestureData gestureData41 = new GestureData();
        gestureData41.setExpression(new Face("h0043"));
        gestureData41.setFootAction(new Motion(10));
        gestureData41.setAntennalight(getRandomAntennaLight());
        gestureData41.setInterval(1000);

        GestureData gestureData42 = new GestureData();
        gestureData42.setExpression(new Face(getRandomString(new String[]{"h0044", "h0045"})));
        gestureData42.setFootAction(new Motion("null", 23, 3));
        gestureData42.setSoundEffects(new Sound("a0051"));
        gestureData42.setEarAction(new AntennaMotion(3));
        gestureData42.setAntennalight(getRandomAntennaLight());
        gestureData42.setInterval(1000);


        GestureData gestureData50 = new GestureData();
        gestureData50.setTtsInfo(new Tts("我可以提醒你的日程"));
        gestureData50.setExpression(new Face("h0046"));
        gestureData50.setFootAction(new Motion("null", 24, 2));
        gestureData50.setAntennalight(getRandomAntennaLight());
        gestureData50.setInterval(2500);

        GestureData gestureData51 = new GestureData();
        gestureData51.setTtsInfo(new Tts("欣然姐，今天我们有约会哦"));
        gestureData51.setExpression(new Face("h0008"));
        gestureData51.setFootAction(new Motion("null", 17, 3));
        gestureData51.setSoundEffects(new Sound("a0029"));
        gestureData51.setInterval(3000);

        GestureData gestureData52 = new GestureData();
        gestureData52.setTtsInfo(new Tts("不见不散"));
        gestureData52.setExpression(new Face("h0006"));
        gestureData52.setFootAction(new Motion("null", 63, 1));
        gestureData52.setInterval(2000);


        GestureData gestureData60 = new GestureData();
        gestureData60.setTtsInfo(new Tts("如果你不喜欢我"));
        gestureData60.setExpression(new Face(getRandomString(new String[]{"h0010", "h0054"})));
//        gestureData60.setFootAction(new Motion(getRandomMotion(new int[]{19, 33})));
        gestureData60.setSoundEffects(new Sound("a0053"));
        gestureData60.setAntennalight(new AntennaLight("on", 7));
        gestureData60.setInterval(1000);

        GestureData gestureData61 = new GestureData();
        gestureData61.setTtsInfo(new Tts("我会有点伤心"));
        gestureData61.setExpression(new Face("h0052"));
        gestureData61.setFootAction(new Motion("null", 28, 3));
        gestureData61.setSoundEffects(new Sound("a0020"));
        gestureData61.setInterval(2500);

        GestureData gestureData62 = new GestureData();
        gestureData62.setTtsInfo(new Tts("但是你可以摸摸我的头安慰我"));
        gestureData62.setExpression(new Face("h0036"));
        gestureData62.setFootAction(new Motion(34));
        gestureData62.setSoundEffects(new Sound("a0030"));
        gestureData62.setInterval(3000);


        GestureData gestureData70 = new GestureData();
        gestureData70.setTtsInfo(new Tts("除此之外，我还能做好多事情"));
        gestureData70.setInterval(300);
        GestureData gestureData71 = new GestureData();
        gestureData71.setExpression(new Face("h0031"));
        gestureData71.setFootAction(new Motion("null", 17, 2));
        gestureData71.setAntennalight(getRandomAntennaLight());
        gestureData71.setInterval(2700);

        GestureData gestureData100 = new GestureData();
        gestureData100.setTtsInfo(new Tts("我还可以陪你过生日"));
        gestureData100.setExpression(new Face("h0015"));
        gestureData100.setInterval(1500);

        GestureData gestureData101 = new GestureData();
        gestureData101.setExpression(new Face("h0087"));
        gestureData101.setFootAction(new Motion("null", 50, 5));
        AntennaMotion antennaMotion1 = new AntennaMotion(3);
        antennaMotion1.setSpeed(600);
        antennaMotion1.setStep(3);
        gestureData101.setEarAction(antennaMotion1);
        gestureData101.setAntennalight(getRandomAntennaLight());
        gestureData101.setInterval(5000);

        GestureData gestureData110 = new GestureData();
        gestureData110.setTtsInfo(new Tts("还有很多"));
        gestureData110.setExpression(new Face("h0015"));
        gestureData110.setInterval(1000);

        GestureData gestureData111 = new GestureData();
        gestureData111.setExpression(new Face("h0068"));
        gestureData111.setInterval(800);

        GestureData gestureData1111 = new GestureData();
        gestureData1111.setFootAction(new Motion("null", 20, 3));
        gestureData1111.setInterval(4000);

        GestureData gestureData112 = new GestureData();
        gestureData112.setFootAction(new Motion("null", 44, 6));
        gestureData112.setExpression(new Face("h0074"));
        gestureData112.setAntennalight(getRandomAntennaLight());
        gestureData112.setInterval(3000);

        GestureData gestureData113 = new GestureData();
        gestureData113.setExpression(new Face("h0070"));
        gestureData113.setInterval(3000);

//        GestureData gestureData120 = new GestureData();
//        gestureData120.setTtsInfo(new Tts("包括，如果你们不理我的时候，我还可以自己玩自己……"));
//        gestureData120.setInterval(5000);

        GestureData gestureData130 = new GestureData();
        gestureData130.setTtsInfo(new Tts("我这么可爱，小哥哥小姐姐快让我的立项会顺利通过吧"));
        gestureData130.setExpression(new Face("h0002"));
        gestureData130.setFootAction(new Motion("null", 59, 2));
        gestureData130.setSoundEffects(new Sound("a0032"));
        gestureData130.setAntennalight(getRandomAntennaLight());
        gestureData130.setEarAction(new AntennaMotion(3));
        gestureData130.setInterval(4000);

        GestureData gestureData131 = new GestureData();
        gestureData131.setExpression(new Face("h0075"));
        gestureData131.setInterval(200);


        GestureData gestureData132 = new GestureData();
        gestureData132.setTtsInfo(new Tts("让更多的好朋友把我带回家"));
        gestureData132.setFootAction(new Motion(63));
        gestureData132.setInterval(2000);


        GestureData gestureData140 = new GestureData();
        gestureData140.setTtsInfo(new Tts("希望你们喜欢我，谢谢！"));
        gestureData140.setExpression(new Face("h0027"));
        gestureData140.setSoundEffects(new Sound("a0094"));
        gestureData140.setAntennalight(getRandomAntennaLight());
        gestureData140.setInterval(3000);

        GestureData gestureData141 = new GestureData();
        gestureData141.setFootAction(new Motion(11));
        gestureData141.setInterval(1500);

        GestureData gestureData142 = new GestureData();
        gestureData142.setFootAction(new Motion(0));
        gestureData142.setExpression(new Face("h0019"));
        gestureData142.setInterval(2000);

        list.add(gestureData10);
        list.add(gestureData11);
        list.add(gestureData12);
        list.add(gestureData20);
        list.add(gestureData21);
        list.add(gestureData22);
        list.add(gestureData40);
        list.add(gestureData41);
        list.add(gestureData42);
        list.add(gestureData50);
        list.add(gestureData51);
        list.add(gestureData52);
        list.add(gestureData60);
        list.add(gestureData61);
        list.add(gestureData62);
        list.add(gestureData70);
        list.add(gestureData71);
        list.add(gestureData100);
        list.add(gestureData101);
        list.add(gestureData110);
        list.add(gestureData111);
        list.add(gestureData1111);
        list.add(gestureData112);
        list.add(gestureData113);
        list.add(gestureData130);
        list.add(gestureData131);
        list.add(gestureData132);
        list.add(gestureData140);
        list.add(gestureData141);
        list.add(gestureData142);

        return list;
    }

    public static ArrayList<GestureData> getAllRandom() {
        ArrayList<GestureData> list = new ArrayList<>();
        GestureData gestureData = new GestureData();
        gestureData.setExpression(new Face(getRandomString(new String[]{"h0001", "h0002", "h0003", "h0004", "h0005", "h0006", "h0007", "h0008", "h0009", "h0010", "h0011", "h0012", "h0013", "h0014", "h0015", "h0016", "h0017", "h0018", "h0019", "h0020"})));
        gestureData.setSoundEffects(new Sound(getRandomString(new String[]{"a0001", "a0002", "a0003", "a0004", "a0005", "a0006", "a0007", "a0008", "a0009", "a0010", "a0011", "a0012", "a0013", "a0014", "a0015", "a0016", "a0017", "a0018", "a0019", "a0020"})));
        gestureData.setFootAction(new Motion(getRandomMotion(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20})));
        gestureData.setAntennalight(getRandomAntennaLight());
        gestureData.setEarAction(new AntennaMotion(getRandomMotion(new int[]{1, 2, 3})));
        gestureData.setInterval(1000);
        list.add(gestureData);
        return list;
    }

    public static ArrayList<GestureData> getNewRobotGesture() {
        ArrayList<GestureData> list = new ArrayList<>();
        GestureData gestureData = new GestureData();
        gestureData.setExpression(new Face(getRandomString(new String[]{"h0057", "h0058", "h0059", "h0060", "h0061", "h0135", "h0136", "h0137", "h0138", "h0139", "h0140", "h0141", "h0142", "h0143", "h0144", "h0145", "h0146", "h0147", "h0148", "h0149", "h0150", "h0151"})));
        int stepNum = getRandomIndex(5) + 1;
        Motion m = new Motion("null", getRandomMotion(new int[]{25, 26, 68, 21, 22, 63, 64}), stepNum);
        m.setSpeed(getRandomMotion(new int[]{1, 2}));
        gestureData.setFootAction(m);
        gestureData.setSoundEffects(new Sound(getRandomString(new String[]{"a0012", "a0013", "a0014", "a0015", "a0112", "a0113", "a0114", "a0115", "a0212", "a0213", "a0214", "a0215",})));
        gestureData.setInterval(2000 + 1000 * stepNum);
        list.add(gestureData);
        return list;
    }

    /**
     * 睡眠模式
     *
     * @return
     */
    public static ArrayList<GestureData> goToSleepGesture() {
        ArrayList<GestureData> list = new ArrayList<>();
        GestureData gestureData = new GestureData();
        gestureData.setExpression(new Face("h0039"));
        gestureData.setInterval(10000);
        list.add(gestureData);
        return list;
    }

    /**
     * 冬眠模式
     *
     * @return
     */
    public static ArrayList<GestureData> goToHibernationGesture() {
        ArrayList<GestureData> list = new ArrayList<>();
        GestureData gestureData = new GestureData();
        gestureData.setExpression(new Face("h0039"));
        gestureData.setInterval(11000);

        GestureData gestureData1 = new GestureData();
        gestureData1.setExpression(new Face("h0097"));
        gestureData1.setInterval(4000);
        list.add(gestureData);
        list.add(gestureData1);
        return list;
    }

    /**
     * 冬眠模式
     *
     * @return
     */
    public static ArrayList<GestureData> goToHibernationGesture1() {
        ArrayList<GestureData> list = new ArrayList<>();
        GestureData gestureData = new GestureData();
        gestureData.setInterval(8000);
        gestureData.setSoundEffects(new Sound("a0077"));
        list.add(gestureData);
        return list;
    }

    /**
     * 冬眠模式
     *
     * @return
     */
    public static ArrayList<GestureData> stopHibernationGesture() {
        ArrayList<GestureData> list = new ArrayList<>();
        GestureData gestureData = new GestureData();
        gestureData.setInterval(500);
        gestureData.setSoundEffects(new Sound("stop"));
        list.add(gestureData);
        return list;
    }

    /**
     * 思必驰唤醒
     *
     * @return
     */
    public static ArrayList<GestureData> getWakeupGesture() {
        ArrayList<GestureData> list = new ArrayList<>();
        GestureData gestureData = new GestureData();
        gestureData.setExpression(new Face("h0180"));
        gestureData.setFootAction(new Motion(getRandomMotion(new int[]{25, 26, 46, 47, 49})));
        gestureData.setAntennalight(getRandomAntennaLight());
        gestureData.setInterval(1000);
        list.add(gestureData);
        return list;
    }

    public static ArrayList<GestureData> getVadBeginGesture() {
        ArrayList<GestureData> list = new ArrayList<>();
        GestureData gestureData = new GestureData();
        gestureData.setExpression(new Face("h0347"));
//        gestureData.setFootAction(new Motion(getRandomMotion(new int[]{25, 26, 46, 47, 49})));
//        gestureData.setAntennalight(getRandomAntennaLight());
//        gestureData.setInterval(1000);
        list.add(gestureData);
        return list;
    }

    public static ArrayList<GestureData> getUnderstandGesture() {
        ArrayList<GestureData> list = new ArrayList<>();
        GestureData gestureData = new GestureData();
        gestureData.setExpression(new Face("h0181"));
        gestureData.setFootAction(new Motion(getRandomMotion(new int[]{25, 26, 46, 47, 49})));
        gestureData.setAntennalight(getRandomAntennaLight());
        gestureData.setInterval(1000);
        list.add(gestureData);
        return list;
    }

    public static ArrayList<GestureData> getWakeupFennuGesture() {
        ArrayList<GestureData> list = new ArrayList<>();
        GestureData gestureData = new GestureData();
        gestureData.setExpression(new Face("h0001"));
        gestureData.setFootAction(new Motion(getRandomMotion(new int[]{25, 26, 46, 47, 49})));
        gestureData.setEarAction(getRandomAntennaMotion());
        gestureData.setAntennalight(getRandomAntennaLight());
        gestureData.setInterval(1000);
        list.add(gestureData);
        return list;
    }

    /**
     * 思必驰说的时候
     *
     * @return
     */
    public static ArrayList<GestureData> getFirstSpeakingGesture() {
        ArrayList<GestureData> list = new ArrayList<>();
        GestureData gestureData = new GestureData();
        gestureData.setExpression(new Face("h0352"));
        gestureData.setFootAction(new Motion(getRandomMotion(new int[]{25, 26, 28, 55, 56})));
        gestureData.setAntennalight(getRandomAntennaLight());
        if (getRandomIndex(10) % 6 == 0) {
            gestureData.setEarAction(getRandomAntennaMotion());
        }
        gestureData.setInterval(1000);
        list.add(gestureData);
        return list;
    }

    public static ArrayList<GestureData> getSpeakingGesture() {
        ArrayList<GestureData> list = new ArrayList<>();
        GestureData gestureData = new GestureData();
        gestureData.setExpression(new Face("h0292"));
//        gestureData.setFootAction(new Motion(getRandomMotion(new int[]{25, 26, 51, 52, 55, 56})));
//        gestureData.setAntennalight(getRandomAntennaLight());
//        if (getRandomIndex(10) % 6 == 0) {
//            gestureData.setEarAction(getRandomAntennaMotion());
//        }
//        gestureData.setInterval(1000);
        list.add(gestureData);
        return list;
    }

    public static ArrayList<GestureData> getSpeakingWithAIGesture() {
        ArrayList<GestureData> list = new ArrayList<>();
        GestureData gestureData = new GestureData();
        gestureData.setExpression(new Face("h0346"));
        gestureData.setFootAction(new Motion(getRandomMotion(new int[]{25, 26, 28, 55, 56})));
        gestureData.setAntennalight(getRandomAntennaLight());
        if (getRandomIndex(10) % 6 == 0) {
            gestureData.setEarAction(getRandomAntennaMotion());
        }
        gestureData.setInterval(1000);
        list.add(gestureData);
        return list;
    }

    /**
     * 听内容给chatgpt 的时候
     *
     * @return
     */
    public static ArrayList<GestureData> getListenAiGesture(int aiModel) {
        ArrayList<GestureData> list = new ArrayList<>();
        GestureData gestureData = new GestureData();
//        gestureData.setExpression(new Face(getRandomString(new String[]{"h0083", "h0084", "h0085", "h0086"})));
        if (aiModel == 0) {
            gestureData.setExpression(new Face("h0184"));
        } else if (aiModel == 1) {
            gestureData.setExpression(new Face("h0185"));
        } else if (aiModel == 2) {
            gestureData.setExpression(new Face("h0233"));
        }
        gestureData.setFootAction(new Motion(getRandomMotion(new int[]{25, 26, 46, 47, 49})));
        gestureData.setSoundEffects(new Sound("a0119"));
        gestureData.setAntennalight(getRandomAntennaLight());
        gestureData.setInterval(1000);
        list.add(gestureData);
        return list;
    }

    public static ArrayList<GestureData> getAiUnderstandGesture(int aiModel) {
        ArrayList<GestureData> list = new ArrayList<>();
        GestureData gestureData = new GestureData();
        if (aiModel == 0) {
            gestureData.setExpression(new Face("h0183"));
        } else if (aiModel == 1) {
            gestureData.setExpression(new Face("h0186"));
        } else if (aiModel == 2) {
            gestureData.setExpression(new Face("h0228"));
        }
        gestureData.setFootAction(new Motion(getRandomMotion(new int[]{25, 26, 46, 47, 49})));
        gestureData.setSoundEffects(new Sound("a0108"));
        gestureData.setAntennalight(getRandomAntennaLight());
        gestureData.setInterval(500);
        list.add(gestureData);
        return list;
    }

    /**
     * chatgpt 说的时候
     *
     * @return
     */
    public static ArrayList<GestureData> getSpeakingAiGesture(int aiModel) {
        ArrayList<GestureData> list = new ArrayList<>();
        GestureData gestureData = new GestureData();
        if (aiModel == 0) {
            gestureData.setExpression(new Face("h0082"));
        } else if (aiModel == 1) {
            gestureData.setExpression(new Face("h0113"));
        } else if (aiModel == 2) {
            gestureData.setExpression(new Face("h0231"));
        }
        gestureData.setFootAction(new Motion(getRandomMotion(new int[]{25, 26, 46, 47, 49})));
        gestureData.setAntennalight(getRandomAntennaLight());
        if (getRandomIndex(10) % 6 == 0) {
            gestureData.setEarAction(getRandomAntennaMotion());
        }
        gestureData.setInterval(500);
        list.add(gestureData);
        return list;
    }

    /**
     * 回正的状态
     */
    public static GestureData getNormalGesture() {
        GestureData gestureData = new GestureData();
        gestureData.setExpression(new Face(getRandomString(new String[]{"h0025"})));
        gestureData.setSoundEffects(new Sound("a0063"));
        gestureData.setInterval(1000);
        return gestureData;
    }

    /**
     * 手势识别专用回正的状态
     */
    public static GestureData getNormalShoushiGesture() {
        GestureData gestureData = new GestureData();
        gestureData.setExpression(new Face(getRandomString(new String[]{"h0025"})));
        gestureData.setSoundEffects(new Sound("a0063"));
        gestureData.setInterval(2000);
        return gestureData;
    }

    /**
     * 没有识别到手势
     *
     * @return
     */
    public static GestureData canNotRecGesture() {
        GestureData gestureData = new GestureData();
        gestureData.setExpression(new Face(getRandomString(new String[]{"h0017"})));
        gestureData.setInterval(3000);
        return gestureData;
    }

    /**
     * 十帧未识别到表情
     */
    public static GestureData cannotReadFace() {
        GestureData gestureData = new GestureData();
        gestureData.setExpression(new Face(getRandomString(new String[]{"h0025"})));
        gestureData.setSoundEffects(new Sound("a0108"));
        gestureData.setInterval(2000);
        return gestureData;
    }


    public static ArrayList<GestureData> getNormalGestureList() {
        ArrayList<GestureData> list = new ArrayList<>();
        GestureData gestureData = new GestureData();
        gestureData.setExpression(new Face(getRandomString(new String[]{"h0025"})));
        gestureData.setInterval(1000);
        list.add(gestureData);
        return list;
    }


    public static GestureData getNormalNoListGesture() {
        GestureData gestureData = new GestureData();
        gestureData.setExpression(new Face("h0047"));
        gestureData.setInterval(2000);
        return gestureData;
    }

    /**
     * 第一次进入的表情
     * 0
     *
     * @retur
     */
    public static GestureData firstEnter() {
        GestureData gestureData = new GestureData();
        gestureData.setExpression(new Face("h0187"));
        gestureData.setFootAction(new Motion(17));
        gestureData.setInterval(2000L);
        return gestureData;
    }


    private static String handId0 = "0";
    private static String handId1 = "1";
    private static String handId2 = "2";
    private static String handId3 = "3";
    private static String handId4 = "4";
    private static String handId5 = "5";
    private static String handId6 = "6";
    private static String handId7 = "7";
    private static String handId8 = "8";
    private static String handId9 = "9";
    private static String handId9_1 = "9.2";
    private static String handId9_3 = "9.3";
    private static String handId9_4 = "9.4";
    private static String handId10 = "10";
    private static String handId11 = "11";
    private static String handId12 = "12";


    /**
     * 通过手势id 获取姿态
     *
     * @param handId
     * @return
     */
    public static ArrayList<GestureData> getHandGestureWithID(String handId) {
        GestureData gestureData = new GestureData();
        ArrayList<GestureData> list = new ArrayList<>();

        switch (handId) {
            case "0.0":
                list.add(HandsGestureCenter.getOkGesture());
                break;
            case "1.0":
                list.add(HandsGestureCenter.getZanGesture());
                break;
            case "2.0":
                list.add(HandsGestureCenter.getFistGesture());
                break;
            case "3.0":
                list.add(HandsGestureCenter.getYeahGesture());
                break;
            case "4.0":
                list.add(HandsGestureCenter.getShuZi5Gesture());
                break;
            case "5.0":
                list.add(HandsGestureCenter.getGunGesture());
                break;
            case "6.0":
                list.add(HandsGestureCenter.getThreeGesture());
                break;
            case "7.0":
                list.add(HandsGestureCenter.getFourGesture());
                break;
            case "8.0":
                list.add(HandsGestureCenter.getSixGesture());
                break;
            case "9.1":
                list.add(HandsGestureCenter.getUpGesture());
                break;
            case "9.2":
                list.add(HandsGestureCenter.getDownGesture());
                break;
            case "9.3":
                list.add(HandsGestureCenter.getLeftGesture());
                break;
            case "9.4":
                list.add(HandsGestureCenter.getRightGesture());
                break;
            case "10.0":
                list.add(HandsGestureCenter.getLoveGesture());
                break;
            case "11.0":
                list.add(HandsGestureCenter.getRockGesture());
                break;
            case "12.0":
                list.add(HandsGestureCenter.getHandHeartGesture());
            case "13.0":
                list.add(HandsGestureCenter.getShuZi1Gesture());
            case "14.0":
                list.add(HandsGestureCenter.getQiDaoGesture());
            case "15.0":
                list.add(HandsGestureCenter.getZuoYiGesture());
            case "16.0":
                list.add(HandsGestureCenter.getZuoBieGesture());
                break;
            case "17.0":
                list.add(HandsGestureCenter.getDissGesture());
                break;
            case "18.0":
                list.add(HandsGestureCenter.getDissGesture());
                break;
            case "19.0":
                list.add(HandsGestureCenter.getShuangShouHeart1Gesture());
                break;
            case "20.0":
                list.add(HandsGestureCenter.getShuangShouHeart2Gesture());
                break;
            case "21.0":
                list.add(HandsGestureCenter.getShuangShouHeart3Gesture());
                break;
            case "22.0":
                list.add(HandsGestureCenter.getShuZi7Gesture());
                break;
            case "23.0":
                list.add(HandsGestureCenter.getShuZi8Gesture());
                break;
            case "24.0":
                list.add(HandsGestureCenter.getShuZi9Gesture());
            case "25.0":
                list.add(HandsGestureCenter.getZuoBieGesture());
                break;
            case "99.0":
                list.add(HandsGestureCenter.getDecreaseGesture());
            case "100.0":
                list.add(HandsGestureCenter.getIncreaseGesture());
                //超过十帧未识别到表情
            case "101.0":
                list.add(HandsGestureCenter.firstEnter());
            default:
                list.add(HandsGestureCenter.getYeahGesture());
        }
        return list;
    }

    /**
     * 进入猜拳游戏动画
     *
     * @return
     */
    public static ArrayList<GestureData> getFingerGuessGesture() {
        ArrayList<GestureData> list = new ArrayList<>();
        GestureData gestureData = new GestureData();
//        gestureData.setExpression(new Face(getRandomString(new String[]{"h0088", "h0089", "h0090", "h0091"})));
        gestureData.setExpression(new Face("h0093"));
        Motion motion = new Motion();
        motion.setNumber(59);
        motion.setStepNum(2);
        gestureData.setFootAction(motion);
        gestureData.setSoundEffects(new Sound("a0028"));
        gestureData.setEarAction(new AntennaMotion(getRandomMotion(new int[]{1, 2})));
        gestureData.setAntennalight(getRandomAntennaLight());
        gestureData.setInterval(6000L);
        list.add(gestureData);
        return list;
    }

    public static GestureData getNoListFingerGuessGesture() {
        GestureData gestureData = new GestureData();
//        gestureData.setExpression(new Face(getRandomString(new String[]{"h0088", "h0089", "h0090", "h0091"})));
        gestureData.setExpression(new Face("h0093"));
        Motion motion = new Motion();
        motion.setNumber(23);
        gestureData.setFootAction(motion);
        gestureData.setSoundEffects(new Sound("a0028"));
        gestureData.setEarAction(new AntennaMotion(getRandomMotion(new int[]{1, 2})));
        gestureData.setAntennalight(new AntennaLight(MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_OFF, MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_COLOR_RED));
        gestureData.setInterval(6000L);
        return gestureData;
    }

    /**
     * 开始识别手势
     *
     * @return
     */
    public static GestureData getAIDonghuaGesture() {
        GestureData gestureData = new GestureData();
//        gestureData.setExpression(new Face(getRandomString(new String[]{"h0088", "h0089", "h0090", "h0091"})));
        gestureData.setExpression(new Face("h0310"));
        gestureData.setSoundEffects(new Sound("a0063"));
        Motion motion = new Motion();
        motion.setNumber(23);
        gestureData.setFootAction(motion);
//        gestureData.setSoundEffects(new Sound("a0028"));
        gestureData.setEarAction(new AntennaMotion(getRandomMotion(new int[]{1, 2})));
        gestureData.setAntennalight(new AntennaLight(MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_OFF, MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_COLOR_RED));
        gestureData.setInterval(4000L);
        return gestureData;
    }

    /**
     * 识别不到手势或者识别为空
     *
     * @return
     */
    public static GestureData getCanNotGetGesture() {
        GestureData gestureData = new GestureData();
//        gestureData.setExpression(new Face(getRandomString(new String[]{"h0088", "h0089", "h0090", "h0091"})));
        gestureData.setExpression(new Face("h0017"));
        gestureData.setSoundEffects(new Sound("a0087"));
        Motion motion = new Motion();
//        motion.setNumber(23);
        gestureData.setFootAction(motion);
//        gestureData.setSoundEffects(new Sound("a0028"));
        gestureData.setEarAction(new AntennaMotion(getRandomMotion(new int[]{1, 2})));
        gestureData.setAntennalight(new AntennaLight(MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_OFF, MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_COLOR_RED));
        gestureData.setInterval(4000L);
        return gestureData;
    }

    /**
     * 退出猜拳游戏
     *
     * @return
     */
    public static GestureData quitFingerGame() {
        GestureData gestureData = new GestureData();
        gestureData.setExpression(new Face("h0291"));
        Motion motion = new Motion();
        motion.setNumber(0);
        gestureData.setFootAction(motion);
        gestureData.setAntennalight(new AntennaLight(MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_OFF, MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_COLOR_RED));
        gestureData.setInterval(5000L);
        return gestureData;
    }

    public static ArrayList<GestureData> getFingerGuessResultGesture() {
        ArrayList<GestureData> list = new ArrayList<>();
        GestureData gestureData = new GestureData();
        gestureData.setExpression(new Face(getRandomString(new String[]{"h0094", "h0095", "h0096"})));
        gestureData.setFootAction(new Motion(getRandomMotion(new int[]{59})));
        gestureData.setSoundEffects(new Sound("a0028"));
        gestureData.setEarAction(new AntennaMotion(getRandomMotion(new int[]{1, 2})));
        gestureData.setAntennalight(getRandomAntennaLight());
        gestureData.setInterval(1000L);
        list.add(gestureData);
        return list;
    }


    public static ArrayList<GestureData> getH0094List() {
        ArrayList<GestureData> list = new ArrayList<>();
        GestureData gestureData = new GestureData();
        gestureData.setExpression(new Face("h0094"));
        gestureData.setFootAction(new Motion(getRandomMotion(new int[]{59})));
        gestureData.setSoundEffects(new Sound("a0028"));
        gestureData.setEarAction(new AntennaMotion(getRandomMotion(new int[]{1, 2})));
        gestureData.setAntennalight(getRandomAntennaLight());
        gestureData.setInterval(1000L);
        list.add(gestureData);
        return list;
    }

    public static ArrayList<GestureData> getH0095List() {
        ArrayList<GestureData> list = new ArrayList<>();
        GestureData gestureData = new GestureData();
        gestureData.setExpression(new Face("h0095"));
        gestureData.setFootAction(new Motion(getRandomMotion(new int[]{59})));
        gestureData.setSoundEffects(new Sound("a0028"));
        gestureData.setEarAction(new AntennaMotion(getRandomMotion(new int[]{1, 2})));
        gestureData.setAntennalight(getRandomAntennaLight());
        gestureData.setInterval(1000L);
        list.add(gestureData);
        return list;
    }

    public static ArrayList<GestureData> getH0096List() {
        ArrayList<GestureData> list = new ArrayList<>();
        GestureData gestureData = new GestureData();
        gestureData.setExpression(new Face("h0096"));
        gestureData.setFootAction(new Motion(getRandomMotion(new int[]{59})));
        gestureData.setSoundEffects(new Sound("a0028"));
        gestureData.setEarAction(new AntennaMotion(getRandomMotion(new int[]{1, 2})));
        gestureData.setAntennalight(getRandomAntennaLight());
        gestureData.setInterval(1000L);
        list.add(gestureData);
        return list;
    }

    public static GestureData getH0094() {
        GestureData gestureData = new GestureData();
        gestureData.setExpression(new Face("h0094"));
        gestureData.setFootAction(new Motion(getRandomMotion(new int[]{59})));
        gestureData.setSoundEffects(new Sound("a0028"));
        gestureData.setEarAction(new AntennaMotion(getRandomMotion(new int[]{1, 2})));
        gestureData.setAntennalight(getRandomAntennaLight());
        gestureData.setInterval(2000L);
        return gestureData;
    }

    public static GestureData getH0095() {
        GestureData gestureData = new GestureData();
        gestureData.setExpression(new Face("h0095"));
        gestureData.setFootAction(new Motion(getRandomMotion(new int[]{59})));
        gestureData.setSoundEffects(new Sound("a0028"));
        gestureData.setEarAction(new AntennaMotion(getRandomMotion(new int[]{1, 2})));
        gestureData.setAntennalight(getRandomAntennaLight());
        gestureData.setInterval(2000L);
        return gestureData;
    }

    public static GestureData getH0096() {
        GestureData gestureData = new GestureData();
        gestureData.setExpression(new Face("h0096"));
        gestureData.setFootAction(new Motion(getRandomMotion(new int[]{59})));
        gestureData.setSoundEffects(new Sound("a0028"));
        gestureData.setEarAction(new AntennaMotion(getRandomMotion(new int[]{1, 2})));
        gestureData.setAntennalight(getRandomAntennaLight());
        gestureData.setInterval(2000L);
        return gestureData;
    }

    /**
     * 任务指令，比如向前走三步
     * 同时还要执行相应的动作，动作不在此执行
     *
     * @return
     */
    public static ArrayList<GestureData> getSpecialCommandGesture() {
        ArrayList<GestureData> list = new ArrayList<>();
        GestureData gestureData = new GestureData();
        gestureData.setExpression(new Face(getRandomString(new String[]{"h0019", "h0025", "h0030", "h0031"})));
        list.add(gestureData);
        return list;
    }

    /**
     * 负向的情绪
     *
     * @return
     */
    public static ArrayList<GestureData> getSadGesture() {
        ArrayList<GestureData> list = new ArrayList<>();
        GestureData gestureData = new GestureData();
        gestureData.setExpression(new Face(getRandomString(new String[]{"h0003", "h0010", "h0021", "h0022", "h0023", "h0039"})));
        gestureData.setSoundEffects(new Sound(getRandomString(new String[]{"a0089", "a0133"})));
        gestureData.setFootAction(new Motion(getRandomMotion(new int[]{9, 10, 18, 19, 29, 30, 63})));
        gestureData.setInterval(2000);
        list.add(gestureData);
        return list;
    }

    /**
     * 正向的情绪
     *
     * @return
     */
    public static ArrayList<GestureData> getHappyGesture() {
        ArrayList<GestureData> list = new ArrayList<>();
        GestureData gestureData = new GestureData();
        gestureData.setExpression(new Face(getRandomString(new String[]{"h0006", "h0020", "h0047", "h0048", "h0049", "h0057"})));
        gestureData.setSoundEffects(new Sound(getRandomString(new String[]{"a0051", "a0092", "a0095", "a0115"})));
        gestureData.setFootAction(new Motion(getRandomMotion(new int[]{5, 6, 17, 18, 43, 59, 62, 65, 66, 67, 68})));
        gestureData.setEarAction(getRandomAntennaMotion());
        gestureData.setInterval(2000);
        list.add(gestureData);
        return list;
    }

    public static ArrayList<GestureData> danceMusicGesture() {
        ArrayList list = new ArrayList<GestureCenter>();
        GestureData gestureData = new GestureData();
        gestureData.setFootAction(new Motion(getRandomMotion(new int[]{5, 6, 55, 56, 7, 8, 24, 28, 46, 47, 59, 60})));
        gestureData.setExpression(new Face(getRandomString(new String[]{"h0006", "h0007", "h0020", "h0037", "h0042", "h0043", "h0044", "h0058"})));
//        gestureData.setEarAction(getRandomAntennaMotion());
        gestureData.setAntennalight(getRandomAntennaLight());
        gestureData.setInterval(1500);

        GestureData gestureData1 = new GestureData();
        gestureData1.setFootAction(new Motion(27, 10, 3));
        gestureData1.setExpression(new Face("h0134"));
        gestureData1.setInterval(10 * 1000);

        GestureData gestureData11 = new GestureData();
        gestureData11.setFootAction(new Motion(7, 3, 2));
        gestureData11.setInterval(5 * 1000);
        GestureData gestureData111 = new GestureData();
        gestureData111.setFootAction(new Motion(8, 3, 2));
        gestureData111.setInterval(5 * 1000);
        GestureData gestureData12 = new GestureData();
        gestureData12.setFootAction(new Motion(1, 2, 3));
        gestureData12.setInterval(4 * 1000);

        GestureData gestureData13 = new GestureData();
        gestureData13.setFootAction(new Motion(2, 2, 3));
        gestureData13.setInterval(4 * 1000);

        GestureData gestureData2 = new GestureData();
        gestureData2.setFootAction(new Motion(19, 10, 1));
        gestureData2.setInterval(4 * 1000);

        GestureData gestureData5 = new GestureData();
        gestureData5.setFootAction(new Motion(79, 10, 2));
        gestureData5.setInterval(10 * 1000);

        GestureData gestureData6 = new GestureData();
        gestureData6.setFootAction(new Motion(9, 5, 1));
        gestureData6.setInterval(3 * 1000);
        GestureData gestureData7 = new GestureData();
        gestureData7.setFootAction(new Motion(10, 5, 1));
        gestureData7.setInterval(3 * 1000);
        GestureData gestureData8 = new GestureData();
        gestureData8.setFootAction(new Motion(80, 10, 6));
        gestureData8.setInterval(8 * 1000);


//        list.add(gestureData);
        list.add(gestureData1);
        list.add(gestureData11);
        list.add(gestureData111);
        list.add(gestureData12);
        list.add(gestureData13);
        list.add(gestureData2);
//        list.add(gestureData3);
//        list.add(gestureData4);
        list.add(gestureData5);
        list.add(gestureData6);
        list.add(gestureData7);
        list.add(gestureData8);
        return list;
    }


    public static ArrayList<GestureData> miSayHello() {
        ArrayList<GestureData> list = new ArrayList<>();
        GestureData data = new GestureData();
        data.setTtsInfo(new Tts("主人回来啦，快来有人陪我玩了"));
        data.setExpression(new Face("h0006"));
        data.setFootAction(new Motion(63));
        data.setAntennalight(getRandomAntennaLight());
        data.setInterval(3000);
        list.add(data);
        return list;
    }

    public static ArrayList<GestureData> miFeelCold() {
        ArrayList<GestureData> list = new ArrayList<>();
        GestureData ttsGt = new GestureData();
        ttsGt.setTtsInfo(new Tts("shutdown"));

        GestureData data = new GestureData();
        data.setTtsInfo(new Tts("有点冷，冻死我啦，快把空调打开"));
        data.setExpression(new Face("h0051"));
        data.setFootAction(new Motion(18));
        data.setSoundEffects(new Sound("a0068"));
        data.setAntennalight(new AntennaLight("on", 8));
        data.setInterval(3000);

        GestureData data1 = new GestureData();
        data1.setFootAction(new Motion(28));
        data1.setInterval(2000);
        list.add(ttsGt);
        list.add(data);
        list.add(data1);
        return list;
    }

    public static ArrayList<GestureData> miFeelHot() {
        ArrayList<GestureData> list = new ArrayList<>();
        GestureData ttsGt = new GestureData();
        ttsGt.setTtsInfo(new Tts("shutdown"));

        GestureData data = new GestureData();
        data.setTtsInfo(new Tts("天气好热呀，快帮我降温"));
        data.setExpression(new Face("h0099"));
        data.setFootAction(new Motion(18));
        data.setSoundEffects(new Sound("a0115"));
        data.setAntennalight(new AntennaLight("on", 1));
        data.setInterval(3000);

        GestureData data1 = new GestureData();
        data1.setFootAction(new Motion(28));
        data1.setInterval(2000);
        list.add(ttsGt);
        list.add(data);
        list.add(data1);
        return list;
    }

    public static ArrayList<GestureData> miSleepMode() {
        ArrayList<GestureData> list = new ArrayList<>();
        GestureData ttsGt = new GestureData();
        ttsGt.setTtsInfo(new Tts("shutdown"));

        GestureData data = new GestureData();
        data.setTtsInfo(new Tts("主人晚安，做个好梦"));
        data.setExpression(new Face("h0055"));
        data.setInterval(3000);
        list.add(data);
        list.add(ttsGt);
        return list;
    }

    public static ArrayList<GestureData> miCookingFinish() {
        ArrayList<GestureData> list = new ArrayList<>();
        GestureData ttsGt = new GestureData();
        ttsGt.setTtsInfo(new Tts("shutdown"));

        GestureData data = new GestureData();
        data.setTtsInfo(new Tts("主人主人，快吃饭啦，吃饱饭才有力气和我玩～"));
        data.setExpression(new Face("h0100"));
        data.setFootAction(new Motion(63));
        data.setSoundEffects(new Sound("a0017"));
        data.setAntennalight(new AntennaLight("on", 3));
        data.setInterval(7000);

        GestureData data1 = new GestureData();
        data1.setFootAction(new Motion(2));
        data1.setInterval(2000);
        list.add(data1);
        list.add(data);
        list.add(ttsGt);
        return list;
    }

    public static ArrayList<GestureData> miGasAlarm() {
        ArrayList<GestureData> list = new ArrayList<>();
        GestureData data = new GestureData();
        data.setExpression(new Face("h0101"));
        data.setFootAction(new Motion("", 17, 5));
        data.setEarAction(new AntennaMotion(3));
        data.setSoundEffects(new Sound("a0015"));
        data.setAntennalight(new AntennaLight("on", 3));
        data.setInterval(3000);
        list.add(data);
        return list;
    }

    public static ArrayList<GestureData> miWaterAlarm() {
        ArrayList<GestureData> list = new ArrayList<>();
        GestureData data = new GestureData();
        data.setExpression(new Face("h0102"));
        data.setFootAction(new Motion("", 17, 5));
        data.setEarAction(new AntennaMotion(3));
        data.setSoundEffects(new Sound("a0015"));
        data.setAntennalight(new AntennaLight("on", 3));
        data.setInterval(3000);
        list.add(data);
        return list;
    }

    public static ArrayList<GestureData> miSmokeAlarm() {
        ArrayList<GestureData> list = new ArrayList<>();
        GestureData data = new GestureData();
        data.setExpression(new Face("h0103"));
        data.setFootAction(new Motion("", 17, 5));
        data.setEarAction(new AntennaMotion(3));
        data.setSoundEffects(new Sound("a0015"));
        data.setAntennalight(new AntennaLight("on", 3));
        data.setInterval(3000);
        list.add(data);
        return list;
    }

    /**
     * 低电量展示
     *
     * @return
     */
    public static ArrayList<GestureData> getLowBatteryNoticeGesture() {
        ArrayList<GestureData> list = new ArrayList<>();
        GestureData gestureData = new GestureData();
        gestureData.setExpression(new Face("h0220"));
        gestureData.setInterval(3000);
        list.add(gestureData);
        return list;
    }

    /**
     * 健身提醒姿态
     *
     * @return
     */
    public static ArrayList<GestureData> keepRemindGestureData() {
        ArrayList<GestureData> list = new ArrayList<>();

        GestureData data = new GestureData();
        data.setExpression(new Face("h0240"));
        data.setFootAction(new Motion("111", 18, 2));
        data.setSoundEffects(new Sound("a0045"));
        data.setInterval(5500);
        list.add(data);

        //TODO 待添加
        return list;
    }

    /**
     * 喝水提醒姿态
     *
     * @return
     */
    public static ArrayList<GestureData> waterRemindGestureData() {
        ArrayList<GestureData> list = new ArrayList<>();

        GestureData data = new GestureData();
        data.setExpression(new Face("h0238"));
        data.setSoundEffects(new Sound("a0010"));
        data.setInterval(5500);
        list.add(data);

        //TODO 待添加
        return list;
    }

    /**
     * 喝水提醒姿态
     *
     * @return
     */
    public static ArrayList<GestureData> siteRemindGestureData() {
        ArrayList<GestureData> list = new ArrayList<>();

        GestureData data = new GestureData();
        data.setExpression(new Face("h0241"));
        data.setFootAction(new Motion("111", 23, 2));
        data.setSoundEffects(new Sound("a0020"));
        data.setInterval(5500);
        list.add(data);

        //TODO 待添加
        return list;
    }

    /**
     * 久坐提醒
     *
     * @return
     */
    public static ArrayList<GestureData> sedRemindGestureData() {
        ArrayList<GestureData> list = new ArrayList<>();

        GestureData data = new GestureData();
        data.setExpression(new Face("h0239"));
        data.setSoundEffects(new Sound("a0024"));
        data.setFootAction(new Motion("111", 58, 2));
        data.setInterval(5500);
        list.add(data);

        //TODO 待添加
        return list;
    }

}
