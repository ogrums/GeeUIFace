package com.renhejia.robot.gesturefactory.manager;

import android.util.Log;

import com.renhejia.robot.commandlib.parser.antennalight.AntennaLight;
import com.renhejia.robot.commandlib.parser.antennamotion.AntennaMotion;
import com.renhejia.robot.commandlib.parser.face.Face;
import com.renhejia.robot.commandlib.parser.motion.Motion;
import com.renhejia.robot.commandlib.parser.sound.Sound;
import com.renhejia.robot.gesturefactory.parser.GestureData;

import java.util.ArrayList;
import java.util.Random;

/**
 * 手势识别的
 */
public class HandsGestureCenter {


    /**
     * 比ok的手势
     * 0
     *
     * @retur
     */
    protected static GestureData getOkGesture() {
        GestureData gestureData = new GestureData();
        gestureData.setExpression(new Face("h0130"));
        gestureData.setFootAction(new Motion(17));
        gestureData.setInterval(5000L);
        return gestureData;
    }


    /**
     * 第一次进入的表情
     * 0
     *
     * @retur
     */
    protected static GestureData firstEnter() {
        GestureData gestureData = new GestureData();
        gestureData.setExpression(new Face("h0187"));
        gestureData.setFootAction(new Motion(17));
        gestureData.setInterval(2000L);
        return gestureData;
    }

    /**
     * 比赞的手势
     * 1
     *
     * @return
     */
    protected static GestureData getZanGesture() {
        GestureData gestureData = new GestureData();
        gestureData.setExpression(new Face("h0117"));
        gestureData.setFootAction(new Motion(getRandomMotion(new int[]{15, 16, 18, 25, 26, 27})));
        gestureData.setInterval(4000L);
        return gestureData;
    }

    /**
     * 比拳头的手势
     * 2
     *
     * @return
     */
    protected static GestureData getFistGesture() {
        GestureData gestureData = new GestureData();
        gestureData.setExpression(new Face("h0121"));
        gestureData.setFootAction(new Motion(null, 1, 2));
        gestureData.setInterval(8000L);
        return gestureData;
    }


    /**
     * 比yeah和剪刀的手势
     * 3
     *
     * @return
     */
    protected static GestureData getYeahGesture() {
        GestureData gestureData = new GestureData();
        gestureData.setExpression(new Face("h0131"));
        Motion motion = new Motion();
        motion.setNumber(64);
        motion.setSpeed(1);
        motion.setStepNum(2);
        gestureData.setFootAction(motion);
        gestureData.setInterval(7000L);
        return gestureData;
    }

    /**
     * 比枪的手势
     * 5
     *
     * @return
     */
    protected static GestureData getGunGesture() {
        GestureData gestureData = new GestureData();
        gestureData.setExpression(new Face("h0133"));
        Motion motion = new Motion();
        motion.setSpeed(2);
        motion.setNumber(2);
        motion.setStepNum(2);
        gestureData.setFootAction(motion);
        gestureData.setInterval(6000L);
        return gestureData;
    }

    /**
     * 比布的手势
     *
     * @return
     */
    protected static GestureData getBuGesture() {
        GestureData gestureData = new GestureData();
        gestureData.setExpression(new Face(getRandomString(new String[]{"h0027", "h0037", "h0038"})));
        gestureData.setFootAction(new Motion(getRandomMotion(new int[]{15, 16, 18, 25, 26, 27})));
        gestureData.setInterval(8000L);
        return gestureData;
    }


    /**
     * 比数字三的手势
     * 6
     *
     * @return
     */
    protected static GestureData getThreeGesture() {
        GestureData gestureData = new GestureData();
        gestureData.setExpression(new Face("h0123"));
        Motion motion = new Motion();
        motion.setNumber(63);
        motion.setSpeed(5);
        gestureData.setFootAction(motion);
        gestureData.setEarAction(new AntennaMotion(3));
        gestureData.setAntennalight(new AntennaLight("on", 7));
        gestureData.setInterval(12000L);
        return gestureData;
    }

    /**
     * 比数字四的手势
     * 7
     *
     * @return
     */
    protected static GestureData getFourGesture() {
        GestureData gestureData = new GestureData();
        gestureData.setExpression(new Face("h0127"));
        gestureData.setFootAction(new Motion(getRandomMotion(new int[]{15, 16, 18, 25, 26, 27})));
        gestureData.setEarAction(new AntennaMotion(1));
        gestureData.setInterval(7000L);
        return gestureData;
    }

    /**
     * 比数字六的手势
     * 8
     *
     * @return
     */
    protected static GestureData getSixGesture() {
        GestureData gestureData = new GestureData();
        gestureData.setExpression(new Face("h0115"));
        Motion motion = new Motion();
        motion.setNumber(65);
        motion.setStepNum(3);
        gestureData.setFootAction(motion);
        gestureData.setInterval(6000L);
        return gestureData;
    }

