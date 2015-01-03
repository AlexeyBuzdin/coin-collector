package com.github.larchaon.coincollector.integration.load.domain;

import com.github.larchaon.coincollector.domain.Coin;
import com.github.larchaon.coincollector.domain.Collection;
import com.github.larchaon.coincollector.domain.Nominal;

import java.util.ArrayList;
import java.util.List;

public class BeanMapper {

    public Collection toCollection(CollectionJson jsonDto) {
        Collection collection = new Collection();
        collection.setTitle(jsonDto.getTitle());
        return collection;
    }

    public List<Nominal> toNominal(CollectionJson jsonDto, Collection collection) {
        List<NominalJson> nominalJsons = jsonDto.getNominal();
        List<Nominal> result = new ArrayList<Nominal>(nominalJsons.size());
        for (NominalJson nominalJson : nominalJsons) {
            result.add(toNominal(nominalJson, collection));
        }
        return result;
    }

    public Nominal toNominal(NominalJson nominalJson, Collection collection) {
        Nominal nominal = new Nominal();
        nominal.setTitle(nominalJson.getTitle());
        nominal.setCollectionFk(collection.getId());
        return nominal;
    }

    public List<Coin> toCoin(CollectionJson jsonDto, Nominal nominal) {
        List<NominalJson> nominalJsons = jsonDto.getNominal();
        NominalJson nominalJson = findNominalForTitle(nominalJsons, nominal);

        List<Coin> result = new ArrayList<Coin>(nominalJson.getCoins().size());
        for (CoinJson coinJson : nominalJson.getCoins()) {
            result.add(toCoin(coinJson, nominal));
        }
        return result;
    }

    public Coin toCoin(CoinJson coinJson, Nominal nominal) {
        Coin coin = new Coin();
        coin.setMint(coinJson.getMint());
        coin.setPrice(coinJson.getPrice());
        coin.setYear(coinJson.getYear());
        coin.setNominalFk(nominal.getId());
        return coin;
    }

    private NominalJson findNominalForTitle(List<NominalJson> nominalJsons, Nominal nominal) {
        for (NominalJson nominalJson : nominalJsons) {
            if (nominalJson.getTitle().equals(nominal.getTitle())) return nominalJson;
        }
        return null;
    }
}
