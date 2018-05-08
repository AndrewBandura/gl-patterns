package com.flowergarden.run;

import com.flowergarden.bouquet.Bouquet;
import com.flowergarden.bouquet.MarriedBouquet;
import com.flowergarden.flowers.Chamomile;
import com.flowergarden.flowers.GeneralFlower;
import com.flowergarden.flowers.Rose;
import com.flowergarden.flowers.Tulip;
import com.flowergarden.pattern.builder.RoseBuilder;
import com.flowergarden.pattern.iterator.CustomIterator;
import com.flowergarden.properties.FreshnessInteger;

import java.util.Arrays;

public class RunIterator {

    public static void main(String[] args) {

        Bouquet bouquet = new MarriedBouquet();
        ((MarriedBouquet) bouquet).setFlowerList(Arrays.asList(new Rose(), new Chamomile(), new Tulip()));

        CustomIterator<GeneralFlower> iterator = bouquet.iterator(true);
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        CustomIterator<GeneralFlower> reverseIterator = bouquet.iterator(false);
        while (reverseIterator.hasPrevious()){
            System.out.println(reverseIterator.previous());
        }

    }
}
