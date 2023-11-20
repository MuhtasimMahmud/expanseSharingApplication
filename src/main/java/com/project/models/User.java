package com.project.models;

import javax.persistence.*;
import java.util.HashMap;
import java.util.Map;


@Entity
public class User {

    @Id
    private int id; // id hobe phone number
    private String name;
    @Column(unique = true)
    private String email;
    private String password;
    private boolean manager; // jodi ei user ta ei month er manager hoy taile ei field true hobe, naile false hobe
    private int messID; // jodi manager field true thake taile je mess id eikhane thakbe oi mess id er gorup e enter korte parbe.
    private String imageUrl;



    /* eikhane emon rakha jay je ekta "user" er je credentials ase she oita diyei tar user account e dhukbe. jodi she oi month er manager hoy
    * taile messGroup account e dhukte gele just name er age manager. diye and same password diyei dhukte parbe.
    * jokhon user account khulbe tokhon e tar credentials gula messGrouop er manager account e same vabe add kore dibo.*/

    private Map<Integer, Integer> moneyBorrowed = new HashMap<>(); // user id(phn number), koto amount borrow korse
    private Map<Integer, Integer> moneyGetting = new HashMap<>();  // user id(phn number), koto amount money pabe

    public User(){

    }

    public User(int id, String name, String email, String password, boolean manager, int messID, String imageUrl) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.manager = manager;
        this.messID = messID;
        this.imageUrl = imageUrl;
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
