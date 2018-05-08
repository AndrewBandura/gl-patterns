package com.flowergarden.run;

import com.flowergarden.flowers.GeneralFlower;
import com.flowergarden.properties.FreshnessInteger;
import com.flowergarden.seller.Seller;

public class RunObserver {
    public static void main(String[] args) {

        GeneralFlower flower = new GeneralFlower();
        flower.addObserver(new Seller());
        flower.setFreshness(new FreshnessInteger(2));

    }
}
