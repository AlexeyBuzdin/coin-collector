package com.github.larchaon.coincollector.integration.load.domain;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class NominalJson {
    @SerializedName("title")
    private String title;
    @SerializedName("coins")
    private List<CoinJson> coins;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<CoinJson> getCoins() {
        return coins;
    }

    public void setCoins(List<CoinJson> coins) {
        this.coins = coins;
    }
}
