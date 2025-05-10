package app.factory2.factory;

import app.factory2.buildings.Apartment;
import app.factory2.buildings.Building;
import app.factory2.buildings.House;
import app.factory2.buildings.Villa;

public class BuildFactory {

    public Building getBuilding(String buildingType) {
        if (buildingType.equalsIgnoreCase("HOUSE")) {
            return new House();
        }
        if(buildingType.equalsIgnoreCase("Apartment")){
            return new Apartment();
        }
        if(buildingType.equalsIgnoreCase("VILLA")){
            return new Villa();
        }

        return null;
    }

}
