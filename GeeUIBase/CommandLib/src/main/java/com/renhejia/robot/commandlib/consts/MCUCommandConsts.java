package com.renhejia.robot.commandlib.consts;

/**
 * @author liujunbin
 */
public class MCUCommandConsts {

    /**
     * ======================================== 命令类型 ========================================
     */

    /**
     * 2. 动作控制
     */
    public static final String COMMAND_TYPE_MOTION = "controlMotion";

    /**
     * 3. 天线控制
     */
    public static final String COMMAND_TYPE_ANTENNA_MOTION = "controlAntennaMotion";


    /**
     * 4. 天线光控制
     */
    public final static String COMMAND_TYPE_ANTENNA_LIGHT = "controlAntennaLight";
//
//
//    /**
//     *  5. 表情
//     */
//    public static final String COMMAND_TYPE_FACE = "controlFace";
//
//
//    /**
//     *  6. 声音控制
//     */
//    public static final String COMMAND_TYPE_SOUND = "controlSound";
//
//    /**
//     *  7.人脸特征提取完成
//     */
//    public static final  String COMMAND_TYPE_ADD_FACE_FEATURE = "addFaceFeature";
//
//    /**
//     * 8. 更新wifi配置
//     */
//    public final static String COMMAND_TYPE_UPDATE_WIFI_CONFIG = "updateWifiConfig";
//
//    /**
//     * 9. 更新ble配置
//     */
//    public final static String COMMAND_TYPE_UPDATE_BLE_CONFIG = "updateBleConfig";
//
//    /**
//     * 10. 更新显示模式配置
//     */
//    public final static String COMMAND_TYPE_UPDATE_SHOW_MODE_CONFIG = "updateShowModeConfig";
//
//    /**
//     * 11. 更新睡眠模式配置
//     */
//    public final static String COMMAND_TYPE_UPDATE_SLEEP_MODE_CONFIG = "updateSleepModeConfig";
//
//    /**
//     * 12/25. 更新唤醒配置
//     */
//    public final static String COMMAND_TYPE_UPDATE_AWAKE_CONFIG = "updateAwakeConfig";
//
//    /**
//     * 13. 更新通用配置
//     */
//    public final static String COMMAND_TYPE_UPDATE_GENERAL_CONFIG = "updateGeneralConfig";
//
//    /**
//     * 14. 更新日期配置
//     */
//    public final static String COMMAND_TYPE_UPDATE_DATE_CONFIG = "updateDateConfig";
//
//    /**
//     * 15. OTA升级配置
//     */
//    public final static String COMMAND_TYPE_UPDATE_OTA_CONFIG = "updateOtaConfig";
//
//    /**
//     * 16. OTA升级配置
//     */
//    public final static String COMMAND_TYPE_OTA_UPGRADE = "otaUpgrade";
//
//    /**
//     * 17. 重置机器
//     */
//    public static final  String COMMAND_TYPE_RESET_DEVICE_INFO = "resetDeviceInfo";
//
//    /**
//     * 19. 控制音量
//     */
//    public static final  String COMMAND_TYPE_CONTROL_SOUND_VOLUME = "controlSoundVolume";
//
//
//    /**
//     * 20. 演示模式显示切换
//     */
//    public static final  String COMMAND_TYPE_CONTROL_DISPLAY_MODE = "controlDisplayMode";
//
//    /**
//     * 21. 演示模式自动动作
//     */
//    public static final  String COMMAND_TYPE_CONTROL_AUTO_MODE = "controlAutoMode";
//    public static final  String COMMAND_VALUE_CONTROL_AUTO_MODE_FOLLOW = "follow";
//    public static final  String COMMAND_VALUE_CONTROL_AUTO_MODE_EXT_FOLLOW = "exitFollow";
//    public static final  String COMMAND_VALUE_CONTROL_AUTO_MODE_RANDOM = "random";
//
//    /**
//     * 22. 演示模式自动动作
//     * (TODO 暂未使用)
//     */
//    public static final  String COMMAND_TYPE_CONTROL_UPDATE_GESTURE = "updateGesture";
//
//    /**
//     * 23. 闹钟信息
//     */
//    public static final  String COMMAND_TYPE_UPDATE_CLOCK_DATA = "updateClockData";
//
//    /**
//     * 24. 更新粉丝配置
//     */
//    public final static String COMMAND_TYPE_UPDATE_FANS_CONFIG = "updateFansConfig";
//
//    /**
//     * 26. 更换显示模块
//     */
//    public final static String COMMAND_TYPE_CHANGE_SHOW_MODULE = "changeShowModule";
//
//    /**
//     * 27. 更新事件倒计时
//     */
//    public final static String COMMAND_TYPE_UPDATE_EVENT_DATA = "updateEventData";
//
//    /**
//     * 27. 开始绑定米家
//     */
//    public final static String COMMAND_TYPE_START_BIND_MIJIA= "startBindMijia";


