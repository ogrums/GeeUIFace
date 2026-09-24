package com.renhejia.robot.commandlib.parser.config;

/**
 * @author liujunbin
 */
public class DeviceSoundConfig {

    private int volume_size;

    public int getVolume_size() {
        return volume_size;
    }

    public void setVolume_size(int volume_size) {
        this.volume_size = volume_size;
    }

    @Override
    public String toString() {
        return "{" +
                "volume_size=" + volume_size +
                '}';
    }

}
