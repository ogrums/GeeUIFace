package com.renhejia.robot.commandlib.parser.expression;

/**
 * @author liujunbin
 */
public class ExpressionData {

    private String config_key;
    private String config_title;
    private ExpressionConfigData config_data;


    public String getConfig_key() {
        return config_key;
    }

    public String getConfig_title() {
        return config_title;
    }


    public void setConfig_key(String config_key) {
        this.config_key = config_key;
    }

    public void setConfig_title(String config_title) {
        this.config_title = config_title;
    }

    public ExpressionConfigData getConfig_data() {
        return config_data;
    }

    public void setConfig_data(ExpressionConfigData config_data) {
        this.config_data = config_data;
    }

    @Override
    public String toString() {
        return "{" +
                "config_key:'" + config_key + '\'' +
                ", config_title:'" + config_title + '\'' +
                ", config_data:" + config_data +
                '}';
    }
}
