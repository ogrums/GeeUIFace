package com.renhejia.robot.commandlib.parser.expression;

public class ExpressionText {
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "{" +
                "content:'" + content + '\'' +
                '}';
    }
}
