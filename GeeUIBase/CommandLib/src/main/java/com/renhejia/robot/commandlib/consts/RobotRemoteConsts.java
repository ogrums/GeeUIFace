package com.renhejia.robot.commandlib.consts;

public class RobotRemoteConsts {

    /**
     * ======================================== 命令类型 ========================================
     */

    /**
     *  2. 动作控制
     */
    public static final String COMMAND_TYPE_MOTION = "controlMotion";

    /**
     *  3. 天线控制
     */
    public static final String COMMAND_TYPE_ANTENNA_MOTION = "controlAntennaMotion";

    /**
     * 4. 天线光控制
     */
    public final static String COMMAND_TYPE_ANTENNA_LIGHT = "controlAntennaLight";

    /**
     *  5. 表情
     */
    public static final String COMMAND_TYPE_FACE = "controlFace";
    /**
     *  5. 表情
     */
    public static final String COMMAND_TYPE_SHOW_TIME = "showTIme";

    /**
     *  6. 声音控制
     */
    public static final String COMMAND_TYPE_SOUND = "controlSound";

    /**
     *  7.人脸特征提取完成
     */
    public static final  String COMMAND_TYPE_ADD_FACE_FEATURE = "addFaceFeature";

    /**
     * 8. 更新wifi配置
     */
    public final static String COMMAND_TYPE_UPDATE_WIFI_CONFIG = "updateWifiConfig";

    /**
     * 9. 更新ble配置
     */
    public final static String COMMAND_TYPE_UPDATE_BLE_CONFIG = "updateBleConfig";

    /**
     * 10. 更新显示模式配置
     */
    public final static String COMMAND_TYPE_UPDATE_SHOW_MODE_CONFIG = "updateShowModeConfig";

    /**
     * 11. 更新睡眠模式配置
     */
    public final static String COMMAND_TYPE_UPDATE_SLEEP_MODE_CONFIG = "updateSleepModeConfig";

    /**
     * 12/25. 更新唤醒配置
     */
    public final static String COMMAND_TYPE_UPDATE_AWAKE_CONFIG = "updateAwakeConfig";

    /**
     * 13. 更新通用配置
     */
    public final static String COMMAND_TYPE_UPDATE_GENERAL_CONFIG = "updateGeneralConfig";

    /**
     * 14. 更新日期配置
     */
    public final static String COMMAND_TYPE_UPDATE_DATE_CONFIG = "updateDateConfig";

    /**
     * 15. OTA升级配置
     */
    public final static String COMMAND_TYPE_UPDATE_OTA_CONFIG = "updateOtaConfig";

    /**
     * 16. OTA升级配置
     */
    public final static String COMMAND_TYPE_OTA_UPGRADE = "otaUpgrade";

    /**
     * 17. 重置机器
     */
    public static final  String COMMAND_TYPE_RESET_DEVICE_INFO = "resetDeviceInfo";

    /**
     * 19. 控制音量
     */
    public static final  String COMMAND_TYPE_CONTROL_SOUND_VOLUME = "controlSoundVolume";


    /**
     * 20. 演示模式显示切换
     */
    public static final  String COMMAND_TYPE_CONTROL_DISPLAY_MODE = "controlDisplayMode";

    /**
     * 21. 演示模式自动动作
     */
    public static final  String COMMAND_TYPE_CONTROL_AUTO_MODE = "controlAutoMode";
    public static final  String COMMAND_VALUE_CONTROL_AUTO_MODE_FOLLOW = "follow";
    public static final  String COMMAND_VALUE_CONTROL_AUTO_MODE_EXT_FOLLOW = "exitFollow";
    public static final  String COMMAND_VALUE_CONTROL_AUTO_MODE_RANDOM = "random";

    /**
     * 22. 演示模式自动动作
     * (TODO 暂未使用)
     */
    public static final  String COMMAND_TYPE_CONTROL_UPDATE_GESTURE = "updateGesture";

    /**
     * 23. 闹钟信息
     */
    public static final  String COMMAND_TYPE_UPDATE_CLOCK_DATA = "updateClockData";

