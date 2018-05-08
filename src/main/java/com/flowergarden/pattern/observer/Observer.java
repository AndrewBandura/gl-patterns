package com.flowergarden.pattern.observer;

import com.flowergarden.flowers.GeneralFlower;
import com.flowergarden.properties.Freshness;
import com.flowergarden.properties.FreshnessInteger;

public interface Observer {
    void handleEvent(GeneralFlower flower, FreshnessInteger freshness);
}
