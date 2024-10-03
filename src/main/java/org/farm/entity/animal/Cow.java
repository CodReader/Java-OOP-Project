package org.farm.entity.animal;

import org.farm.entity.strategy.NotFly;

public class Cow extends Animals{
    public Cow(String breed, int weight) {
        super(breed, weight);
        flyable = new NotFly();
    }

    @Override
    public void sound() {
        System.out.println("Cow make sound Mu Mu");
    }

}
