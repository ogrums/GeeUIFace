package com.renhejia.robot.commandlib.parser.config;

/**
 * @author liujunbin
 */
public class DeviceBleConfig {

    private int ble_switch;
    private int be_discover_switch;

    public int getBle_switch() {
        return ble_switch;
    }

    public void setBle_switch(int ble_switch) {
        this.ble_switch = ble_switch;
    }

    public int getBe_discover_switch() {
        return be_discover_switch;
    }

    public void setBe_discover_switch(int be_discover_switch) {
        this.be_discover_switch = be_discover_switch;
    }

    @Override
    public String toString() {
        return "{" +
                "ble_switch=" + ble_switch +
                ", be_discover_switch=" + be_discover_switch +
                '}';
    }
}
