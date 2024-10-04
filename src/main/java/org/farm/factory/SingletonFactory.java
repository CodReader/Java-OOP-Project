package org.farm.factory;

import org.farm.singleton.AnimalEnclosure;
import org.farm.singleton.Barn;
import org.farm.singleton.BuildingType;
import org.farm.singleton.Buildings;

public class SingletonFactory implements BuildingInitialization {
    @Override
    public Buildings creatingBuilding(BuildingType buildingType) {
        return switch (buildingType) {
            case BARN -> Barn.getInstance();
            case ENCLOSURE -> AnimalEnclosure.getInstance();
        };
    }
}
