package com.maideneasydesign.wastemgmntmed.blugauge.model;



import java.util.ArrayList;

public class Logic {
    private ArrayList<Pair> filledTimes;
    private ArrayList<Pair> emptyTimes;

    private double highestFilled;

    private double lowestFilled;
    private String place;
    private String capacity;
    private String color;

    public Logic(ArrayList<Pair> filledTimes, ArrayList<Pair> emptyTimes, double highestFilled, double lowestFilled, String place, String capacity, String color) {
        this.filledTimes = filledTimes;
        this.emptyTimes = emptyTimes;
        this.highestFilled = highestFilled;
        this.lowestFilled = lowestFilled;
        this.place = place;
        this.capacity = capacity;
        this.color = color;
    }

    public ArrayList<Pair> getFilledTimes() {
        return filledTimes;
    }

    public void setFilledTimes(ArrayList<Pair> filledTimes) {
        this.filledTimes = filledTimes;
    }

    public ArrayList<Pair> getEmptyTimes() {
        return emptyTimes;
    }

    public void setEmptyTimes(ArrayList<Pair> emptyTimes) {
        this.emptyTimes = emptyTimes;
    }

    public double getHighestFilled() {
        return highestFilled;
    }

    public void setHighestFilled(double highestFilled) {
        this.highestFilled = highestFilled;
    }

    public double getLowestFilled() {
        return lowestFilled;
    }

    public void setLowestFilled(double lowestFilled) {
        this.lowestFilled = lowestFilled;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
