package com.renhejia.robot.commandlib.parser.config;

/**
 * @author liujunbin
 */
public class DeviceGeneralConfig {

    private int display_switch;
    private int time_switch;
    private int weather_switch;
    private int calendar_switch;
    private int general_battery_switch;

    public int getDisplay_switch() {
        return display_switch;
    }

    public void setDisplay_switch(int display_switch) {
        this.display_switch = display_switch;
    }

    public int getTime_switch() {
        return time_switch;
    }

    public void setTime_switch(int time_switch) {
        this.time_switch = time_switch;
    }

    public int getWeather_switch() {
        return weather_switch;
    }

    public void setWeather_switch(int weather_switch) {
        this.weather_switch = weather_switch;
    }

    public int getCalendar_switch() {
        return calendar_switch;
    }

    public void setCalendar_switch(int calendar_switch) {
        this.calendar_switch = calendar_switch;
    }

    public int getGeneral_battery_switch() {
        return general_battery_switch;
    }

    public void setGeneral_battery_switch(int general_battery_switch) {
        this.general_battery_switch = general_battery_switch;
    }

    @Override
    public String toString() {
        return "{" +
                "display_switch=" + display_switch +
                ", time_switch=" + time_switch +
                ", weather_switch=" + weather_switch +
                ", calendar_switch=" + calendar_switch +
                ", general_battery_switch=" + general_battery_switch +
                '}';
    }
}
