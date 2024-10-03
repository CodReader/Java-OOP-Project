package org.farm.entity.animal;

import org.farm.entity.strategy.NotFly;

public class Bull extends Animals {
    public Bull(String breed, int weight) {
        super(breed, weight);
        flyable = new NotFly();
    }

    @Override
    public void sound() {
        System.out.println("Bull make sound Mu Mu Mu Mu");
    }
}
