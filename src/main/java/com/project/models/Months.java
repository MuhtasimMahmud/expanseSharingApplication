package com.project.models;

import java.time.Year;

public class Months {

    private Months months;
    private float rent;
    private float foodBill;
    private float utilitiesBill;
    private Year year;
    private float extraBill;

    public Months(){

    }

    public Months(Months months, float rent, float foodBill, float utilitiesBill, Year year, float extraBill) {
        this.months = months;
        this.rent = rent;
        this.foodBill = foodBill;
        this.utilitiesBill = utilitiesBill;
        this.year = year;
        this.extraBill = extraBill;
    }


    public Months getMonths() {
        return months;
    }

    public void setMonths(Months months) {
        this.months = months;
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

    public Year getYear() {
        return year;
    }

    public void setYear(Year year) {
        this.year = year;
    }

    public float getExtraBill() {
        return extraBill;
    }

    public void setExtraBill(float extraBill) {
        this.extraBill = extraBill;
    }
}
