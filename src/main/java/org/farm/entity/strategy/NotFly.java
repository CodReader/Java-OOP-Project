package org.farm.entity.strategy;

public class NotFly implements Flyable{
    @Override
    public String fly() {
        return "I can't fly";
    }
}
