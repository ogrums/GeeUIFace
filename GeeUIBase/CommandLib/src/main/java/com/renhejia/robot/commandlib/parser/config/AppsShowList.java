package com.renhejia.robot.commandlib.parser.config;

import com.google.gson.annotations.SerializedName;

import java.util.List;

//自动切换APP的model
public class AppsShowList {
    @SerializedName("app_show_list")
    public List<AppShow> appShowList;

    public List<AppShow> getAppShowList() {
        return appShowList;
    }

    public void setAppShowList(List<AppShow> appShowList) {
        this.appShowList = appShowList;
    }
}
