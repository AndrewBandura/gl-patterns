package com.flowergarden.run;

import com.flowergarden.flowers.Rose;
import com.flowergarden.pattern.builder.RoseBuilder;
import com.flowergarden.properties.FreshnessInteger;

public class RunBuilder {

    public static void main(String[] args) {
        RoseBuilder roseBuilder= new RoseBuilder();
        Rose rose = roseBuilder.setLenght(10).setFreshness(new FreshnessInteger(2)).setPrice(20f).setSpike(true).build();

        System.out.println(rose.getSpike());
    }
}
