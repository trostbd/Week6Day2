package com.example.lawre.week6day2.model;

public class Timesheet
{
    private float payRate, workedHours;
    private boolean isHourly;

    public Timesheet() {
    }

    public Timesheet(float payRate, float workedHours, boolean isHourly) {
        this.payRate = payRate;
        this.workedHours = workedHours;
        this.isHourly = isHourly;
    }

    public float getPayRate() {
        return payRate;
    }

    public void setPayRate(float payRate) {
        this.payRate = payRate;
    }

    public float getWorkedHours() {
        return workedHours;
    }

    public void setWorkedHours(float workedHours) {
        this.workedHours = workedHours;
    }

    public boolean isHourly() {
        return isHourly;
    }

    public void setHourly(boolean hourly) {
        isHourly = hourly;
    }
}
