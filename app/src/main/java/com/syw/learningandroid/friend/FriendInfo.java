package com.syw.learningandroid.friend;

import java.util.List;

public class FriendInfo {
    protected String pushToken;
    protected String pushTokenType;
    private long id;
    private long friend_id;
    private String friend_alias_name;
    private int friend_flag;
    private int user_type;
    private int user_status;
    private String device_serial_num;
    private String user_name;
    private String user_tel;
    private String user_photo;
    private int user_online;
    private long user_online_time;
    private String topic_tome;
    private String topic_aboutme;
    private String client_version;
    private String plugin_version;
    private String dev_status;
    private int flag_type;
    private int flag_result;
    private int device_user_status;
    private List<String> business_category_type_list;
    private String callSignalMsgWay;
    private boolean isSupportAndroidPush;

    public FriendInfo() {
    }

    public static void main(String[] args) {
        System.out.println(178);
        System.out.println(138);
    }

    public String getDev_status() {
        return this.dev_status;
    }

    public void setDev_status(String dev_status) {
        this.dev_status = dev_status;
    }

    public String getPushToken() {
        return this.pushToken;
    }

    public void setPushToken(String pushToken) {
        this.pushToken = pushToken;
    }

    public String getPushTokenType() {
        return this.pushTokenType;
    }

    public void setPushTokenType(String pushTokenType) {
        this.pushTokenType = pushTokenType;
    }

    public String getClient_version() {
        return this.client_version;
    }

    public void setClient_version(String client_version) {
        this.client_version = client_version;
    }

    public String getPlugin_version() {
        return this.plugin_version;
    }

    public void setPlugin_version(String plugin_version) {
        this.plugin_version = plugin_version;
    }

    public String getTopic_tome() {
        return this.topic_tome;
    }

    public void setTopic_tome(String topic_tome) {
        this.topic_tome = topic_tome;
    }

    public long getLastOnlineTimestamp() {
        return this.user_online_time;
    }

    public void setLastOnlineTimestamp(long onlineTimestamp) {
        this.user_online_time = onlineTimestamp;
    }

    public String getTopic_aboutme() {
        return this.topic_aboutme;
    }

    public void setTopic_aboutme(String topic_aboutme) {
        this.topic_aboutme = topic_aboutme;
    }

    public long getUser_online_time() {
        return this.user_online_time;
    }

    public void setUser_online_time(long user_online_time) {
        this.user_online_time = user_online_time;
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getFriend_id() {
        return this.friend_id;
    }

    public void setFriend_id(long friend_id) {
        this.friend_id = friend_id;
    }

    public String getFriend_alias_name() {
        return this.friend_alias_name;
    }

    public void setFriend_alias_name(String friend_alias_name) {
        this.friend_alias_name = friend_alias_name;
    }

    public int getFriend_flag() {
        return this.friend_flag;
    }

    public void setFriend_flag(int friend_flag) {
        this.friend_flag = friend_flag;
    }

    public int getUser_type() {
        return this.user_type;
    }

    public void setUser_type(int user_type) {
        this.user_type = user_type;
    }

    public int getUser_status() {
        return this.user_status;
    }

    public void setUser_status(int user_status) {
        this.user_status = user_status;
    }

    public String getDevice_serial_num() {
        return this.device_serial_num;
    }

    public void setDevice_serial_num(String device_serial_num) {
        this.device_serial_num = device_serial_num;
    }

    public String getUser_name() {
        return this.user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_tel() {
        return this.user_tel;
    }

    public void setUser_tel(String user_tel) {
        this.user_tel = user_tel;
    }

    public String getUser_photo() {
        return this.user_photo;
    }

    public void setUser_photo(String user_photo) {
        this.user_photo = user_photo;
    }

    public int getUser_online() {
        return this.user_online;
    }

    public void setUser_online(int user_online) {
        this.user_online = user_online;
    }

    public int getFlag_type() {
        return this.flag_type;
    }

    public void setFlag_type(int flag_type) {
        this.flag_type = flag_type;
    }

    public int getFlag_result() {
        return this.flag_result;
    }

    public void setFlag_result(int flag_result) {
        this.flag_result = flag_result;
    }

    public int getDevice_user_status() {
        return this.device_user_status;
    }

    public void setDevice_user_status(int device_user_status) {
        this.device_user_status = device_user_status;
    }

    public List<String> getBusiness_category_type_list() {
        return this.business_category_type_list;
    }

    public void setBusiness_category_type_list(List<String> business_category_type_list) {
        this.business_category_type_list = business_category_type_list;
    }

    public String getCallSignalMsgWay() {
        return this.callSignalMsgWay;
    }

    public void setCallSignalMsgWay(String callSignalMsgWay) {
        this.callSignalMsgWay = callSignalMsgWay;
    }

    public FriendInfo clone() {
        try {
            return (FriendInfo) super.clone();
        } catch (CloneNotSupportedException var2) {
            var2.printStackTrace();
            return null;
        }
    }

    public long getOnlineEntityId() {
        return this.friend_id;
    }

    public void setOnlineEntityId(long id) {
        this.friend_id = id;
    }

    public int getOnlineStatus() {
        return this.user_online;
    }

    public void setOnlineStatus(int onlineStatus) {
        this.user_online = onlineStatus;
    }

    public String getMessagingToken() {
        return this.topic_tome;
    }

    public void setMessagingToken(String token) {
        this.topic_tome = token;
    }

    public boolean isSupportAndroidPush() {
        return this.isSupportAndroidPush;
    }

    public void setSupportAndroidPush(boolean supportAndroidPush) {
        this.isSupportAndroidPush = supportAndroidPush;
    }

    public String getUserPhoto() {
        return this.user_photo;
    }

}
