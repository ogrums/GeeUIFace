package com.renhejia.robot.commandlib.parser.config;

import java.util.List;

//自动切换APP的model
public class AppsShowListModel {
    private String msg;
    private AppsShowList data;
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

    public AppsShowList getData() {
        return data;
    }

    public void setData(AppsShowList data) {
        this.data = data;
    }
}
