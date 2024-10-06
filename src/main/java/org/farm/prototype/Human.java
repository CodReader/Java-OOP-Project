package org.farm.prototype;

public abstract class Human {
    protected String race;

    protected Human(String race) {
        this.race = race;
    }

    public abstract String getRace();

    public abstract Human clone();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Human human = (Human) o;

        return getRace() != null ? getRace().equals(human.getRace()) : human.getRace() == null;
    }

    @Override
    public int hashCode() {
        return getRace() != null ? getRace().hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Human{" +
                "race='" + race + '\'' +
                '}';
    }
}
