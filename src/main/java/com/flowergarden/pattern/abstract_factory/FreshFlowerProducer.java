package com.flowergarden.pattern.abstract_factory;

public class FreshFlowerProducer {
    public FreshFlowerProducer() {
        throw new AssertionError();
    }

    public static FlowerFactory getFactory(String factoryType){

        switch(factoryType){
            case "RoseFactory": return new RoseFactory();
            case "ChamomileFactory": return new ChamomileFactory();
        }
        return null;

    }
}
