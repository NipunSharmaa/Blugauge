package com.maideneasydesign.wastemgmntmed.blugauge.payload;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.maideneasydesign.wastemgmntmed.blugauge.model.Bins;
import com.maideneasydesign.wastemgmntmed.blugauge.model.Logic;

import java.util.List;
import java.util.Map;

public class BinsResponse {
   // are we using custom names during serialization and deserialization
    //of JSON thats why we are using @JsonProperty?
    @JsonProperty
    private String message;

    @JsonProperty
    private Bins bins;

    @JsonProperty(value= "binsList")
    private List<Bins> binsList;

    @JsonProperty
    private Map<String, Logic> map;

    public BinsResponse(String message, List<Bins> binsList) {
        this.message = message;

        this.binsList = binsList;
    }

    public BinsResponse(String message, Bins bins) {
        this.message = message;
        this.bins = bins;
    }

    public BinsResponse(String message, Bins bins, List<Bins> binsList) {
        this.message = message;
        this.bins = bins;
        this.binsList = binsList;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Bins getBins() {
        return bins;
    }

    public void setBins(Bins bins) {
        this.bins = bins;
    }

    public List<Bins> getBinsList() {
        return binsList;
    }

    public void setBinsList(List<Bins> binsList) {
        this.binsList = binsList;
    }
}