    /**
     * 24. 更新粉丝配置
     */
    public final static String COMMAND_TYPE_UPDATE_FANS_CONFIG = "updateFansConfig";

    /**
     * 26. 更换显示模块
     */
    public final static String COMMAND_TYPE_CHANGE_SHOW_MODULE = "changeShowModule";

    /**
     * 27. 更新事件倒计时
     */
    public final static String COMMAND_TYPE_UPDATE_EVENT_DATA = "updateEventData";

    /**
     * 27. 开始绑定米家
     */
    public final static String COMMAND_TYPE_START_BIND_MIJIA= "startBindMijia";

    /**
     * 28. 更新电池模式
     */
    public final static String COMMAND_TYPE_UPDATE_BATTERY_MODE_CONFIG = "updateBatteryModeConfig";

    /**
     * 28. 更新亮度
     */
    public final static String COMMAND_TYPE_CONTROL_BRIGHTNESS= "controlBrightnessVolume";

    /**
     * 28. 重启
     */
    public final static String COMMAND_TYPE_REBOOT = "reboot";

    /**
     * 28. 关机
     */
    public final static String COMMAND_TYPE_SHUTDOWN = "shutdown";

    /**
     * 关闭舵机引擎
     */
    public final static String COMMAND_TYPE_SHUTDOWN_STEERING_ENGINE = "ShutDownSteeringEngine";

    /**
     * 99. 关闭应用
     */
    public final static String COMMAND_TYPE_CLOSE_APP= "closeApp";

    public final static String COMMAND_VALUE_CLOSE_REMINDER = "closeReminder";

    /**
     * 99. 关闭目标应用
     */
    public final static String COMMAND_TYPE_CLOSE_TARGET_APP= "close_target_app";


    /**
     * OTA升级
     */
    public final static String COMMAND_TYPE_OTA = "otaUpgrade";

    /**
     *
     */
    public final static String COMMAND_SET_APP_MODE = "set_app_mode";
    /**
     *
     */
    public final static String COMMAND_SHOW_TEXT = "show_text";

    /**
     *
     */
    public final static String COMMAND_HIDE_TEXT = "hide_text";

    /**
     *
     */
    public final static String COMMAND_SHOW_CHARGING = "show_charging";

    /**
     *
     */
    public final static String COMMAND_HIDE_CHARGING = "hide_charging";

    /**
     *
     */
    public final static String COMMAND_SHOW_ALL = "show_all";

    /**
     *
     */
    public final static String COMMAND_HIDE_ALL = "hide_all";


    /**
     * 锁定全局状态栏文字控制
     */
    public final static String COMMAND_LOCK_CONTROL_TEXT = "lock_control_text";

    /**
     * 全局状态栏文字
     */
    public final static String COMMAND_LOCK_CONTROL_FULL_TEXT = "lock_control_full_text";

    /**
     * 全局状态栏文字
     */
    public final static String COMMAND_LOCK_CONTROL_SPLIT = "--";

    /**
     * 全局状态栏文字
     */
    public final static String COMMAND_LOCK_CONTROL_NULL = "null";

    /**
     * 开启音效
     */
    public final static String COMMAND_OPEN_AE = "ltp123";

    /**
     * 关闭音效
     */
    public final static String COMMAND_CLOSE_AE = "ltp456";
    /**
     *
     */
    public final static String COMMAND_SHOW_CHARGING_ICON = "showChargeIcon";
    /**
     *
     */
    public final static String COMMAND_HIDE_CHARGING_ICON = "hideChargeIcon";

    /**
     * 拍照
     */
    public final static String COMMAND_CONTROL_TAKE_PHOTO = "controlTakePhoto";

    /**
     * 打开开发者选项
     */
    public final static String COMMAND_CONTROL_OPEN_DEVELOP_OPTIONS = "openDevelopOptions";

    /**
     * 关闭开发者选项
     */
    public final static String COMMAND_CONTROL_CLOSE_DEVELOP_OPTIONS = "closeDevelopOptions";

    /**
     * 应用中心安装更新
     */
    public static final String COMMAND_TYPE_UPDATE_DEVICE_APP_MODE = "updateDeviceAppMode";

