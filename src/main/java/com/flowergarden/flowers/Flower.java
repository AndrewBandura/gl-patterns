package com.flowergarden.flowers;

import com.flowergarden.pattern.observer.Observable;
import com.flowergarden.properties.Freshness;

public interface Flower<T> extends Observable {
	Freshness<T> getFreshness();
	float getPrice();
	int getLenght();
}
