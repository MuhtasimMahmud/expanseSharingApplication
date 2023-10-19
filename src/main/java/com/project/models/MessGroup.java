package com.project.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class MessGroup {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int messId;
    private int totalMember;
    private String name;



    public MessGroup(){

    }

    public MessGroup(int messId, int totalMember, String name) {
        this.messId = messId;
        this.totalMember = totalMember;
        this.name = name;
    }

    public int getMessId() {
        return messId;
    }

    public void setMessId(int messId) {
        this.messId = messId;
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
}
