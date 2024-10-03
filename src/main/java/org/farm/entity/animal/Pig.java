package org.farm.entity.animal;

import org.farm.entity.strategy.NotFly;

public class Pig extends Animals{
    public Pig(String breed, int weight) {
        super(breed, weight);
        flyable = new NotFly();
    }

    @Override
    public void sound() {
        System.out.println("Pig make sounds Hru hru hru");
    }
}
