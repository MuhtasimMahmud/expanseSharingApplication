package com.project.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.time.Year;

@Entity
public class Months {


    private String monthName;
    private float rent;
    private float foodBill;
    private float utilitiesBill;
    private String year;
    private float extraBill;

    @Id
    private String id = monthName+","+year;

    @ManyToOne
    private MessGroup messGroup;

    public Months(){

    }

    public Months(String monthName, float rent, float foodBill, float utilitiesBill, String year, float extraBill, String id) {
        this.monthName = monthName;
        this.rent = rent;
        this.foodBill = foodBill;
        this.utilitiesBill = utilitiesBill;
        this.year = year;
        this.extraBill = extraBill;
        this.id = id;
    }

    public String getMonthName() {
        return monthName;
    }

    public void setMonthName(String monthName) {
        this.monthName = monthName;
    }

    public float getRent() {
        return rent;
    }

    public void setRent(float rent) {
        this.rent = rent;
    }

    public float getFoodBill() {
        return foodBill;
    }

    public void setFoodBill(float foodBill) {
        this.foodBill = foodBill;
    }

    public float getUtilitiesBill() {
        return utilitiesBill;
    }

    public void setUtilitiesBill(float utilitiesBill) {
        this.utilitiesBill = utilitiesBill;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public float getExtraBill() {
        return extraBill;
    }

    public void setExtraBill(float extraBill) {
        this.extraBill = extraBill;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}