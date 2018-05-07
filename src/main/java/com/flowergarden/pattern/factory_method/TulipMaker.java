package com.flowergarden.pattern.factory_method;

import com.flowergarden.flowers.Flower;
import com.flowergarden.flowers.Tulip;

public class TulipMaker implements FlowerMaker {
    @Override
    public Flower make() {
        return new Tulip();
    }
}
