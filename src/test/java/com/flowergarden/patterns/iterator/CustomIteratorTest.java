package com.flowergarden.patterns.iterator;

import com.flowergarden.bouquet.MarriedBouquet;
import com.flowergarden.flowers.Chamomile;
import com.flowergarden.flowers.GeneralFlower;
import com.flowergarden.flowers.Rose;
import com.flowergarden.flowers.Tulip;
import com.flowergarden.pattern.iterator.CustomIterator;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static junit.framework.TestCase.assertEquals;

public class CustomIteratorTest {

    MarriedBouquet bouquet;

    @Before
    public void setUp(){
        bouquet = new MarriedBouquet();
        bouquet.setFlowerList(Arrays.asList(new Rose(), new Chamomile(), new Tulip()));
    }

    @Test
    public void iterateForwardTest(){
        CustomIterator<GeneralFlower> iterator = bouquet.iterator(true);
        int countExpected = bouquet.getFlowerList().size();
        int countActual = 0;
        while (iterator.hasNext()){
            iterator.next();
            countActual++;
       }

        assertEquals(countExpected, countActual);

    }

    @Test
    public void iterateReverseTest(){
        CustomIterator<GeneralFlower> iterator = bouquet.iterator(false);
        int countExpected = bouquet.getFlowerList().size();
        int countActual = 0;
        while (iterator.hasPrevious()){
            iterator.previous();
            countActual++;
        }

        assertEquals(countExpected, countActual);

    }
}
