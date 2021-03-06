package com.github.larchaon.coincollector.domain;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;

public class Coin extends Model {
    @Column(name = "year")
    private String year;
    @Column(name = "price")
    private String price;
    @Column(name = "mint")
    private String mint;
    @Column(name = "nominalFk")
    private Long nominalFk;

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

    public Long getNominalFk() {
        return nominalFk;
    }

    public void setNominalFk(Long nominalFk) {
        this.nominalFk = nominalFk;
    }
}
