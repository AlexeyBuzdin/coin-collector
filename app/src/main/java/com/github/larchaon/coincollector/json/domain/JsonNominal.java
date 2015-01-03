package com.github.larchaon.coincollector.json.domain;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class JsonNominal {
    @SerializedName("title")
    private String title;
    @SerializedName("coins")
    private List<JsonCoin> coins;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<JsonCoin> getCoins() {
        return coins;
    }

    public void setCoins(List<JsonCoin> coins) {
        this.coins = coins;
    }
}
