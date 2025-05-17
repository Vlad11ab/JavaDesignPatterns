package app.prototypepattern.shapes;

public class Square extends Shape{

    public Square(String color){
        super(color);
    }

    @Override
    public void draw() {
        System.out.println("Patrat " + color);
    }

    @Override
    public Prototype toClone() {
        return new Square(this.color);
    }
}
