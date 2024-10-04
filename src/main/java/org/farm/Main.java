package org.farm;

import org.farm.entity.animal.Bull;
import org.farm.entity.animal.Cow;
import org.farm.entity.food.CombiFeed;
import org.farm.factory.SingletonFactory;
import org.farm.interfaces.*;
import org.farm.singleton.AnimalEnclosure;
import org.farm.singleton.Barn;
import org.farm.singleton.BuildingType;

public class Main {
    public static void main(String[] args) {
        Parrent parrent = new ClassChild();
        Parrent parrentSUB = new ClassSubChild();
        SubChild subChild = new ClassSubChild();
    }
}