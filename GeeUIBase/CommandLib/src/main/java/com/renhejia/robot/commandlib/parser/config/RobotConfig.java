package com.renhejia.robot.commandlib.parser.config;

public class RobotConfig {

    private int code;
    private String msg;
    private RobotConfigData data;

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

    public RobotConfigData getData() {
        return data;
    }

    public void setData(RobotConfigData data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}