    /**
     * 电源控制
     */
    public static final String COMMAND_TYPE_POWER_CONTROL = "powerControl";

    /**
     * 重启MCU
     */
    public static final String COMMAND_TYPE_RESET_MCU = "resetMcu";

    /**
     * 控制陀螺仪
     */
    public static final String COMMAND_TYPE_GYROSCOPE = "controllGyroscope";

    /**
     * 启动陀螺仪
     */
    public static final String COMMAND_TYPE_START_GYROSCOPE = "start_gyroscope";

    /**
     * 关闭陀螺仪
     */
    public static final String COMMAND_TYPE_STOP_GYROSCOPE = "stop_gyroscope";

    /**
     * 天线光控制
     */
    public static final String COMMAND_TYPE_ANTENNA_LIGHT_VALUE_ON = "on";
    public static final String COMMAND_TYPE_ANTENNA_LIGHT_VALUE_OFF = "off";

    /**
     * Video call
     */
    public static final String COMMAND_TYPE_TRTC = "trtc";
    public static final String COMMAND_TYPE_EXIT_TRTC = "exitTrtc";

    public static final String COMMAND_TYPE_UPDATE_WAKEUP_CONFIG = "updateAwakeConfig";

    public static final String COMMAND_TYPE_TRTC_MONITOR = "trtcMonitor";
    public static final String COMMAND_TYPE_EXIT_TRTC_MONITOR = "exitTrtcMonitor";

    public static final String COMMAND_TYPE_TRTC_TRANSFORM = "trtcTransform";
    public static final String COMMAND_TYPE_EXIT_TRTC_TRANSFORM = "exitTrtcTransform";



    /**
     * 天线光控制
     */
    public static final String COMMAND_TYPE_OPEN_MCU = "open_mcu";

    public static final String COMMAND_TYPE_CLOSE_MCU = "close_mcu";
    /**
     * 进入工厂模式
     */
    public static final String COMMAND_TYPE_ENTER_FACTORY = "enter_factory";

    /**
     * 退出工厂模式
     */
    public static final String COMMAND_TYPE_EXIT_FACTORY = "exit_factory";

    /**
     *
     */
    public final static String COMMAND_VALUE_ANTENNA_MOTION = "turn";
    public static final String COMMAND_VALUE_ANTENNA_MOTION_TURN = "turn";
    public static final String COMMAND_VALUE_ANTENNA_MOTION_MTURN = "mturn";
    public static final String COMMAND_VALUE_ANTENNA_MOTION_STURN = "sturn";
    public static final String COMMAND_VALUE_ANTENNA_MOTION_SETSTRAIGHT = "setStraight";


    /**
     *
     */
    public static final String COMMAND_VALUE_ANTENNA_MOTION_DIY = "diy";


    /**
     * ======================================== 声音类型 ================ start ========================
     */

    /**
     * 失落
     */
    public static final String COMMAND_VALUE_SOUND_LOSE = "lose";

    /**
     * 生气
     */
    public static final String COMMAND_VALUE_SOUND_ANGRY = "angry";

    /**
     * 搞怪
     */
    public static final String COMMAND_VALUE_SOUND_FUNNY = "funny";

