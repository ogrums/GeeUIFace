package com.renhejia.robot.commandlib.parser.config;

import com.google.gson.annotations.SerializedName;

public class AppShow {
    @SerializedName("app_tag")
    public String appTag;
    @SerializedName("open_path")
    public String openPath;

    @SerializedName("package_name")
    public String packageName;

    public String getAppTag() {
        return appTag;
    }

    public void setAppTag(String appTag) {
        this.appTag = appTag;
    }

    public String getOpenPath() {
        return openPath;
    }

    public void setOpenPath(String openPath) {
        this.openPath = openPath;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }
}
