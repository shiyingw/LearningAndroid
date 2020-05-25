package com.syw.learningandroid.transferpara;

public class FriendBean {
    private int id;
    private String name;

    public FriendBean(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public FriendBean() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