    /**
     * 愤怒
     */
    public static final String COMMAND_VALUE_SOUND_ANGER = "anger";

    /**
     * 哭泣
     */
    public static final String COMMAND_VALUE_SOUND_CRY = "cry";

    /**
     * 撒娇
     */
    public static final String COMMAND_VALUE_SOUND_SPOILED = "spoiledChild";

    /**
     * 开心
     */
    public static final String COMMAND_VALUE_SOUND_HAPPY = "happy";

    /**
     * 苦笑
     */
    public static final String COMMAND_VALUE_SOUND_WRY_SMILE = "wrySmile";

    /**
     * 伤心
     */
    public static final String COMMAND_VALUE_SOUND_SAD = "sad";


    public static final String COMMAND_VALUE_SOUND_AVOIDANCE = "avoidance";
    public static final String COMMAND_VALUE_SOUND_CLICK = "click";
    public static final String COMMAND_VALUE_SOUND_MISTAKE = "mistake";
    public static final String COMMAND_VALUE_SOUND_FINISH = "finish";
    public static final String COMMAND_VALUE_SOUND_FIND_PEOPLE = "findPerson";
    public static final String COMMAND_VALUE_SOUND_CLOCK = "clock";
    public static final String COMMAND_VALUE_SOUND_SHUT_DOWN = "shutdown";
    public static final String COMMAND_VALUE_SOUND_STARTUP = "startUp";
    public static final String COMMAND_VALUE_SOUND_LOW_POWER = "lowPower";
    public static final String COMMAND_VALUE_SOUND_CHARGE = "charge";
    public static final String COMMAND_VALUE_SOUND_MAINTOFACE = "mainToFace";
    public static final String COMMAND_VALUE_SOUND_DIZZINESS = "dizziness";
    public static final String COMMAND_VALUE_SOUND_WAKE = "wake";
    public static final String COMMAND_VALUE_SOUND_SLEEP = "sleep";
    public static final String COMMAND_VALUE_SOUND_PANT = "pant";
    public static final String COMMAND_VALUE_SOUND_TIRED = "tired";
    public static final String COMMAND_VALUE_SOUND_FATIGUE = "fatigue";
    public static final String COMMAND_VALUE_SOUND_SHY = "shy";
    public static final String COMMAND_VALUE_SOUND_SURPRISE = "surprise";
    public static final String COMMAND_VALUE_SOUND_FEAR = "fear";
    public static final String COMMAND_VALUE_SOUND_PANIC = "panic";
    public static final String COMMAND_VALUE_SOUND_CONFUSE = "confuse";
    public static final String COMMAND_VALUE_SOUND_DISGUSTED = "disgusted";
    public static final String COMMAND_VALUE_SOUND_HATE = "hate";
    public static final String COMMAND_VALUE_SOUND_COMFORTABLE = "comfortable";
    public static final String COMMAND_VALUE_SOUND_SNEAKPEEK = "sneakPeek";
    public static final String COMMAND_VALUE_SOUND_RESPOND = "respond";


    /**
     * ======================================== 声音类型 ================ end ========================
     */


    /**
     * ======================================== 音效类型 ================ start ========================
     */

    /**
     * 生日
     */
    public static final String COMMAND_VALUE_SOUND_BIRTHDAY = "birthday";

    public static final String COMMAND_AUDIO_TURN_AROUND = "audio_turn_around";

    /**
     * ======================================== 音效类型 ================ end ========================
     */


    /**
     *  ======================================== 表情类型 ========================================
     */

    /**
     * 苦笑
     */
    public static final String COMMAND_VALUE_FACE_WRY_SMILE = "wrySmile";

    /**
     * 生气
     */
    public static final String COMMAND_VALUE_FACE_ANGRY = "angry";

    /**
     * 伤心
     */
    public static final String COMMAND_VALUE_FACE_SAD = "sad";

    /**
     * 愤怒
     */
    public static final String COMMAND_VALUE_FACE_ANGER = "anger";

    /**
     * 无聊
     */
    public static final String COMMAND_VALUE_FACE_BORED = "bored";

