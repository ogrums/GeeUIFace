package com.renhejia.robot.commandlib.parser.config;

import java.util.List;

public class UserAppsConfigModel {
    private String msg;
    private List<UserAppsConfig> data;
    private int code;

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

    public List<UserAppsConfig> getData() {
        return data;
    }

    public void setData(List<UserAppsConfig> data) {
        this.data = data;
    }


}