    /**
     * 比上的手势
     * 9.1
     *
     * @return
     */
    protected static GestureData getUpGesture() {
        GestureData gestureData = new GestureData();
        gestureData.setExpression(new Face("h0120"));
        Motion motion = new Motion();
        motion.setNumber(64);
        motion.setStepNum(2);
        motion.setSpeed(2);
        gestureData.setFootAction(motion);
        gestureData.setEarAction(new AntennaMotion(3));
        gestureData.setAntennalight(new AntennaLight("on", 7));
        gestureData.setInterval(11000L);
        return gestureData;
    }

    /**
     * 比下的手势
     * 9.2
     *
     * @return
     */
    protected static GestureData getDownGesture() {
        GestureData gestureData = new GestureData();
        gestureData.setExpression(new Face("h0124"));
        Motion motion = new Motion();
        motion.setNumber(45);
        motion.setSpeed(1);
        gestureData.setFootAction(motion);
        gestureData.setInterval(6000L);
        return gestureData;
    }

    /**
     * 比左边的手势
     * 9.3
     *
     * @return
     */
    protected static GestureData getLeftGesture() {
        GestureData gestureData = new GestureData();
        gestureData.setExpression(new Face("h00125"));
        Motion motion = new Motion();
        motion.setNumber(5);
        motion.setStepNum(2);
        gestureData.setFootAction(motion);
        gestureData.setInterval(8000L);
        return gestureData;
    }

    /**
     * 比右边的手势
     * 9.4
     *
     * @return
     */
    protected static GestureData getRightGesture() {
        GestureData gestureData = new GestureData();
        gestureData.setExpression(new Face("h00126"));
        Motion motion = new Motion();
        motion.setNumber(6);
        motion.setStepNum(2);
        gestureData.setFootAction(motion);
        gestureData.setInterval(8000L);
        return gestureData;
    }

    /**
     * 比爱意的手势
     * 10
     *
     * @return
     */
    protected static GestureData getLoveGesture() {
        GestureData gestureData = new GestureData();
        gestureData.setExpression(new Face("h0118"));
        Motion motion = new Motion();
        motion.setNumber(17);
        motion.setStepNum(2);
        gestureData.setFootAction(motion);
        gestureData.setInterval(6000L);
        return gestureData;
    }

    /**
     * 比摇滚的手势
     * 11
     *
     * @return
     */
    protected static GestureData getRockGesture() {
        GestureData gestureData = new GestureData();
        gestureData.setExpression(new Face("h0128"));
        Motion motion = new Motion();
        motion.setNumber(17);
        motion.setStepNum(2);
        gestureData.setFootAction(motion);
        gestureData.setInterval(9000L);
        return gestureData;
    }

    /**
     * 比心
     * 12
     *
     * @return
     */
    protected static GestureData getHandHeartGesture() {
        GestureData gestureData = new GestureData();
        gestureData.setExpression(new Face("h0116"));
        Motion motion = new Motion();
        motion.setNumber(13);
        motion.setStepNum(1);
        gestureData.setFootAction(motion);
        gestureData.setInterval(6000L);
        return gestureData;
    }
    /**
     * 数字1
     * 13
     *
     * @return
     */
    protected static GestureData getShuZi1Gesture() {
        GestureData gestureData = new GestureData();
        gestureData.setExpression(new Face("h0311"));
        Motion motion = new Motion();
        motion.setNumber(59);
        motion.setStepNum(1);
        gestureData.setFootAction(motion);
        gestureData.setInterval(6000L);
        return gestureData;
    }

    /**
     * 数字1
     * 13
     *
     * @return
     */
    protected static GestureData getShuZi5Gesture() {
        GestureData gestureData = new GestureData();
        gestureData.setExpression(new Face("h0312"));
        Motion motion = new Motion();
        motion.setNumber(91);
        motion.setStepNum(1);
        gestureData.setFootAction(motion);
        gestureData.setInterval(5000L);
        return gestureData;
    }
    /**
     * 祈祷
     * 14
     *
     * @return
     */
    protected static GestureData getQiDaoGesture() {
        GestureData gestureData = new GestureData();
        gestureData.setExpression(new Face("h0313"));
        Motion motion = new Motion();
        motion.setNumber(17);
        motion.setStepNum(3);
        gestureData.setFootAction(motion);
        gestureData.setInterval(4000L);
        return gestureData;
    }

    /**
     * 作别
     * 12
     *
     * @return
     */
    protected static GestureData getZuoBieGesture() {
        GestureData gestureData = new GestureData();
        gestureData.setExpression(new Face("h0309"));
        Motion motion = new Motion();
        motion.setNumber(0);
        motion.setStepNum(1);
        gestureData.setFootAction(motion);
        gestureData.setInterval(8000L);
        return gestureData;
    }