    /**
     * 兴奋
     */
    public static final String COMMAND_VALUE_FACE_EXCITING = "exciting";

    /**
     * 哭泣
     */
    public static final String COMMAND_VALUE_FACE_CRY = "cry";

    /**
     * 失落
     */
    public static final String COMMAND_VALUE_FACE_LOSE = "lose";

    /**
     * 高兴
     */
    public static final String COMMAND_VALUE_FACE_HAPPY = "happy";

    /**
     * 高兴
     */
    public static final String COMMAND_VALUE_FACE_STAND = "stand_yellow";

    /**
     * 生日
     */
    public final static String COMMAND_VALUE_BIRTHDAY = "HappyBirthday_Loop";
    /**
     * 生日
     */
    public static final String COMMAND_VALUE_BIRTHDAY2 = "birthday2";

    public static final String COMMAND_VALUE_COMMONWINK = "commonWink";
    public static final String COMMAND_VALUE_BIG_SMALL_EYE = "BigSmallEye";
    public static final String COMMAND_VALUE_SINGLE_BLINK = "singleBlink";
    public static final String COMMAND_VALUE_PEEP = "peep";
    public static final String COMMAND_VALUE_SQUINT = "squint";
    public static final String COMMAND_VALUE_SINGLE_EXPECT = "expect";
    public static final String COMMAND_VALUE_GLANCE_LEFT_RIGHT = "glanceLeftRight";
    public static final String COMMAND_VALUE_SQUINT_RIGHT_UP = "squintRightUp";
    public static final String COMMAND_VALUE_SQUINT_LEFT_UP = "squintLfetUp";
    public static final String COMMAND_VALUE_SQUINT_RIGHT_DOWN = "squintRightDown";
    public static final String COMMAND_VALUE_SQUINT_LEFT_DOWN = "squintLeftDown";
    public static final String COMMAND_VALUE_SQUINT_LOOK_DOWN = "lookDown";
    public static final String COMMAND_VALUE_CONFUSE = "confuse";
    public static final String COMMAND_VALUE_SHAKE_HEAD = "shakeHead";

    public static final String COMMAND_VALUE_THINK = "think";
    public static final String COMMAND_VALUE_BORED = "bored";
    public static final String COMMAND_VALUE_LISTEN_LEFT = "listenLeft";
    public static final String COMMAND_VALUE_LISTEN_RIGHT = "listenRight";
    public static final String COMMAND_VALUE_LISTEN_HAPPY = "happy";
    public static final String COMMAND_VALUE_BIG_LAUGH = "bigLaugh";
    public static final String COMMAND_VALUE_EXCITING = "exciting";
    public final static String COMMAND_VALUE_LOVE = "h0027";
    public static final String COMMAND_VALUE_WRONGED = "wronged";
    public static final String COMMAND_VALUE_FROWN = "frown";
    public static final String COMMAND_VALUE_LOSE = "lose";
    public static final String COMMAND_VALUE_SAD = "sad";
    public static final String COMMAND_VALUE_CRY = "cry";
    public static final String COMMAND_VALUE_ASHAMED = "ashamed";
    public static final String COMMAND_VALUE_UNWEL = "unwell";

    public static final String COMMAND_VALUE_PAIN = "pain";
    public static final String COMMAND_VALUE_SORRY = "sorry";
    public static final String COMMAND_VALUE_FURIOUS = "furious";
    public static final String COMMAND_VALUE_RESIST = "resist";
    public static final String COMMAND_VALUE_SHUT_UP = "shutUp";
    public static final String COMMAND_VALUE_ENVY = "envy";
    public static final String COMMAND_VALUE_ARROGNT = "arrogant";
    public static final String COMMAND_VALUE_ANGER = "anger";
    public static final String COMMAND_VALUE_SUPRISE = "surprise";
    public static final String COMMAND_VALUE_BARBIQ = "barbieQ";
    public static final String COMMAND_VALUE_SUSPECT = "suspect";
    public static final String COMMAND_VALUE_FEAR = "fear";
    public static final String COMMAND_VALUE_PANTING = "panting";
    public static final String COMMAND_VALUE_YAWN = "yawn";
    public static final String COMMAND_VALUE_WEAK_UP = "wakeUp";
    public static final String COMMAND_VALUE_SLEEP = "sleep";
    public static final String COMMAND_VALUE_SLEEP_OPEN_EYE = "sleepOpenEye";
    public static final String COMMAND_VALUE_DIZZINESS = "dizziness";
    public static final String COMMAND_VALUE_TREMBINE = "trembline";
    public static final String COMMAND_VALUE_CLOCK = "clock";
    public static final String COMMAND_VALUE_PHOTO = "photo";
    public static final String COMMAND_VALUE_WUNAI = "haveNoChoice";


