package app.factorypattern.factory2.demo;


import app.factorypattern.factory2.buildings.Building;
import app.factorypattern.factory2.factory.BuildFactory;

public class demo {

    public static void main (String [] args) {

        BuildFactory buildFactory = new BuildFactory();

        Building building1 = buildFactory.getBuilding("HOUSE");
        building1.build();

        Building building2 = buildFactory.getBuilding("APARTMENT");
        building2.build();

        Building building3 = buildFactory.getBuilding("VILLA");
        building3.build();

    }

}
