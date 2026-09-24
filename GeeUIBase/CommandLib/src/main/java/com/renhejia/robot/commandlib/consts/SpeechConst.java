package com.renhejia.robot.commandlib.consts;

public class SpeechConst {

    public static final String ROBOT_STATUS_SILENCE = "avatar.silence";
    public static final String ROBOT_STATUS_LISTENING = "avatar.listening";
    public static final String ROBOT_STATUS_UNDERSTANDING = "avatar.understanding";
    public static final String ROBOT_STATUS_SPEAKING = "avatar.speaking";
    public static final String ROBOT_STATUS_DEFAULT = "avatar.silence";

    public final static String COMMAND_WAKE_UP_STATUS = "wakeup_status";
    public final static String COMMAND_WAKE_UP_DOA = "wakeup_doa";
    public final static String COMMAND_ENTER_CHAT_GPT = "enter_chat_gpt";
    public final static String COMMAND_QUIT_CHAT_GPT = "quit_chat_gpt";
    public final static String COMMAND_CHAT_GPT_SPEAKING = "chat_gpt_speaking";
    public final static String COMMAND_CHAT_GPT_LISTENING = "chat_gpt_listening";
    public final static String COMMAND_ADD_CLOCK = "add_clock";
    public final static String COMMAND_REMOVE_CLOCK = "remove_clock";
    public final static String COMMAND_ADD_REMINDER = "add_reminder";
    public final static String COMMAND_ADD_NOTICE = "add_notice";
    public final static String COMMAND_MOVE = "rhj.controller.navigation"; //Const.RhjController.move
    public final static String COMMAND_TURN = "rhj.controller.turn";
    //    public static final String congraturationBirthday = "rhj.controller.congraturation";
    public static final String ShutDown = "DUI.System.Shutdown";
    public static final String Reboot = "DUI.System.Reboot";
    /**
     * 声音调整
     */
    public static final String SetVolume = "DUI.MediaController.SetVolume";
    /**
     * 声音调整
     */
    public static final String VOLUME_UP = "+";
    public static final String VOLUME_DOWN = "-";
    public static final String VOLUME_PERCENTAGE = "%";
    public static final String VOLUME_MAX = "max";
    public static final String VOLUME_MIN = "min";
    /**
     * 进入手势控制
     */
    public final static String COMMAND_HAND_ENTER = "hand_enter";
    /**
     * 退出手势控制
     */
    public final static String COMMAND_HAND_EXIT = "hand_exit";
    /**
     * 进入猜拳
     */
    public final static String COMMAND_FINGER_GUEESS_ENTER = "finger_guess_enter";
    /**
     * 退出猜拳
     */
    public final static String COMMAND_FINGER_GUEESS_EXIT = "finger_guess_exit";
    /**
     * 人体识别
     */
    public static final String COMMAND_BODY_ENTER = "rhj.controller.body.enter";
    public static final String COMMAND_BODY_EXIT = "rhj.controller.body.exit";
    /**
     * 找人
     */
    public static final String COMMAND_SEARCH_PEOPLE = "rhj.controller.searchPeople";

    public final static String COMMAND_SAD = "motion_sad";
    public final static String COMMAND_HAPPY = "motion_happy";

//    public static final String move = "rhj.controller.navigation";//?direction=#方向#&number=#数值#
//    public static final String turn = "rhj.controller.turn";//?direction=#方向#&number=#数值#

    // public static final String COMMAND_BIRTHDAY = "rhj.controller.congraturation";
    public static final String COMMAND_OPEN_APP = "rhj.controller.open";//打开应用
    public static final String COMMAND_CLOSE_APP = "rhj.controller.close";//打开应用


    public static final String COMMAND_OPEN_WEATHER = "rhj.controller.openweather"; //打开天气
    public static final String COMMAND_OPEN_THINGS = "rhj.controller.openthings"; //打开事件倒计时
    public static final String COMMAND_OPEN_STOCK = "rhj.controller.openstock"; //打开股票
    public static final String COMMAND_OPEN_FANS = "rhj.controller.openmyFans"; //打开我的粉丝
    public static final String COMMAND_OPEN_INFORMATION = "rhj.controller.openinformation"; //打开实时资讯
    public static final String COMMAND_OPEN_TIME = "rhj.controller.opentime"; //打开时间
    public static final String COMMAND_OPEN_MESSAGE = "rhj.controller.openmessage"; //打开消息提醒
    public static final String COMMAND_OPEN_BOT = "rhj.controller.openBot"; //机器人模式
    public static final String COMMAND_OPEN_SLEEPSTATE = "rhj.controller.openSleep"; //睡眠状态
    public static final String COMMAND_TAKE_PHOTO = "rhj.controller.takephoto"; //拍照
    public static final String COMMAND_OPEN_FOLLOW_ME = "rhj.controller.followme"; //人体跟踪

    public static final String COMMAND_CLOSE_SPEECH_AUDIO = "close_speech_audio"; //关闭思必驰正在播放的一切声音
    public static final String COMMAND_CLOSE_SPEECH_AUDIO_AND_LISTENING = "close_speech_audio_and_listen"; //关闭思必驰正在播放的一切声音

    public final static String COMMAND_SPEECH_SPLIT = "_===_";
    public final static String EXTRA_SPEECH_ALARM = "speech_alarm";
    public final static String EXTRA_ALARM = "alarm";
    public static final String SHUT_DOWN_AUDIO_SERVICE ="shut_down_audio_service";
    public static final String START_ALARM_ACTION ="start_alarm_action";
    public static final String STOP_ALARM_ACTION ="stop_alarm_action";
}
