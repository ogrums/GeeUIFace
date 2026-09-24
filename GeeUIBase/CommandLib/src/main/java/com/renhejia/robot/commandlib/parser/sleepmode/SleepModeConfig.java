package com.renhejia.robot.commandlib.parser.sleepmode;

/**
 * @author liujunbin
 */
public class SleepModeConfig {

    private int sleep_mode_switch;
    private int close_screen_mode_switch;

    private int sleep_sound_mode_switch;
    private int sleep_time_status_mode_switch;
    private String start_time;
    private String end_time;

    public int getSleep_mode_switch() {
        return sleep_mode_switch;
    }

    public void setSleep_mode_switch(int sleep_mode_switch) {
        this.sleep_mode_switch = sleep_mode_switch;
    }

    public String getStart_time() {
        return start_time;
    }

    public void setStart_time(String start_time) {
        this.start_time = start_time;
    }

    public String getEnd_time() {
        return end_time;
    }

    public void setEnd_time(String end_time) {
        this.end_time = end_time;
    }
    public int getClose_screen_mode_switch() {
        return close_screen_mode_switch;
    }

    public void setClose_screen_mode_switch(int close_screen_mode_switch) {
        this.close_screen_mode_switch = close_screen_mode_switch;
    }

    public int getSleep_sound_mode_switch() {
        return sleep_sound_mode_switch;
    }

    public void setSleep_sound_mode_switch(int sleep_sound_mode_switch) {
        this.sleep_sound_mode_switch = sleep_sound_mode_switch;
    }

    public int getSleep_time_status_mode_switch() {
        return sleep_time_status_mode_switch;
    }

    public void setSleep_time_status_mode_switch(int sleep_time_status_mode_switch) {
        this.sleep_time_status_mode_switch = sleep_time_status_mode_switch;
    }
//    @Override
//    public String toString() {
//        return "{" +
//                "sleep_mode_switch=" + sleep_mode_switch +
//                ", start_time='" + start_time + '\'' +
//                ", end_time='" + end_time + '\'' +
//                '}';
//    }


    @Override
    public String toString() {
        return "{" +
                "sleep_mode_switch:" + sleep_mode_switch +
                ", close_screen_mode_switch:" + close_screen_mode_switch +
                ", sleep_sound_mode_switch:" + sleep_sound_mode_switch +
                ", sleep_time_status_mode_switch:" + sleep_time_status_mode_switch +
                ", start_time:'" + start_time + '\'' +
                ", end_time:'" + end_time + '\'' +
                '}';
    }
}
