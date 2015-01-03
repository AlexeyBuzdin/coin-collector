package com.github.larchaon.coincollector.json.domain;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class JsonCollection {
    @SerializedName("title")
    private String title;
    @SerializedName("nominal")
    private List<JsonNominal> nominal;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<JsonNominal> getNominal() {
        return nominal;
    }

    public void setNominal(List<JsonNominal> nominal) {
        this.nominal = nominal;
    }
}
