package com.renhejia.robot.commandlib.parser.config;

/**
 * @author liujunbin
 */
public class DeviceWeatherConfig {

    private int display_switch;
    private String default_city_id;
    private String default_city_name;
    private String default_province_id;
    private String default_province_name;
    private String default_district_id;
    private String default_district_name;

    public int getDisplay_switch() {
        return display_switch;
    }

    public void setDisplay_switch(int display_switch) {
        this.display_switch = display_switch;
    }

    public String getDefault_city_id() {
        return default_city_id;
    }

    public void setDefault_city_id(String default_city_id) {
        this.default_city_id = default_city_id;
    }

    public String getDefault_city_name() {
        return default_city_name;
    }

    public void setDefault_city_name(String default_city_name) {
        this.default_city_name = default_city_name;
    }

    public String getDefault_province_id() {
        return default_province_id;
    }

    public void setDefault_province_id(String default_province_id) {
        this.default_province_id = default_province_id;
    }

    public String getDefault_province_name() {
        return default_province_name;
    }

    public void setDefault_province_name(String default_province_name) {
        this.default_province_name = default_province_name;
    }

    public String getDefault_district_id() {
        return default_district_id;
    }

    public void setDefault_district_id(String default_district_id) {
        this.default_district_id = default_district_id;
    }

    public String getDefault_district_name() {
        return default_district_name;
    }

    public void setDefault_district_name(String default_district_name) {
        this.default_district_name = default_district_name;
    }

    @Override
    public String toString() {
        return "{" +
                "display_switch=" + display_switch +
                ", default_city_id='" + default_city_id + '\'' +
                ", default_city_name='" + default_city_name + '\'' +
                ", default_province_id='" + default_province_id + '\'' +
                ", default_province_name='" + default_province_name + '\'' +
                ", default_district_id='" + default_district_id + '\'' +
                ", default_district_name='" + default_district_name + '\'' +
                '}';
    }
}
