package com.flowergarden.seller;

import com.flowergarden.flowers.GeneralFlower;
import com.flowergarden.pattern.observer.Observer;
import com.flowergarden.properties.FreshnessInteger;

public class Seller implements Observer {
    @Override
    public void handleEvent(GeneralFlower flower, FreshnessInteger freshness) {
        System.out.println(""+flower.toString()+" freshness changed. New one is: "+freshness.getFreshness());
    }
}
