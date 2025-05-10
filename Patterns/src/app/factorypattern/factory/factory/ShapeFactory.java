package app.factorypattern.factory.factory;

import app.factorypattern.factory.shapes.Circle;
import app.factorypattern.factory.shapes.Rectangle;
import app.factorypattern.factory.shapes.Shape;
import app.factorypattern.factory.shapes.Square;

public class ShapeFactory {

    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        }
        if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        }
        if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }

        return null;

    }
}
