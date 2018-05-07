package com.flowergarden.pattern.builder;

import com.flowergarden.flowers.Rose;
import com.flowergarden.properties.FreshnessInteger;

public class RoseBuilder {
    private boolean spike;
    FreshnessInteger freshness;
    float price;
    int lenght;

    public RoseBuilder setSpike(boolean spike) {
        this.spike = spike;
        return this;
    }

    public RoseBuilder setFreshness(FreshnessInteger freshness) {
        this.freshness = freshness;
        return this;
    }

    public RoseBuilder setPrice(float price) {
        this.price = price;
        return this;
    }

    public RoseBuilder setLenght(int lenght) {
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


    public boolean isSpike() {
        return spike;
    }

    public Rose build(){
        return new Rose( this);
    }


}
