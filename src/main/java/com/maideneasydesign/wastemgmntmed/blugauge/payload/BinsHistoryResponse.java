package com.maideneasydesign.wastemgmntmed.blugauge.payload;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.maideneasydesign.wastemgmntmed.blugauge.model.BinsHistory;

public class BinsHistoryResponse<T> {

    @JsonProperty
    private String message;

    @JsonProperty
    private BinsHistory binsHistory;

    @JsonProperty
    private int listsize;

    private T binsHistoryList;

    public BinsHistoryResponse(String message, int listsize, T binsHistoryList) {
        this.message = message;
        this.listsize = listsize;
        this.binsHistoryList = binsHistoryList;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public BinsHistory getBinsHistory() {
        return binsHistory;
    }

    public void setBinsHistory(BinsHistory binsHistory) {
        this.binsHistory = binsHistory;
    }

    public T getBinsHistoryList() {
        return binsHistoryList;
    }



    public void setBinsHistoryList(T binsHistoryList) {
        this.binsHistoryList = binsHistoryList;
    }
    public BinsHistoryResponse(String message, BinsHistory binsHistory) {
        this.message = message;
        this.binsHistory = binsHistory;
    }

}
