package com.maideneasydesign.wastemgmntmed.blugauge.model;


import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Timestamp;

@Entity(name= "bins_history")
public class BinsHistory {

    @Id
    @GeneratedValue
    private int id;

    @Column
    private String bin_id;

    @Column
    private int angle;

    @Column
    private int battery_alarm;

    @Column
    private int rsrp;

    @Column
    private int temperature;

    @Column
    private int tilt_alarm;

    @Column
    private double volt;

    @Column
    @DateTimeFormat(style = "yyyy-MM-dd HH:mm:ss")
    private Timestamp last_updated;

    @Column
    private int height;

    @Column
    private int fire_alarm;

    @Column
    private int full_alarm;

    @Column
    private int frame_counter;

    public BinsHistory(){}


    public BinsHistory(int id, String bin_id, int angle, int battery_alarm, int rsrp, int temperature, int tilt_alarm, double volt, Timestamp last_updated, int height, int fire_alarm, int full_alarm, int frame_counter) {
        this.id = id;
        this.bin_id = bin_id;
        this.angle = angle;
        this.battery_alarm = battery_alarm;
        this.rsrp = rsrp;
        this.temperature = temperature;
        this.tilt_alarm = tilt_alarm;
        this.volt = volt;
        this.last_updated = last_updated;
        this.height = height;
        this.fire_alarm = fire_alarm;
        this.full_alarm = full_alarm;
        this.frame_counter = frame_counter;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBin_id() {
        return bin_id;
    }

    public void setBin_id(String bin_id) {
        this.bin_id = bin_id;
    }

    public int getAngle() {
        return angle;
    }

    public void setAngle(int angle) {
        this.angle = angle;
    }

    public int getBattery_alarm() {
        return battery_alarm;
    }

    public void setBattery_alarm(int battery_alarm) {
        this.battery_alarm = battery_alarm;
    }

    public int getRsrp() {
        return rsrp;
    }

    public void setRsrp(int rsrp) {
        this.rsrp = rsrp;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getTilt_alarm() {
        return tilt_alarm;
    }

    public void setTilt_alarm(int tilt_alarm) {
        this.tilt_alarm = tilt_alarm;
    }

    public double getVolt() {
        return volt;
    }

    public void setVolt(double volt) {
        this.volt = volt;
    }

    public Timestamp getLast_updated() {
        return last_updated;
    }

    public void setLast_updated(Timestamp last_updated) {
        this.last_updated = last_updated;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getFire_alarm() {
        return fire_alarm;
    }

    public void setFire_alarm(int fire_alarm) {
        this.fire_alarm = fire_alarm;
    }

    public int getFull_alarm() {
        return full_alarm;
    }

    public void setFull_alarm(int full_alarm) {
        this.full_alarm = full_alarm;
    }

    public int getFrame_counter() {
        return frame_counter;
    }

    public void setFrame_counter(int frame_counter) {
        this.frame_counter = frame_counter;
    }
}
