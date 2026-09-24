package com.renhejia.robot.gesturefactory.manager;

import com.renhejia.robot.commandlib.consts.MCUCommandConsts;
import com.renhejia.robot.commandlib.parser.antennalight.AntennaLight;
import com.renhejia.robot.commandlib.parser.antennamotion.AntennaMotion;
import com.renhejia.robot.commandlib.parser.face.Face;
import com.renhejia.robot.commandlib.parser.motion.Motion;
import com.renhejia.robot.commandlib.parser.sound.Sound;
import com.renhejia.robot.gesturefactory.parser.GestureData;

import java.util.ArrayList;
import java.util.Random;

public class GameResultGestureCenter {

    /**
     * 平局的表情
     *
     * @return
     */
    public static ArrayList<GestureData> getDrawGesture() {
        ArrayList<GestureData> list = new ArrayList<>();
        GestureData gestureData = new GestureData();
        gestureData.setExpression(new Face(getRandomString(new String[]{"h0003", "h0052"})));
        Motion motion = new Motion();
        motion.setNumber(28);
        motion.setStepNum(2);
        gestureData.setFootAction(motion);
        gestureData.setSoundEffects(new Sound("a0008"));
        gestureData.setAntennalight(getRandomAntennaLight());
        gestureData.setInterval(8000);
        list.add(gestureData);
        return list;
    }

    public static GestureData getNoListDrawGesture() {
        GestureData gestureData = new GestureData();
        gestureData.setExpression(new Face("h0201"));
        Motion motion = new Motion();
        motion.setNumber(18);
        motion.setStepNum(2);
        gestureData.setFootAction(motion);
        gestureData.setSoundEffects(new Sound("a0008"));
        gestureData.setAntennalight(new AntennaLight(MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_OFF, MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_COLOR_RED));
        gestureData.setInterval(8000);
        return gestureData;
    }

    /**
     * 向左移动
     *
     * @return
     */
    public static GestureData getMoveLeftGesture() {
        GestureData gestureData = new GestureData();
//        gestureData.setExpression(new Face("h0042"));
        Motion motion = new Motion();
        motion.setNumber(5);
        motion.setStepNum(4);
        gestureData.setFootAction(motion);
        gestureData.setSoundEffects(new Sound("a0008"));
        gestureData.setAntennalight(new AntennaLight(MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_OFF, MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_COLOR_RED));
        gestureData.setInterval(5000);
        return gestureData;
    }

    /**
     * 向左移动
     *
     * @return
     */
    public static GestureData getGunMoveLeftGesture() {
        GestureData gestureData = new GestureData();
//        gestureData.setExpression(new Face("h0298"));
        Motion motion = new Motion();
        motion.setNumber(5);
        motion.setStepNum(4);
        gestureData.setFootAction(motion);
        gestureData.setSoundEffects(new Sound("a0008"));
        gestureData.setAntennalight(new AntennaLight(MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_OFF, MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_COLOR_RED));
        gestureData.setInterval(5000);
        return gestureData;
    }

    /**
     * 向右移动
     *
     * @return
     */
    public static GestureData getMoveRightGesture() {
        GestureData gestureData = new GestureData();
//        gestureData.setExpression(new Face("h0044"));
        Motion motion = new Motion();
        motion.setNumber(6);
        motion.setStepNum(4);
        gestureData.setFootAction(motion);
        gestureData.setSoundEffects(new Sound("a0008"));
        gestureData.setAntennalight(new AntennaLight(MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_OFF, MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_COLOR_RED));
        gestureData.setInterval(5000);
        return gestureData;
    }

    /**
     * 向右移动
     *
     * @return
     */
    public static GestureData getGunMoveRightGesture() {
        GestureData gestureData = new GestureData();
//        gestureData.setExpression(new Face("h0298"));
        Motion motion = new Motion();
        motion.setNumber(6);
        motion.setStepNum(4);
        gestureData.setFootAction(motion);
        gestureData.setSoundEffects(new Sound("a0008"));
        gestureData.setAntennalight(new AntennaLight(MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_OFF, MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_COLOR_RED));
        gestureData.setInterval(5000);
        return gestureData;
    }

    /**
     * 向前移动
     *
     * @return
     */
    public static GestureData getMoveFrontGesture() {
        GestureData gestureData = new GestureData();
//        gestureData.setExpression(new Face("h0208"));
        Motion motion = new Motion();
        motion.setNumber(63);
        motion.setStepNum(4);
        gestureData.setFootAction(motion);
        gestureData.setAntennalight(new AntennaLight(MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_OFF, MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_COLOR_RED));
        gestureData.setInterval(5000);
        return gestureData;
    }


