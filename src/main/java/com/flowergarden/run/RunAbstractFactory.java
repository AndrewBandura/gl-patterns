package com.flowergarden.run;

import com.flowergarden.flowers.Chamomile;
import com.flowergarden.flowers.Rose;
import com.flowergarden.pattern.abstract_factory.FlowerFactory;
import com.flowergarden.pattern.abstract_factory.FreshFlowerProducer;

public class RunAbstractFactory {

    public static void main(String[] args) {
        FlowerFactory roseFactory = FreshFlowerProducer.getFactory("RoseFactory");
        Rose rose = (Rose)roseFactory.create(10);
        rose.setSpike(true);

        FlowerFactory chamomileFactory = FreshFlowerProducer.getFactory("ChamomileFactory");
        Chamomile chamomile = (Chamomile)chamomileFactory.create(15);
        chamomile.setPetals(21);
    }
}
