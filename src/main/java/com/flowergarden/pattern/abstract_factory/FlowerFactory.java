package com.flowergarden.pattern.abstract_factory;

import com.flowergarden.flowers.Chamomile;
import com.flowergarden.flowers.Flower;
import com.flowergarden.flowers.Rose;

public interface FlowerFactory {
    Flower<Integer> create(int freshness);
}
