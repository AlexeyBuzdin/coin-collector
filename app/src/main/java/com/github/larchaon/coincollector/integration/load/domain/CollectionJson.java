package com.github.larchaon.coincollector.integration.load.domain;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class CollectionJson {
    @SerializedName("title")
    private String title;
    @SerializedName("nominal")
    private List<NominalJson> nominal;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<NominalJson> getNominal() {
        return nominal;
    }

    public void setNominal(List<NominalJson> nominal) {
        this.nominal = nominal;
    }
}
