package com.flowergarden.flowers;

import com.flowergarden.pattern.builder.ChamomileBuilder;
import com.flowergarden.pattern.builder.RoseBuilder;
import com.flowergarden.properties.FreshnessInteger;

public class Chamomile extends GeneralFlower {
	
	private int petals;

	public Chamomile() {
	}

	public Chamomile(int freshness) {
		this.freshness = new FreshnessInteger(freshness);
	}

	public Chamomile(int petals, int lenght, float price, FreshnessInteger fresh){
		this.petals = petals;
		this.lenght = lenght;
		this.price = price;
		this.freshness = fresh;
	}

	public Chamomile(ChamomileBuilder builder){
		this.petals = builder.getPetals();
		this.lenght = builder.getLenght();
		this.price = builder.getPrice();
		this.freshness = builder.getFreshness();
	}
	
	public boolean getPetal(){
		if (petals <=0) return false;
		petals =-1;
		return true;
	}
	
	public int getPetals(){
		return petals;
	}
	


}
