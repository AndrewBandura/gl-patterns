package com.flowergarden.pattern.factory_method;

import com.flowergarden.flowers.Flower;
import com.flowergarden.flowers.Rose;

public class RoseMaker implements FlowerMaker {
    @Override
    public Flower make() {
        return new Rose();
    }
}
