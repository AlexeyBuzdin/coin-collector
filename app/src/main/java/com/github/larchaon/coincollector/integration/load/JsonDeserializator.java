package com.github.larchaon.coincollector.integration.load;

import com.github.larchaon.coincollector.integration.load.domain.CollectionJson;
import com.google.gson.Gson;

public class JsonDeserializator {

    public CollectionJson toCollection(String json) {
        return new Gson().fromJson(json, CollectionJson.class);
    }
}
