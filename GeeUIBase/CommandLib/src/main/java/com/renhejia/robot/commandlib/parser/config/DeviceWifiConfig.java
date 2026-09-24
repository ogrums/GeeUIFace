package com.renhejia.robot.commandlib.parser.config;

/**
 * @author liujunbin
 */
public class DeviceWifiConfig {

    private int wifi_switch;

    private int is_connected;
    private String selected_wifi;

    public int getWifi_switch() {
        return wifi_switch;
    }

    public void setWifi_switch(int wifi_switch) {
        this.wifi_switch = wifi_switch;
    }

    public int getIs_connected() {
        return is_connected;
    }

    public void setIs_connected(int is_connected) {
        this.is_connected = is_connected;
    }

    public String getSelected_wifi() {
        return selected_wifi;
    }

    public void setSelected_wifi(String selected_wifi) {
        this.selected_wifi = selected_wifi;
    }

    @Override
    public String toString() {
        return "{" +
                "wifi_switch=" + wifi_switch +
                ", is_connected=" + is_connected +
                ", selected_wifi='" + selected_wifi + '\'' +
                '}';
    }
}
