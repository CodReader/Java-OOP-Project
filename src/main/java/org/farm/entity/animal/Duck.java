package org.farm.entity.animal;

import org.farm.entity.strategy.Fly;
import org.farm.entity.strategy.NotFly;

public class Duck extends Animals {
    public Duck(String breed, int weight) {
        super(breed, weight);
        flyable = new Fly();
    }

    @Override
    public void sound() {
        System.out.println("Duck make sound Crack Crack");
    }
}