    public static GestureData getGunMoveFrontGesture() {
        GestureData gestureData = new GestureData();
//        gestureData.setExpression(new Face("h0298"));
        Motion motion = new Motion();
        motion.setNumber(63);
        motion.setStepNum(4);
        gestureData.setFootAction(motion);
        gestureData.setAntennalight(new AntennaLight(MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_OFF, MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_COLOR_RED));
        gestureData.setInterval(5000);
        return gestureData;
    }

    /**
     * 向后移动
     *
     * @return
     */
    public static GestureData getMoveBackGesture() {
        GestureData gestureData = new GestureData();
//        gestureData.setExpression(new Face("h0209"));
        Motion motion = new Motion();
        motion.setNumber(64);
        motion.setStepNum(4);
        gestureData.setFootAction(motion);
        gestureData.setAntennalight(new AntennaLight(MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_OFF, MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_COLOR_RED));
        gestureData.setInterval(5000);
        return gestureData;
    }

    public static GestureData getGunMoveBackGesture() {
        GestureData gestureData = new GestureData();
//        gestureData.setExpression(new Face("h0298"));
        Motion motion = new Motion();
        motion.setNumber(64);
        motion.setStepNum(4);
        gestureData.setFootAction(motion);
        gestureData.setAntennalight(new AntennaLight(MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_OFF, MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_COLOR_RED));
        gestureData.setInterval(5000);
        return gestureData;
    }

    public static GestureData getShiBieFistGesture() {
        GestureData gestureData = new GestureData();
        Motion motion = new Motion();
        motion.setNumber(67);
        motion.setStepNum(3);
        gestureData.setFootAction(motion);
        gestureData.setAntennalight(new AntennaLight(MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_OFF, MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_COLOR_RED));
        gestureData.setInterval(2000);
        return gestureData;
    }

    public static GestureData quitGame() {
        GestureData gestureData = new GestureData();
//        gestureData.setExpression(new Face("h0291"));
        Motion motion = new Motion();
        motion.setNumber(0);
        gestureData.setFootAction(motion);
        gestureData.setAntennalight(new AntennaLight(MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_OFF, MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_COLOR_RED));
        return gestureData;
    }

    //
    public static GestureData getgameOverGesture() {
        GestureData gestureData = new GestureData();
        Motion motion = new Motion();
//        gestureData.setExpression(new Face("h0299"));
        motion.setNumber(67);
        motion.setStepNum(3);
        gestureData.setFootAction(motion);
        gestureData.setSoundEffects(new Sound("a0089"));
        gestureData.setInterval(1000);
        return gestureData;
    }

    //猜拳结束
    public static ArrayList<GestureData> getFistGameOverGesture() {
        ArrayList<GestureData> list = new ArrayList<>();

        GestureData gestureData = new GestureData();
        Motion motion = new Motion();
        gestureData.setExpression(new Face("h0299"));
        motion.setNumber(2);
        motion.setStepNum(1);
        gestureData.setFootAction(motion);
        gestureData.setSoundEffects(new Sound("a0067"));
        gestureData.setInterval(5000);

        GestureData gestureData1 = new GestureData();
        Motion motion1 = new Motion();
        gestureData1.setExpression(new Face("h0299"));
        motion1.setNumber(121);
        motion1.setStepNum(1);
        gestureData1.setFootAction(motion1);
        gestureData1.setSoundEffects(new Sound("a0067"));
        gestureData1.setInterval(5000);
        list.add(gestureData1);

        return list;
    }

    //猜拳结束
    public static ArrayList<GestureData> getPalmGameOverGesture() {
        ArrayList<GestureData> list = new ArrayList<>();
        GestureData gestureData = new GestureData();
        Motion motion = new Motion();
        gestureData.setExpression(new Face("h0302"));
        motion.setNumber(2);
        motion.setStepNum(1);
        gestureData.setFootAction(motion);
        gestureData.setSoundEffects(new Sound("a0067"));
        gestureData.setInterval(5000);
        list.add(gestureData);
        GestureData gestureData1 = new GestureData();
        Motion motion1 = new Motion();
        gestureData1.setExpression(new Face("h0302"));
        motion1.setNumber(121);
        motion1.setStepNum(1);
        gestureData1.setFootAction(motion1);
        gestureData1.setSoundEffects(new Sound("a0067"));
        gestureData1.setInterval(5000);
        list.add(gestureData1);
        return list;
    }

