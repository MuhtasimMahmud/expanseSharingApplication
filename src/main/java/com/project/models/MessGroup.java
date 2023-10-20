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

    @OneToMany(cascade = CascadeType.ALL)
    private List<User> users = new ArrayList<>();


    @OneToMany
    private List<Months> months = new ArrayList<>();

    public MessGroup(){

    }

    public MessGroup(int messId, int totalMember, String name, String managerName, List<User> users) {
        this.messId = messId;
        this.totalMember = totalMember;
        this.name = name;
        this.managerName = managerName;
        this.users = users;
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

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
