package org.farm.entity.animal;

import org.farm.entity.strategy.Flyable;

public abstract class Animals {
    private final String breed;
    private final int weight;

    public Flyable flyable;

    public void setFlyable(Flyable flyable) {
        this.flyable = flyable;
    }

    protected Animals(String breed, int weight) {
        this.breed = breed;
        this.weight = weight;
    }

    public String performFly() {
        if (flyable == null) {
            return "This animal cannot fly.";
        }
        return flyable.fly();
    }

    public String getBreed() {
        return breed;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "breed='" + breed + '\'' +
                ", weight=" + weight +
                '}';
    }

    public abstract void sound();
}