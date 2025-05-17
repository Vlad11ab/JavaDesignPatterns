package app.prototypepattern.shapes;

public class Circle extends Shape{

    public Circle(String color){
        super(color);
    }

    @Override
    public void draw() {
        System.out.println("Cerc " + color );
    }

    @Override
    public Prototype toClone() {
        return new Circle(this.color);
    }
}
