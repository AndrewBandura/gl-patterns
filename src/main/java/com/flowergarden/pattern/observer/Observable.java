package com.flowergarden.pattern.observer;

import com.flowergarden.flowers.GeneralFlower;
import com.flowergarden.properties.FreshnessInteger;

import java.util.ArrayList;
import java.util.List;

public interface Observable {
    List<Observer> observers = new ArrayList<>();
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers(GeneralFlower flower, FreshnessInteger freshness);
}
