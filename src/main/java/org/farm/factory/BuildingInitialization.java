package org.farm.factory;

import org.farm.singleton.BuildingType;
import org.farm.singleton.Buildings;

public interface BuildingInitialization {
   Buildings creatingBuilding(BuildingType buildingType);
}
