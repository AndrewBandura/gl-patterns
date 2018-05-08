package com.flowergarden.pattern.abstract_factory;

import com.flowergarden.flowers.Chamomile;
import com.flowergarden.flowers.Flower;
import com.flowergarden.flowers.Rose;
import com.flowergarden.properties.FreshnessInteger;

public class RoseFactory implements FlowerFactory {
    @Override
    public Flower<Integer> create(int freshness) {
        return new Rose(freshness);
    }
}