    public static ArrayList<GestureData> getGunGameOverGesture() {
        ArrayList<GestureData> list = new ArrayList<>();
        GestureData gestureData = new GestureData();
        Motion motion = new Motion();
        gestureData.setExpression(new Face("h0297"));
        motion.setNumber(2);
        motion.setStepNum(1);
        gestureData.setFootAction(motion);
        gestureData.setSoundEffects(new Sound("a0067"));
        gestureData.setInterval(5000);
        list.add(gestureData);

        GestureData gestureData1 = new GestureData();
        Motion motion1 = new Motion();
        gestureData1.setExpression(new Face("h0297"));
        motion1.setNumber(121);
        motion1.setStepNum(1);
        gestureData1.setFootAction(motion1);
        gestureData1.setSoundEffects(new Sound("a0067"));
        gestureData1.setInterval(5000);
        list.add(gestureData1);
        return list;
    }

    //识别到拳头
    public static GestureData getFistGesture() {
        GestureData gestureData = new GestureData();
        Motion motion = new Motion();
//        gestureData.setExpression(new Face("h0300"));
        motion.setNumber(67);
        motion.setStepNum(3);
        gestureData.setFootAction(motion);
        gestureData.setSoundEffects(new Sound("a0089"));
        gestureData.setInterval(1000);
        return gestureData;
    }

    /**
     * 赢的表情
     */
    public static ArrayList<GestureData> getWinGesture() {
        ArrayList<GestureData> list = new ArrayList<>();
        GestureData gestureData = new GestureData();
        gestureData.setExpression(new Face(getRandomString(new String[]{"h0006", "h0001", "h0027"})));
        Motion motion = new Motion();
        motion.setNumber(getRandomMotion(new int[]{17, 52, 65, 66}));
        motion.setStepNum(2);
        gestureData.setFootAction(motion);
        gestureData.setAntennalight(getRandomAntennaLight());
        gestureData.setEarAction(new AntennaMotion(3));
        gestureData.setSoundEffects(new Sound(getRandomString(new String[]{"a0004", "a0048"})));
        gestureData.setInterval(8000);
        list.add(gestureData);
        return list;
    }

    public static GestureData getNoListWinGesture() {
        GestureData gestureData = new GestureData();
        gestureData.setExpression(new Face("h0002"));
        Motion motion = new Motion();
        motion.setNumber(11);
        motion.setStepNum(2);
        gestureData.setFootAction(motion);
        gestureData.setAntennalight(new AntennaLight(MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_ON, MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_COLOR_GREEN));
        gestureData.setEarAction(new AntennaMotion(3));
        gestureData.setSoundEffects(new Sound(getRandomString(new String[]{"a0004", "a0048"})));
        gestureData.setInterval(8000);
        return gestureData;
    }

    /**
     * 输的表情
     */

    public static ArrayList<GestureData> getLossGesture() {
        ArrayList<GestureData> list = new ArrayList<>();
        GestureData gestureData = new GestureData();
        gestureData.setExpression(new Face(getRandomString(new String[]{"h0011", "h0010"})));
        Motion motion = new Motion();
        motion.setNumber(getRandomMotion(new int[]{44, 45, 15, 16}));
        motion.setStepNum(2);
        gestureData.setFootAction(motion);
        gestureData.setAntennalight(getRandomAntennaLight());
        gestureData.setInterval(8000);
        list.add(gestureData);
        return list;
    }

    public static GestureData getNolistLossGesture() {
        GestureData gestureData = new GestureData();
        gestureData.setExpression(new Face("h0023"));
        Motion motion = new Motion();
        motion.setNumber(16);
        motion.setStepNum(2);
        gestureData.setFootAction(motion);
        gestureData.setAntennalight(new AntennaLight(MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_ON, MCUCommandConsts.COMMAND_VALUE_ANTENNA_LIGHT_COLOR_RED));
        gestureData.setInterval(8000);
        return gestureData;
    }

    /**
     * 没看到手势的表情
     */

    public static ArrayList<GestureData> getNoHandGesture() {
        ArrayList<GestureData> list = new ArrayList<>();
        GestureData gestureData = new GestureData();
        gestureData.setExpression(new Face("h0047"));
        gestureData.setFootAction(new Motion(getRandomMotion(new int[]{21, 22})));
        gestureData.setAntennalight(getRandomAntennaLight());
        gestureData.setInterval(2000);
        list.add(gestureData);
        return list;
    }

    public static GestureData getNoListNoHandGesture() {
        GestureData gestureData = new GestureData();
        gestureData.setExpression(new Face("h0047"));
        gestureData.setFootAction(new Motion(getRandomMotion(new int[]{21, 22})));
        gestureData.setAntennalight(getRandomAntennaLight());
        gestureData.setInterval(2000);
        return gestureData;
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
        AntennaLight antennaLight = new AntennaLight("on", getRandomIndex(9));
        return antennaLight;
    }
}
