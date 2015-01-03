package com.github.larchaon.coincollector.json.domain;

import com.activeandroid.Model;
import com.google.gson.annotations.SerializedName;

public class JsonCoin extends Model {
    @SerializedName("year")
    private String year;
    @SerializedName("price")
    private String price;
    @SerializedName("mint")
    private String mint;

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getMint() {
        return mint;
    }

    public void setMint(String mint) {
        this.mint = mint;
    }
}
