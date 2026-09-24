package com.renhejia.robot.commandlib.parser.expression;

public class Expression {
    private int code;
    private String msg;
    private ExpressionData data;

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


    public ExpressionData getData() {
        return data;
    }

    public void setData(ExpressionData data) {
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
