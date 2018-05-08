package com.flowergarden.flowers;

import javax.xml.bind.annotation.XmlRootElement;

import com.flowergarden.pattern.builder.RoseBuilder;
import com.flowergarden.properties.FreshnessInteger;
import lombok.Setter;

@Setter
@XmlRootElement
public class Rose extends GeneralFlower {
	
	private boolean spike;
	
	public Rose(boolean spike, int lenght, float price, FreshnessInteger fresh){
		this.spike = spike;
		this.lenght = lenght;
		this.price = price;
		this.freshness = fresh;
	}
	public Rose(){
		
	}

	public Rose(int freshness){
		this.freshness = new FreshnessInteger(freshness);

	}

	public Rose(RoseBuilder builder){
		this.spike = builder.isSpike();
		this.lenght = builder.getLenght();
		this.price = builder.getPrice();
		this.freshness = builder.getFreshness();
	}
	
	public boolean getSpike(){
		return spike;
	}
	


}
