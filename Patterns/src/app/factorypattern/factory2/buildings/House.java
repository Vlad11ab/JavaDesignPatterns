package app.factorypattern.factory2.buildings;



public class House implements Building {

    @Override
    public void build(){
        System.out.println("This is a House");
    }
}
