package org.farm.entity.animal;

import org.farm.entity.strategy.NotFly;

public class Sheep extends Animals {
    public Sheep(String breed, int weight) {
        super(breed, weight);
        flyable = new NotFly();
    }

    @Override
    public void sound() {
        System.out.println("Sheep make sound Be be be");
    }
}
