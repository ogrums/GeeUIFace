package com.renhejia.robot.commandlib.parser.config;

/**
 * @author liujunbin
 */
public class DeviceBrightnessConfig {

    private int brightness_switch;
    private int volume_size;

    public int getBrightness_switch() {
        return brightness_switch;
    }

    public void setBrightness_switch(int brightness_switch) {
        this.brightness_switch = brightness_switch;
    }

    public int getVolume_size() {
        return volume_size;
    }

    public void setVolume_size(int volume_size) {
        this.volume_size = volume_size;
    }

    @Override
    public String toString() {
        return "{" +
                "brightness_switch=" + brightness_switch +
                ", volume_size=" + volume_size +
                '}';
    }
}
