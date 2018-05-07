package com.flowergarden.pattern.builder;

import com.flowergarden.flowers.Chamomile;
import com.flowergarden.properties.FreshnessInteger;

public class ChamomileBuilder {

    private int petals;
    FreshnessInteger freshness;
    float price;
    int lenght;

    public ChamomileBuilder setPetals(int petals) {
        this.petals = petals;
        return this;
    }

    public ChamomileBuilder setFreshness(FreshnessInteger freshness) {
        this.freshness = freshness;
        return this;
    }

    public ChamomileBuilder setPrice(float price) {
        this.price = price;
        return this;
    }

    public ChamomileBuilder setLenght(int lenght) {
        this.lenght = lenght;
        return this;
    }

    public FreshnessInteger getFreshness() {
        return freshness;
    }

    public float getPrice() {
        return price;
    }

    public int getLenght() {
        return lenght;
    }

    public int getPetals() {
        return petals;
    }

    public Chamomile build(){
        return new Chamomile( this);
    }

}
