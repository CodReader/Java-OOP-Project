package org.farm;

import org.farm.entity.animal.Bull;
import org.farm.entity.animal.Cow;
import org.farm.entity.food.CombiFeed;
import org.farm.factory.SingletonFactory;
import org.farm.interfaces.*;
import org.farm.prototype.ArianHuman;
import org.farm.prototype.Human;
import org.farm.singleton.AnimalEnclosure;
import org.farm.singleton.Barn;
import org.farm.singleton.BuildingType;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Human arianHuman = new ArianHuman("Arian","John");
        List<Human> population = new ArrayList<>();
        System.out.println(" | Arian race :" + arianHuman.getRace() + " | arian class :" + arianHuman.getClass().getName()
                + "| arian name :" + arianHuman);

    }
}