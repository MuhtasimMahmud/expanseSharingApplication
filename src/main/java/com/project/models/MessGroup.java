package com.project.models;

public class MessGroup {

    private int mId;
    private int totalMember;
    private String name;
    private String role;

    public MessGroup(){

    }

    public MessGroup(int mId, int totalMember, String name, String role) {
        this.mId = mId;
        this.totalMember = totalMember;
        this.name = name;
        this.role = role;
    }


    public int getmId() {
        return mId;
    }

    public void setmId(int mId) {
        this.mId = mId;
    }

    public int getTotalMember() {
        return totalMember;
    }

    public void setTotalMember(int totalMember) {
        this.totalMember = totalMember;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
