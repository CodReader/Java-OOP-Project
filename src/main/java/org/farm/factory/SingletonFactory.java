package org.farm.factory;

import org.farm.singleton.Barn;
import org.farm.singleton.Buildings;

public class SingletonFactory implements BuildingInitialization {
    @Override
    public Buildings creatingBuilding(String type) {
        return switch (type) {
            case "Barn" -> Barn.getInstance();
            case null -> null;
            default -> throw new IllegalStateException("Unexpected value: " + type);
        };
    }
}