    /**
     * 陀螺仪初始化
     */
    public static final String COMMAND_TYPE_CONTROL_GYROSCOPE = "controllGyroscope";

    /**
     * 更新提醒，喝水，坐姿
     */
    public static final String COMMAND_TYPE_UPDATE_REMIND_INFO_DATA = "updateRemindInfoData";

    /**
     * 更新番茄钟
     */
    public static final String COMMAND_TYPE_UPDATE_TOMATO_CLOCK = "updateTomatoClockConfig";

    /**
     * 更新冥想
     */
    public static final String COMMAND_TYPE_UPDATE_MEDITATION_CONFIG = "updateMeditationConfig";

    public static final  String COMMAND_UPDATE_DEVICE_TIME_ZONE = "updateDeviceTimeZone";
    /**
     *
     */
    public static final  String COMMAND_UPDATE_REAL_BATTERY = "updateRealBattery";
    /**
     *
     */
    public static final  String COMMAND_UPDATE_AUTOMATIC_RECHARGE_CONFIG = "updateAutomaticRechargeConfig";

//    /**
//     * 更新wifi配置
//     */
//    public final static String COMMAND_TYPE_UPDATE_WIFI_CONFIG = "updateWifiConfig";
//
//    /**
//     * 更新ble配置
//     */
//    public final static String COMMAND_TYPE_UPDATE_BLE_CONFIG = "updateBleConfig";
//
//    /**
//     * 更新显示模式配置
//     */
//    public final static String COMMAND_TYPE_UPDATE_SHOW_MODE_CONFIG = "updateShowModeConfig";
//    /**
//     * 绑定到米家
//     */
//    public final static String COMMAND_TYPE_BIND_MIIOT = "startBindMijia";


//    /**
//     * 更新睡眠模式配置
//     */
//    public final static String COMMAND_TYPE_UPDATE_SLEEP_MODE_CONFIG = "updateSleepModeConfig";
//
//    /**
//     * 更新睡眠模式配置
//     */
//    public final static String COMMAND_TYPE_UPDATE_AWAKE_CONFIG = "updateAwakeConfig";
//
//    /**
//     * 更新通用配置
//     */
//    public final static String COMMAND_TYPE_UPDATE_GENERAL_CONFIG = "updateGeneralConfig";
//
//    /**
//     * 更新日期配置
//     */
//    public final static String COMMAND_TYPE_UPDATE_DATE_CONFIG = "updateDateConfig";

    /**
     * 更新日历配置
     */
    public final static String COMMAND_TYPE_UPDATE_CALENDAR_CONFIG = "updateCalendarConfig";

//    /**
//     * 更新粉丝配置
//     */
//    public final static String COMMAND_TYPE_UPDATE_FANS_CONFIG = "updateFansConfig";

    /**
     * 更新倒计时配置
     */
    public final static String COMMAND_TYPE_UPDATE_COUNT_DOWN_CONFIG = "updateCountDownConfig";

    /**
     * 更新股票事件信息
     */
    public final static String COMMAND_TYPE_UPDATE_STOCK_EVENT_DATA = "updateStockEventData";

    /**
     * 更新显示模式
     */
    public final static String COMMAND_TYPE_APP_DISPLAY_SWITCH_CONFIG = "updateDisplaySwitchConfig";

    /**
     * 更新显示模式 --天气页面
     */
    public final static String COMMAND_TYPE_UPDATE_WEATHER_CONFIG = "updateWeatherConfig";

//    /**
//     * 更换显示模块
//     */
//    public final static String COMMAND_TYPE_CHANGE_SHOW_MODULE = "changeShowModule";

    /**
     * 更换显示模块
     */
    public static final  String COMMAND_VALUE_CHANGE_SHOW_MODULE_EVENT = "event";
    /**
     * 更换显示模块
     */
    public static final  String COMMAND_VALUE_CHANGE_SHOW_MODULE_WEATHER = "weather";

    public static final  String COMMAND_VALUE_CHANGE_SHOW_MODULE_TIME = "time";

    public static final  String COMMAND_VALUE_CHANGE_SHOW_MODULE_FANS = "fans";

