package com.renhejia.robot.commandlib.parser.config;

import com.google.gson.annotations.SerializedName;

public class UserAppsConfig {
    @SerializedName("id")
    public int id;
    @SerializedName("app_name")
    public String appName;

    @SerializedName("app_icon")
    public String appIcon;

    //1 用户上传,0 系统应用，
    @SerializedName("app_type")
    public String appType;

    @SerializedName("is_system")
    public String isSystem;

    @SerializedName("notes")
    public String notes;

    @SerializedName("app_package_name")
    public String appPackageName;

    @SerializedName("open_content")
    public String openContent;

    @SerializedName("app_version")
    public String appVersion;
    @SerializedName("upgrade_version")
    public String upgradeVersion;

    @SerializedName("open_type")
    public int openType;

    @SerializedName("is_restart")
    public int isRestart;

    @SerializedName("is_show_battery")
    public int isShowBattery;

    @SerializedName("is_show_text")
    public int isShowText;

    //0：不上报；1：上报
    @SerializedName("is_show_report")
    public int isShowReport;

    public int getOpenType() {
        return openType;
    }

    public void setOpenType(int openType) {
        this.openType = openType;
    }

    public int getIsRestart() {
        return isRestart;
    }

    public void setIsRestart(int isRestart) {
        this.isRestart = isRestart;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getAppIcon() {
        return appIcon;
    }

    public void setAppIcon(String appIcon) {
        this.appIcon = appIcon;
    }

    public String getAppType() {
        return appType;
    }

    public void setAppType(String appType) {
        this.appType = appType;
    }

    public String getIsSystem() {
        return isSystem;
    }

    public void setIsSystem(String isSystem) {
        this.isSystem = isSystem;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getAppPackageName() {
        return appPackageName;
    }

    public void setAppPackageName(String appPackageName) {
        this.appPackageName = appPackageName;
    }

    public String getOpenContent() {
        return openContent;
    }

    public void setOpenContent(String openContent) {
        this.openContent = openContent;
    }

    public String getAppVersion() {
        return appVersion;
    }

    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }

    public String getUpgradeVersion() {
        return upgradeVersion;
    }

    public void setUpgradeVersion(String upgradeVersion) {
        this.upgradeVersion = upgradeVersion;
    }

    public int isShowBattery() {
        return isShowBattery;
    }

    public void setShowBattery(int showBattery) {
        isShowBattery = showBattery;
    }

    public int isShowText() {
        return isShowText;
    }

    public void setShowText(int showText) {
        isShowText = showText;
    }
    public int getIsShowReport() {
        return isShowReport;
    }

    public void setIsShowReport(int isShowReport) {
        this.isShowReport = isShowReport;
    }
}
