package com.github.larchaon.coincollector.domain;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Collection {
    @SerializedName("title")
    private String title;
    @SerializedName("nominal")
    private List<Nominal> nominal;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Nominal> getNominal() {
        return nominal;
    }

    public void setNominal(List<Nominal> nominal) {
        this.nominal = nominal;
    }
}
