package com.project.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class MessGroup {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int messId;
    private int totalMember;
    private String name;
    private String managerName;

    private List<User> members = new ArrayList<>();

    @OneToMany
    private List<Months> months = new ArrayList<>();


    public MessGroup(){

    }

    public MessGroup(int messId, int totalMember, String name, String managerName) {
        this.messId = messId;
        this.totalMember = totalMember;
        this.name = name;
        this.managerName = managerName;
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

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public List<User> getMembers() {
        return members;
    }

    public void setMembers(List<User> members) {
        this.members = members;
    }
}
