package com.renhejia.robot.commandlib.utils;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;

/**
 * @author liujunbin
 */
public class SystemUtil {
    private static Method sysPropGet;
    private static Method sysPropGetInt;
    private static Method sysPropSet;
    private static final String SN = "ro.serialno";
    public static final String REGION_LANGUAGE = "persist.sys.region.language";
    public  static final String MCU_VERSION = "persist.sys.mcu.version";
    public  static final String HARD_CODE = "persist.sys.hardcode";
    public  static final String DEVICE_SIGN = "persist.sys.device.sign";
    private static final String ROBOT_STATUS = "persist.sys.robot.status";
    private static final String ROBOT_STATUS_TRUE = "true";
    public static final String REGION_LANGUAGE_ZH = "zh";
    public static final String REGION_LANGUAGE_EN = "en";


    static {
        try {
            Class<?> S = Class.forName("android.os.SystemProperties");
            Method M[] = S.getMethods();
            for (Method m : M) {
                String n = m.getName();
                if (n.equals("get")) {
                    sysPropGet = m;
                } else if (n.equals("getInt")) {
                    sysPropGetInt = m;
                } else if (n.equals("set")) {
                    sysPropSet = m;
                }
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static String get(String name, String default_value) {
        try {
            return (String) sysPropGet.invoke(null, name, default_value);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return default_value;
    }

    public static void set(String name, String value) {
        try {
            sysPropSet.invoke(null, name, value);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    public static String getLtpSn(){
        return get(SN,null);
    }

    public static String getHardCode(){
        return get(HARD_CODE,null);
    }

    public static void setHardCode(String hardCode){
        set(HARD_CODE,hardCode);
    }

    public static void setDeviceSign(String deviceSign){
        set(DEVICE_SIGN,deviceSign);
    }

    public static String getDeviceSign(){
        return get(DEVICE_SIGN,null);
    }


//    public static String getLtpLastSn(){
//        String sn = getLtpSn();
//        if (TextUtils.isEmpty(sn)){
//            return null;
//        }else{
//            return sn.substring(sn.length()-4);
//        }
//    }

    public static String getWlanMacAddress() {
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                NetworkInterface networkInterface = networkInterfaces.nextElement();
                if (networkInterface.getName().equals("wlan0")) {
                    StringBuilder mac = new StringBuilder();
                    byte[] hardwareAddress = networkInterface.getHardwareAddress();
                    String hex = Integer.toHexString(hardwareAddress[0] & 0xff);
                    if (hex.length() == 1) {
                        mac.append('0');
                    }
                    mac.append(hex);
                    for (int i = 1; i < hardwareAddress.length; ++i) {
                        mac.append(':');
                        hex = Integer.toHexString(hardwareAddress[i] & 0xff);
                        if (hex.length() == 1) {
                            mac.append('0');
                        }
                        mac.append(hex);
                    }
                    return mac.toString();
                }
            }
        } catch (SocketException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public static String getLanguage(){
        return get(REGION_LANGUAGE,null);
    }

    public static boolean isChinese(){
        if (getLanguage().equals(REGION_LANGUAGE_ZH)){
            return true;
        }else{
            return false;
        }
    }



}