    public static final  String COMMAND_VALUE_CHANGE_SHOW_MODULE_MESSAGE = "message";

    public static final  String COMMAND_VALUE_CHANGE_SHOW_MODULE_NEWS = "news";

    public static final  String COMMAND_VALUE_CHANGE_SHOW_MODULE_COMMEMORATION = "commemoration";

    public static final  String COMMAND_VALUE_CHANGE_SHOW_MODULE_STOCK = "stock" ;

    public static final  String COMMAND_VALUE_CHANGE_SHOW_MODULE_WORD = "word" ;

    public static final  String COMMAND_VALUE_CHANGE_SLEEP = "sleep" ;

    public static final  String COMMAND_VALUE_CHANGE_ROBOT = "robot" ;

    public static final  String COMMAND_VALUE_CHANGE_CUSTOM = "custom" ;

    public static final  String COMMAND_VALUE_CHANGE_LAMP = "lamp" ;

    //关闭应用的指令
    public static final  String COMMAND_VALUE_CLOSE_APP = "closeApp" ;


//
//    /**
//     * 闹钟信息
//     */
//    public static final  String COMMAND_TYPE_UPDATE_CLOCK_DATA = "updateClockData";

    /**
     * 悬空开始
     */
    public static final  String COMMAND_TYPE_CONTROL_PRECIPICE_START_DATA = "controlStartPrecipice";
    /**
     * 悬空结束
     */
    public static final  String COMMAND_TYPE_CONTROL_PRECIPICE_STOP_DATA = "controlStopPrecipice";
    /**
     * 倒下开始
     */
    public static final  String COMMAND_TYPE_CONTROL_FALL_DOWN_START_DATA = "controlStartFallDown";
    /**
     * 倒下结束
     */
    public static final  String COMMAND_TYPE_CONTROL_FALL_DOWN_STOP_DATA = "controlStopFallDown";

    /**
     * 单击
     */
    public static final  String COMMAND_TYPE_CONTROL_TAP_DATA = "controlTap";

    /**
     * 双击
     */
    public static final  String COMMAND_TYPE_CONTROL_DOUBLE_TAP_DATA = "controlDoubleTap";
    /**
     * 长按
     */
    public static final  String COMMAND_TYPE_CONTROL_LONG_PRESS_DATA = "controlLongPressTap";
    /**
     * 防跌落，往后退
     */
    public static final  String COMMAND_TYPE_CONTROL_FALL_BACKEND = "fallBackend";
    /**
     * 防跌落，往前走
     */
    public static final  String COMMAND_TYPE_CONTROL_FALL_FORWARD = "fallForward";
    public static final  String COMMAND_TYPE_CONTROL_FALL_LEFT = "fallLeft";
    public static final  String COMMAND_TYPE_CONTROL_FALL_RIGHT = "fallRight";

    /**
     * 摇晃
     */
    public static final String COMMAND_TYPE_CONTROL_WAGGLE = "waggle";

    /**
     * 避障
     */
    public static final String COMMAND_TYPE_CONTROL_TOF = "tof";


    /**
     * 选择图片
     */
    public static final  String COMMAND_TYPE_CONTROL_SEND_PIC = "controlSendPic";

    /**
     * 文字
     */
    public static final  String COMMAND_TYPE_CONTROL_SEND_WORD = "controlSendWord";


    public static String ROBOT_UPDATE_VERSION_IS_READY = "latest";

    /**
     * 机器人模式状态切换
     */
    public static final  String COMMAND_TYPE_CHANGE_MODE = "changeMode";

