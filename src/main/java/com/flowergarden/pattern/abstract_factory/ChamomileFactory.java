package com.flowergarden.pattern.abstract_factory;

import com.flowergarden.flowers.Chamomile;
import com.flowergarden.flowers.Flower;

public class ChamomileFactory implements FlowerFactory {
    @Override
    public Flower create(int freshness) {
        return new Chamomile(freshness);
    }
}
