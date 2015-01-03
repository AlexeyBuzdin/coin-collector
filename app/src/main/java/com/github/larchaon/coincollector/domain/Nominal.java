package com.github.larchaon.coincollector.domain;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Nominal {
    @SerializedName("title")
    private String title;
    @SerializedName("coins")
    private List<Coin> coins;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Coin> getCoins() {
        return coins;
    }

    public void setCoins(List<Coin> coins) {
        this.coins = coins;
    }
}
