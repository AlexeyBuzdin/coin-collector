package com.github.larchaon.coincollector.domain;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;

import java.util.List;

public class Collection extends Model {
    @Column(name = "title")
    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Nominal> getNominal() {
        return getMany(Nominal.class, "collectionFk");
    }
}
