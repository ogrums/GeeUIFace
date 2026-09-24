package com.renhejia.robot.commandlib.parser.deviceinfo;

import com.renhejia.robot.commandlib.parser.time.TimeData;

/**
 * 设备信息
 */
public class DeviceInfo {

    private int code;
    private String msg;
    private DeviceData data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public DeviceData getData() {
        return data;
    }

    public void setData(DeviceData data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "{" +
                "code:" + code +
                ", msg:'" + msg + '\'' +
                ", data:" + data +
                '}';
    }
}
