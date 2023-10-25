package com.maideneasydesign.wastemgmntmed.blugauge.model;

public class Data {

    private String filled;
    private String empty;
    private double fillPercentage;
    private double emptyPercentage;

    public Data(){}

    public Data(String filled, String empty, double fillPercentage) {
        this.filled = filled;
        this.empty = empty;
        this.fillPercentage = fillPercentage;
    }

    public String getFilled() {
        return filled;
    }

    public void setFilled(String filled) {
        this.filled = filled;
    }

    public String getEmpty() {
        return empty;
    }

    public void setEmpty(String empty) {
        this.empty = empty;
    }

    public double getFillPercentage() {
        return fillPercentage;
    }

    public void setFillPercentage(double fillPercentage) {
        this.fillPercentage = fillPercentage;
    }
}
