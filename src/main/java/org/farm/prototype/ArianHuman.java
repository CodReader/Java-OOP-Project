package org.farm.prototype;

public class ArianHuman extends Human {
    private final String name;

    public ArianHuman(String race, String name) {
        super(race);
        this.name = name;
    }

    @Override
    public String getRace() {
        return race;
    }

    public String getName() {
        return name;
    }
}
