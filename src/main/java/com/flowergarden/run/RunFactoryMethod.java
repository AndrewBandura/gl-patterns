package com.flowergarden.run;

import com.flowergarden.flowers.Chamomile;
import com.flowergarden.flowers.Flower;
import com.flowergarden.flowers.Rose;
import com.flowergarden.pattern.factory_method.ChamomileMaker;
import com.flowergarden.pattern.factory_method.FlowerMaker;
import com.flowergarden.pattern.factory_method.RoseMaker;

public class RunFactoryMethod {
    public static void main(String[] args) {

        FlowerMaker flowerMaker = new RoseMaker();
        Rose rose = (Rose) flowerMaker.make();
        rose.setSpike(true);

        flowerMaker = new ChamomileMaker();
        Chamomile chamomile = (Chamomile)flowerMaker.make();
        chamomile.setPetals(11);

    }
}
