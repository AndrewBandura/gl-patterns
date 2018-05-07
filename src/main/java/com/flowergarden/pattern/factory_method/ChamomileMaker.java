package com.flowergarden.pattern.factory_method;

import com.flowergarden.flowers.Chamomile;
import com.flowergarden.flowers.Flower;

public class ChamomileMaker implements FlowerMaker {
    @Override
    public Flower make() {
        return new Chamomile();
    }
}
