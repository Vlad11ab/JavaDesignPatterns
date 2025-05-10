package app.factorypattern.factory.demo;

import app.factorypattern.factory.factory.ShapeFactory;
import app.factorypattern.factory.shapes.Shape;

public class demo {

    public static void main(String[] args){

        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shape1 = shapeFactory.getShape("Circle");
        shape1.draw();

        Shape shape2 = shapeFactory.getShape("Rectangle");
        shape2.draw();

        Shape shape3 = shapeFactory.getShape("Square");
        shape3.draw();

    }
}
