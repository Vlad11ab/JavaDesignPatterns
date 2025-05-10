package app.factorypattern.factory2.buildings;

public class Villa implements Building{

    @Override
    public void build() {
        System.out.println("This is a Villa");
    }
}
