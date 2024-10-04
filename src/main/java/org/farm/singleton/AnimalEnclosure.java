package org.farm.singleton;

import org.farm.entity.animal.Animals;
import org.farm.entity.animal.Cow;

import java.util.ArrayList;
import java.util.List;

public class AnimalEnclosure implements Buildings {
    private static AnimalEnclosure instance;

    List<Animals> animalsInEnclosure;

    private AnimalEnclosure() {
        animalsInEnclosure = new ArrayList<>();
    }

    public static AnimalEnclosure getInstance() {
        if (instance == null) {
            instance = new AnimalEnclosure();
        }
        return instance;
    }

    public void addAnimal(Animals animal) {
        animalsInEnclosure.add(animal);
    }

    public void addAnimals(List<Animals> animals) {
        animalsInEnclosure.addAll(animals);
    }

    public List<Animals> getAnimalsInEnclosure() {
        return animalsInEnclosure;
    }


}