    /**
     *  ======================================== 动作类型 ========================================
     */

    /**
     * 向前
     */
    public static final String COMMAND_VALUE_MOTION_FORWARD = "forward";

    /**
     * 向后
     */
    public static final String COMMAND_VALUE_MOTION_BACKEND = "backend";

    /**
     * 向左
     */
    public static final String COMMAND_VALUE_MOTION_LEFT = "left";

    /**
     * 向右
     */
    public static final String COMMAND_VALUE_MOTION_RIGHT = "right";

    /**
     * 向左转
     */
    public static final String COMMAND_VALUE_MOTION_LEFT_ROUND = "leftRound";

    /**
     * 向右转
     */
    public static final String COMMAND_VALUE_MOTION_RIGHT_ROUND = "rightRound";

    /**
     * 回正
     */
    public static final String COMMAND_VALUE_MOTION_SET_STRAIGHT = "setStraight";

    /**
     * 转圈
     */
    public static final String COMMAND_VALUE_MOTION_TURN_ROUND = "turnRound";

    /**
     * 撒娇
     */
    public static final String COMMAND_VALUE_MOTION_PETTISH = "pettish";

    /**
     * 生气
     */
    public static final String COMMAND_VALUE_MOTION_ANGRY = "angry";

    /**
     * 奔跑
     */
    public static final String COMMAND_VALUE_MOTION_RUN = "run";

    /**
     * 奔跑
     */
    public static final String COMMAND_VALUE_MOTION_CHEERS = "cheers";

    /**
     * 疲惫
     */
    public static final String COMMAND_VALUE_MOTION_TRIED = "tried";

    /**
     * 抖腿
     */
    public static final String COMMAND_VALUE_MOTION_SHAKE_LEG = "shakeLeg";

    /**
     *  ======================================== 动作类型 ========================================
     */

    /**
     * 天线灯开
     */
    public static final String COMMAND_VALUE_ANTENNA_LIGHT_ON = "on";

    /**
     * 天线灯关
     */
    public static final String COMMAND_VALUE_ANTENNA_LIGHT_OFF = "off";

    /**
     * 天线闪烁
     */
    public static final String COMMAND_VALUE_ANTENNA_LIGHT_TWINKLE = "twinkle";

    /**
     * 天线闪烁
     */
    public static final int COMMAND_VALUE_ANTENNA_LIGHT_COLOR_RED = 1;
    public static final int COMMAND_VALUE_ANTENNA_LIGHT_COLOR_GREEN = 2;
    public static final int COMMAND_VALUE_ANTENNA_LIGHT_COLOR_BLUE = 3;
    public static final int COMMAND_VALUE_ANTENNA_LIGHT_COLOR_ORANGE = 4;
    public static final int COMMAND_VALUE_ANTENNA_LIGHT_COLOR_WHITE = 5;
    public static final int COMMAND_VALUE_ANTENNA_LIGHT_COLOR_YELLOW = 6;
    public static final int COMMAND_VALUE_ANTENNA_LIGHT_COLOR_PURPLE = 7;
    public static final int COMMAND_VALUE_ANTENNA_LIGHT_COLOR_CYAN = 8;
    public static final int COMMAND_VALUE_ANTENNA_LIGHT_COLOR_BLACK = 9;


    /**
     * 天线旋转
     */
    public static final int COMMAND_VALUE_ANTENNA_MOTION_3 = 3;


}
