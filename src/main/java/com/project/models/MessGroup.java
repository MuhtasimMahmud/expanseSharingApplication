package com.project.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class MessGroup {

    @Id
    private int messId;
    private String messName;
    private int totalMembers;

    public MessGroup(){

    }

    public int getMessId() {
        return messId;
    }

    public void setMessId(int messId) {
        this.messId = messId;
    }

    public String getMessName() {
        return messName;
    }

    public void setMessName(String messName) {
        this.messName = messName;
    }

    public int getTotalMembers() {
        return totalMembers;
    }

    public void setTotalMembers(int totalMembers) {
        this.totalMembers = totalMembers;
    }
}
