package com.maideneasydesign.wastemgmntmed.blugauge.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Timestamp;

@Entity( name = "bins")
public class Bins {
    @Id
    @GeneratedValue
    private int id;

    @Column
    private String bind_id;

    @Column
    private int angle;

    @Column
    private int battery_alarm;

    @Column
    private int capacity;

    @Column
    private String color;

    @Column
    private double latitude;

    @Column
    private double longitude;

    @Column
    private String place;

    @Column
    private int rsrp;

    @Column
    private int temperature;

    @Column
    private String sim_number;

    @Column
    private int tilt_alarm;

    @Column
    private int volt;

    @Column
    @DateTimeFormat(style = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private Timestamp last_updated;

    @Column
    private int height;
    @Column
    private int fire_alarm;
    @Column
    private int full_alarm;
    @Column
    private int frame_counter;
    @Column
    private int total_height;
    @Column
    String user_name;
    @Column
    private int top_Height;

    public Bins(int id, String bind_id, int angle, int battery_alarm, int capacity, String color, double latitude, double longitude, String place, int rsrp, int temperature, String sim_number, int tilt_alarm, int volt, Timestamp last_updated, int height, int fire_alarm, int full_alarm, int frame_counter, int total_height, String user_name, int top_Height) {
        this.id = id;
        this.bind_id = bind_id;
        this.angle = angle;
        this.battery_alarm = battery_alarm;
        this.capacity = capacity;
        this.color = color;
        this.latitude = latitude;
        this.longitude = longitude;
        this.place = place;
        this.rsrp = rsrp;
        this.temperature = temperature;
        this.sim_number = sim_number;
        this.tilt_alarm = tilt_alarm;
        this.volt = volt;
        this.last_updated = last_updated;
        this.height = height;
        this.fire_alarm = fire_alarm;
        this.full_alarm = full_alarm;
        this.frame_counter = frame_counter;
        this.total_height = total_height;
        this.user_name = user_name;
        this.top_Height = top_Height;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBind_id() {
        return bind_id;
    }

    public void setBind_id(String bind_id) {
        this.bind_id = bind_id;
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

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
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

    public String getSim_number() {
        return sim_number;
    }

    public void setSim_number(String sim_number) {
        this.sim_number = sim_number;
    }

    public int getTilt_alarm() {
        return tilt_alarm;
    }

    public void setTilt_alarm(int tilt_alarm) {
        this.tilt_alarm = tilt_alarm;
    }

    public int getVolt() {
        return volt;
    }

    public void setVolt(int volt) {
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

    public int getTotal_height() {
        return total_height;
    }

    public void setTotal_height(int total_height) {
        this.total_height = total_height;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public int getTop_Height() {
        return top_Height;
    }

    public void setTop_Height(int top_Height) {
        this.top_Height = top_Height;
    }
}

