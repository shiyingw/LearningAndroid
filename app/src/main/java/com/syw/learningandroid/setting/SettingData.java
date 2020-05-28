package com.syw.learningandroid.setting;

import java.util.ArrayList;
import java.util.List;

public class SettingData {
    public static List<SettingInfo> getSettingInfoList() {
        List<SettingInfo> settingInfoList = new ArrayList<>();
        settingInfoList.add(new SettingInfo("无线和网络", "WLAN、双卡管理、移动网络"));
        settingInfoList.add(new SettingInfo("设备连接", "蓝牙、NFC、打印"));
        settingInfoList.add(new SettingInfo("应用和通知", "权限管理、默认应用、应用分身"));
        settingInfoList.add(new SettingInfo("电池", "省电模式、耗电排行"));
        settingInfoList.add(new SettingInfo("显示", "护眼模式、桌面风格、壁纸"));
        settingInfoList.add(new SettingInfo("声音", "免打扰、铃声、振动"));
        settingInfoList.add(new SettingInfo("存储", "内存、空间清理"));
        settingInfoList.add(new SettingInfo("安全与隐私", "指纹、锁屏和密码、学生模式"));
        settingInfoList.add(new SettingInfo("用户和账号", "多用户、云服务、账户"));
        settingInfoList.add(new SettingInfo("智能辅助", "无障碍、智能识屏、手势控制"));
        settingInfoList.add(new SettingInfo("Google", "管理Google服务"));
        settingInfoList.add(new SettingInfo("系统", "系统导航、系统更新、关于手机、语言和输入法"));
        return settingInfoList;
    }
}