    public static final  String COMMAND_VALUE_CHANGE_MODE_TRANSFORM = "transform";
    public static final  String COMMAND_VALUE_CHANGE_MODE_REMINDER = "reminder";
    public static final  String COMMAND_VALUE_CHANGE_MODE_SHOW = "show";
    public static final  String COMMAND_VALUE_CHANGE_MODE_SLEEP = "sleep";
    public static final  String COMMAND_VALUE_CHANGE_MODE_AUTO = "auto";
    public static final  String COMMAND_VALUE_CHANGE_MODE_DEMO = "demo";
    public static final  String COMMAND_VALUE_CHANGE_MODE_RESET = "reset"; // 恢复
    public static final  String COMMAND_VALUE_CHANGE_MODE_STATIC = "static"; // 静止模式
    public static final  String COMMAND_VALUE_CHANGE_MODE_ROBOT = "robot"; // 机器人模式
    public static final  String COMMAND_VALUE_CHANGE_MODE_SPEECH = "speech"; // 思必驰
    public static final  String COMMAND_VALUE_CHANGE_MODE_24HOUR = "24hour"; // 24小时
    public static final  String COMMAND_VALUE_CHANGE_MODE_HAND = "hand"; // 手势识别
    public static final  String COMMAND_VALUE_CHANGE_MODE_FACE = "face"; // 人脸识别
    public static final  String COMMAND_VALUE_CHANGE_MODE_BODY = "body"; // 人体识别
    public static final  String COMMAND_VALUE_CHANGE_MODE_TRTC_MONITOR = "trtc_monitor"; //
    public static final  String COMMAND_VALUE_CHANGE_MODE_TRTC_TRANSFORM = "trtc_transform"; //
    public static final  String COMMAND_VALUE_CHANGE_MODE_TAKE_PHOTO = "photo"; // 拍照
    public static final  String COMMAND_VALUE_CHANGE_MODE_SENSOR = "sensor"; // 传感器
    public static final  String COMMAND_VALUE_EXIT = "exit"; // 思必驰
    public static final  String COMMAND_VALUE_KILL_PROCESS = "killProcess";
    public static final  String COMMAND_VALUE_GO_TO_SLEEP = "go_to_sleep";
    public static final  String COMMAND_VALUE_ROBOT = "robot";
    public static final  String COMMAND_VALUE_APP = "app";
    public static final  String COMMAND_TYPE_ROBOT_STATUS = "robot_status";


    public static final  String COMMAND_VALUE_CONTROL_DISPLAY_TIME = "time";
    public static final  String COMMAND_VALUE_CONTROL_DISPLAY_WEATHER = "weather";
    public static final  String COMMAND_VALUE_CONTROL_DISPLAY_COUNTDOWN = "countdown";
    public static final  String COMMAND_VALUE_CONTROL_DISPLAY_FANS = "fans";
    public static final  String COMMAND_VALUE_CONTROL_DISPLAY_SCHEDULE = "schedule";
    public static final  String COMMAND_VALUE_CONTROL_DISPLAY_EMPTY = "empty";
    public static final  String COMMAND_VALUE_CONTROL_DISPLAY_BLACK = "darkScreen";
    public static final  String COMMAND_VALUE_CONTROL_DISPLAY_EXT_BLACK = "exitDarkScreen";

    public static final  String LOCAL_COMMAND_VALUE_CONTROL_DISPLAY_TIME = "display/time";
    public static final  String LOCAL_COMMAND_VALUE_CONTROL_DISPLAY_WEATHER = "display/weather";
    public static final  String LOCAL_COMMAND_VALUE_CONTROL_DISPLAY_COUNTDOWN = "display/countdown";
    public static final  String LOCAL_COMMAND_VALUE_CONTROL_DISPLAY_FANS = "display/fans";
    public static final  String LOCAL_COMMAND_VALUE_CONTROL_DISPLAY_SCHEDULE = "display/notice";
    public static final  String LOCAL_COMMAND_VALUE_CONTROL_DISPLAY_EMPTY = "display/empty";
    public static final  String LOCAL_COMMAND_VALUE_IDENT_FACE_RESULT = "identFaceResult";


    /**
     * 打开工厂模式
     */
    public static final  String COMMAND_TYPE_OPEN_FACTORY_MODE = "openFactoryMode";

    /**
     * 关闭工厂模式
     */
    public static final  String COMMAND_TYPE_CLOSE_FACTORY_MODE = "closeFactoryMode";

    /**
     * 删除设备
     */
    public static final  String COMMAND_VALUE_REMOVE_DEVICE = "removeDevice";

    /**
     * 开机充电
     */
    public final static String COMMAND_TYPE_POWER_ON_CHARGING = "power_on_charging";



}
