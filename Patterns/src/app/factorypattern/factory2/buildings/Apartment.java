package app.factorypattern.factory2.buildings;

public class Apartment implements Building {

    @Override
    public void build(){
        System.out.println("This is an Apartment");
    }
}
