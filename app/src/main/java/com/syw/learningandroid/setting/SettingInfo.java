package com.syw.learningandroid.setting;

public class SettingInfo {
    private String settingName;
    private String settingDescription;

    public SettingInfo() {
    }

    public SettingInfo(String settingName, String settingDescription) {
        this.settingName = settingName;
        this.settingDescription = settingDescription;
    }

    public String getSettingName() {
        return settingName;
    }

    public void setSettingName(String settingName) {
        this.settingName = settingName;
    }

    public String getSettingDescription() {
        return settingDescription;
    }

    public void setSettingDescription(String settingDescription) {
        this.settingDescription = settingDescription;
    }
}
