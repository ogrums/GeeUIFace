package com.renhejia.robot.commandlib.log;

import android.util.Log;

public class LogUtils {
    public static void logi(String tag, String message) {
        Log.i(tag, message);
    }

    public static void logw(String tag, String message) {
        Log.w(tag, message);
    }

    public static void logd(String tag, String message) {
        Log.d(tag, message);
    }

    public static void loge(String tag, String message) {
        Log.e(tag, message);
    }

    private static final int showLength = 1000;

    public static void showLargeLog(String tag, String logContent) {
        if (logContent.length() > showLength) {
            String show = logContent.substring(0, showLength);
            logd(tag, show);
            if ((logContent.length() - showLength) > showLength) {
                showLargeLog(tag, logContent.substring(showLength));
            } else {
                logd(tag, logContent.substring(showLength));
            }
        } else {
            logd(tag, logContent);
        }
    }
}