    /**
     * 作别
     * 12
     *
     * @return
     */
    protected static GestureData getZuoYiGesture() {
        GestureData gestureData = new GestureData();
        gestureData.setExpression(new Face("h0316"));
        Motion motion = new Motion();
        motion.setNumber(0);
        motion.setStepNum(1);
        gestureData.setFootAction(motion);
        gestureData.setInterval(8000L);
        return gestureData;
    }
    /**
     * 数字8
     * 23
     *
     * @return
     */
    protected static GestureData getShuZi8Gesture() {
        GestureData gestureData = new GestureData();
        gestureData.setExpression(new Face("h0305"));
        Motion motion = new Motion();
        motion.setNumber(121);
        motion.setStepNum(1);
        gestureData.setFootAction(motion);
        gestureData.setInterval(8000L);
        return gestureData;
    }
    /**
     * 数字9
     * 24
     *
     * @return
     */
    protected static GestureData getShuZi9Gesture() {
        GestureData gestureData = new GestureData();
        gestureData.setExpression(new Face("h0304"));
        Motion motion = new Motion();
        motion.setNumber(59);
        motion.setStepNum(1);
        gestureData.setFootAction(motion);
        gestureData.setInterval(9000L);
        return gestureData;
    }

    /**
     * 数字7
     * 22
     *
     * @return
     */
    protected static GestureData getShuZi7Gesture() {
        GestureData gestureData = new GestureData();
        gestureData.setExpression(new Face("h0315"));
        Motion motion = new Motion();
        motion.setNumber(60);
        motion.setStepNum(1);
        gestureData.setFootAction(motion);
        gestureData.setInterval(8000L);
        return gestureData;
    }

    /**
     * Diss
     * 12
     *
     * @return
     */
    protected static GestureData getDissGesture() {
        GestureData gestureData = new GestureData();
        gestureData.setExpression(new Face("h0314"));
        Motion motion = new Motion();
        motion.setNumber(63);
        motion.setStepNum(1);
        gestureData.setFootAction(motion);
        gestureData.setInterval(8000L);
        return gestureData;
    }

    /**
     * 掌心向上
     * 12
     *
     * @return
     */
    protected static GestureData getPalmUpGesture() {
        GestureData gestureData = new GestureData();
        gestureData.setExpression(new Face("h0314"));
        Motion motion = new Motion();
        motion.setNumber(13);
        motion.setStepNum(1);
        gestureData.setFootAction(motion);
        gestureData.setInterval(8000L);
        return gestureData;
    }

    /**
     * 双手比心1
     * 19
     *
     * @return
     */
    protected static GestureData getShuangShouHeart1Gesture() {
        GestureData gestureData = new GestureData();
        gestureData.setExpression(new Face("h0308"));
        Motion motion = new Motion();
        motion.setNumber(63);
        motion.setStepNum(1);
        gestureData.setFootAction(motion);
        gestureData.setInterval(6000L);
        return gestureData;
    }


    /**
     * 双手比心2
     * 20
     *
     * @return
     */
    protected static GestureData getShuangShouHeart2Gesture() {
        GestureData gestureData = new GestureData();
        gestureData.setExpression(new Face("h0306"));
        Motion motion = new Motion();
        motion.setNumber(63);
        motion.setStepNum(1);
        gestureData.setFootAction(motion);
        gestureData.setInterval(6000L);
        return gestureData;
    }
    /**
     * 双手比心3
     * 21
     *
     * @return
     */
    protected static GestureData getShuangShouHeart3Gesture() {
        GestureData gestureData = new GestureData();
        gestureData.setExpression(new Face("h0307"));
        Motion motion = new Motion();
        motion.setNumber(63);
        motion.setStepNum(1);
        gestureData.setFootAction(motion);
        gestureData.setInterval(6000L);
        return gestureData;
    }

    protected static GestureData getIncreaseGesture() {
        GestureData gestureData = new GestureData();
        gestureData.setExpression(new Face("h0129"));
        Motion motion = new Motion();
        motion.setNumber(63);
        motion.setStepNum(3);
        motion.setSpeed(2);
        gestureData.setFootAction(motion);
        gestureData.setInterval(8000L);
        return gestureData;
    }


    protected static GestureData getDecreaseGesture() {
        GestureData gestureData = new GestureData();
        gestureData.setExpression(new Face("h0119"));
        Motion motion = new Motion();
        motion.setNumber(64);
        motion.setStepNum(3);
        motion.setSpeed(4);
        gestureData.setFootAction(motion);
        gestureData.setSoundEffects(new Sound("a0098"));
        gestureData.setInterval(4000L);
        return gestureData;
    }

    private static int getRandomIndex(int length) {
        Random r = new Random();
        return r.nextInt(length - 1);
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
