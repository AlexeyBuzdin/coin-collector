package com.github.larchaon.coincollector.integration.load;

import com.github.larchaon.coincollector.domain.Coin;
import com.github.larchaon.coincollector.domain.Collection;
import com.github.larchaon.coincollector.domain.Nominal;
import com.github.larchaon.coincollector.integration.load.domain.BeanMapper;
import com.github.larchaon.coincollector.integration.load.domain.CollectionJson;

import java.util.List;

public class LoadService {

    @Inject
    BeanMapper beanMapper;

    @Inject
    JsonDeserializator deserializator;

    public Collection loadCollection(String json) {
        CollectionJson collectionJson = deserializator.toCollection(json);

        Collection collection = beanMapper.toCollection(collectionJson);
        collection.save();

        List<Nominal> nominals = beanMapper.toNominal(collectionJson, collection);
        for (Nominal nominal : nominals) {
            nominal.save();
            List<Coin> coins = beanMapper.toCoin(collectionJson, nominal);
            for (Coin coin : coins) {
                coin.save();
            }
        }
        return collection;
    }
}
