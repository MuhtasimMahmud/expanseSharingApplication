package com.project.models;

import javax.persistence.*;
import java.util.HashMap;
import java.util.Map;


@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    @Column(unique = true)
    private String email;
    private String password;
    private String role;
    private boolean manager;
    private int messID;
    private String imageUrl;

    private Map<Integer, Integer> moneyBorrowed = new HashMap<>();
    private Map<Integer, Integer> moneyGetting = new HashMap<>();

    public User(){

    }

    public User(int id, String name, String email, String password, String role, boolean manager, int messID, String imageUrl, Map<Integer, Integer> moneyBorrowed, Map<Integer, Integer> moneyGetting) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.role = role;
        this.manager = manager;
        this.messID = messID;
        this.imageUrl = imageUrl;
        this.moneyBorrowed = moneyBorrowed;
        this.moneyGetting = moneyGetting;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public boolean isManager() {
        return manager;
    }

    public void setManager(boolean manager) {
        this.manager = manager;
    }

    public int getMessID() {
        return messID;
    }

    public void setMessID(int messID) {
        this.messID = messID;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Map<Integer, Integer> getMoneyBorrowed() {
        return moneyBorrowed;
    }

    public void setMoneyBorrowed(Map<Integer, Integer> moneyBorrowed) {
        this.moneyBorrowed = moneyBorrowed;
    }

    public Map<Integer, Integer> getMoneyGetting() {
        return moneyGetting;
    }

    public void setMoneyGetting(Map<Integer, Integer> moneyGetting) {
        this.moneyGetting = moneyGetting;
    }
}
