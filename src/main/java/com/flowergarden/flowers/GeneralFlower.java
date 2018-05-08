package com.flowergarden.flowers;

import javax.xml.bind.annotation.XmlElement;

import com.flowergarden.pattern.observer.Observer;
import com.flowergarden.properties.FreshnessInteger;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

public class GeneralFlower implements Flower<Integer>, Comparable<GeneralFlower> {
	
	FreshnessInteger freshness;

	List<Observer> observers = new ArrayList<>();
	
	@XmlElement
	float price;
	
	@XmlElement
	int lenght;
	
	public void setFreshness(FreshnessInteger fr)
	{
		freshness = fr;
		notifyObservers(this, freshness);
	}
	
	@Override
	public FreshnessInteger getFreshness() {
		return freshness;
	}

	@Override
	public float getPrice() {
		return price;
	}

	@Override
	public int getLenght() {
		return lenght;
	}

	@Override
	public int compareTo(GeneralFlower compareFlower) {
		int compareFresh = compareFlower.getFreshness().getFreshness();		
		return this.getFreshness().getFreshness() - compareFresh;
	}

	@Override
	public void addObserver(Observer observer) {
		observers.add(observer);

	}

	@Override
	public void removeObserver(Observer observer) {
		observers.remove(observer);

	}

	@Override
	public void notifyObservers(GeneralFlower flower, FreshnessInteger freshness) {
		observers.forEach(observer -> observer.handleEvent(this, freshness));
	}
}
