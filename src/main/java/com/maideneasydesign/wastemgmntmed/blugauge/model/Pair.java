package com.maideneasydesign.wastemgmntmed.blugauge.model;

public class Pair {

    private String time;
    private double fillPercentage;


    public Pair(String time, double fillPercentage) {
        this.time = time;
        this.fillPercentage = fillPercentage;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public double getFillPercentage() {
        return fillPercentage;
    }

    public void setFillPercentage(double fillPercentage) {
        this.fillPercentage = fillPercentage;
    }
}
