package com.github.larchaon.coincollector.domain;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;

import java.util.List;

public class Nominal extends Model {
    @Column(name = "title")
    private String title;
    @Column(name = "collectionFk")
    private Long collectionFk;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getCollectionFk() {
        return collectionFk;
    }

    public void setCollectionFk(Long collectionFk) {
        this.collectionFk = collectionFk;
    }

    public List<Coin> getCoins() {
        return getMany(Coin.class, "nominal");
    }
}
