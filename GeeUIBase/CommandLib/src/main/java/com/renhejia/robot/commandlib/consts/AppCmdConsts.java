package com.renhejia.robot.commandlib.consts;

public class AppCmdConsts {

    public static final String COMMAND_TYPE_SET_ROBOT_MODE = "setRobotMode";
    public static final String COMMAND_VALUE_FACTORY_MODE_IN = "factory_in";
    public static final String COMMAND_VALUE_FACTORY_MODE_OUT = "factory_out";
    public static final String COMMAND_VALUE_UPDATE_MODE_IN = "ota_in";
    public static final String COMMAND_VALUE_UPDATE_MODE_OUT = "ota_out";

    public static final String COMMAND_VALUE_TO_PREVIOUS_MODE = "previous_mode";
    public static final String COMMAND_VALUE_CLOCK_START = "clock_start";
    public static final String COMMAND_VALUE_CLOCK_STOP = "clock_stop";

    public static final String COMMAND_VALUE_TO_SLEEP_MODE = "go_sleep";

    public static final String COMMAND_TYPE_HAND_REG= "identHandResult";
    public static final String COMMAND_TYPE_HAND_REG_IN = "10101";
    public static final String COMMAND_TYPE_HAND_REG_OUT= "10102";

    public static final  String COMMAND_VALUE_EXIT = "exit";


    public static final int COMMAND_TYPE_HAND_ID = 10001 ;
    public static final int COMMAND_ID_WAKE_UP = 10002 ;

    public static final String COMMAND_TYPE_START_AUDIO_SERVICE = "start_audio_service";
    public static final String COMMAND_TYPE_STOP_AUDIO_SERVICE = "stop_audio_service";
    public static final String COMMAND_TYPE_SHUT_DOWN_AUDIO_SERVICE = "shut_down_audio_service";
    public static final String COMMAND_CLIFF_TRIGGER = "cliff_trigger";


    //拍照：1 开始；0退出
    public static final String COMMAND_TYPE_TAKE_PHOTO= "take_photo";
    public static final int COMMAND_VALUE_EXIT_TAKE_PHOTO= 0;

    public static final String COMMAND_STOP_APP= "stop_app";

    public static final String VALUE_COMMAND_STOP_VIDEO_CALL = "stop_video_call";

    public static final String COMMAND_TYPE_OPEN_ROBOT_REMINDER = "openRobotReminder";
    public static final String COMMAND_TYPE_OPEN_PREVIEW_ROBOT_REMINDER = "openPreviewRobotReminder";

    public static final String COMMAND_TYPE_CLOSE_ROBOT_REMINDER = "closeRobotReminder";
    public static final String COMMAND_VALUE_REMINDER_WATER = "water";
    public static final String COMMAND_VALUE_REMINDER_SED = "sed";
    public static final String COMMAND_VALUE_REMINDER_SITE = "site";
    public static final String COMMAND_VALUE_REMINDER_KEEP = "keep";
    public static final String COMMAND_VALUE_REMINDER_OPEN_FACE_SEARCH = "open_search";
    public static final String COMMAND_VALUE_REMINDER_CLOSE_FACE_SEARCH = "close_search";



}
