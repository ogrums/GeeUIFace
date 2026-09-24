package com.renhejia.robot.commandlib.parser.config;

import com.renhejia.robot.commandlib.parser.sleepmode.SleepModeConfig;

public class RobotConfigData {

    private String client_id;
    private int user_id;
    private int upload_interval;
    private DeviceWeatherConfig device_weather_config;
    private DeviceCalendarConfig device_calendar_config;
    private DeviceBleConfig device_ble_config;
    private DeviceWifiConfig device_wifi_config;
    private DeviceSoundConfig device_sound_config;
    private DeviceBrightnessConfig device_brightness_config;
    private DeviceDateConfig device_date_config;
    private DeviceShowModeConfig device_show_mode_config;
    private SleepModeConfig sleep_mode_config;
    private DeviceGeneralConfig device_general_config;
    private DeviceAwakeConfig device_awake_config;
    private String default_mode;


    public String getClient_id() {
        return client_id;
    }

    public void setClient_id(String client_id) {
        this.client_id = client_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getUpload_interval() {
        return upload_interval;
    }

    public void setUpload_interval(int upload_interval) {
        this.upload_interval = upload_interval;
    }

    public DeviceWeatherConfig getDevice_weather_config() {
        return device_weather_config;
    }

    public void setDevice_weather_config(DeviceWeatherConfig device_weather_config) {
        this.device_weather_config = device_weather_config;
    }

    public DeviceCalendarConfig getDevice_calendar_config() {
        return device_calendar_config;
    }

    public void setDevice_calendar_config(DeviceCalendarConfig device_calendar_config) {
        this.device_calendar_config = device_calendar_config;
    }

    public DeviceBleConfig getDevice_ble_config() {
        return device_ble_config;
    }

    public void setDevice_ble_config(DeviceBleConfig device_ble_config) {
        this.device_ble_config = device_ble_config;
    }

    public DeviceWifiConfig getDevice_wifi_config() {
        return device_wifi_config;
    }

    public void setDevice_wifi_config(DeviceWifiConfig device_wifi_config) {
        this.device_wifi_config = device_wifi_config;
    }

    public DeviceSoundConfig getDevice_sound_config() {
        return device_sound_config;
    }

    public void setDevice_sound_config(DeviceSoundConfig device_sound_config) {
        this.device_sound_config = device_sound_config;
    }

    public DeviceBrightnessConfig getDevice_brightness_config() {
        return device_brightness_config;
    }

    public void setDevice_brightness_config(DeviceBrightnessConfig device_brightness_config) {
        this.device_brightness_config = device_brightness_config;
    }

    public DeviceDateConfig getDevice_date_config() {
        return device_date_config;
    }

    public void setDevice_date_config(DeviceDateConfig device_date_config) {
        this.device_date_config = device_date_config;
    }

    public DeviceShowModeConfig getDevice_show_mode_config() {
        return device_show_mode_config;
    }

    public void setDevice_show_mode_config(DeviceShowModeConfig device_show_mode_config) {
        this.device_show_mode_config = device_show_mode_config;
    }

    public SleepModeConfig getSleep_mode_config() {
        return sleep_mode_config;
    }

    public void setSleep_mode_config(SleepModeConfig sleep_mode_config) {
        this.sleep_mode_config = sleep_mode_config;
    }

    public DeviceGeneralConfig getDevice_general_config() {
        return device_general_config;
    }

    public void setDevice_general_config(DeviceGeneralConfig device_general_config) {
        this.device_general_config = device_general_config;
    }

    public DeviceAwakeConfig getDevice_awake_config() {
        return device_awake_config;
    }

    public void setDevice_awake_config(DeviceAwakeConfig device_awake_config) {
        this.device_awake_config = device_awake_config;
    }

    public String getDefault_mode() {
        return default_mode;
    }

    public void setDefault_mode(String default_mode) {
        this.default_mode = default_mode;
    }





}
