package app.factory.factory;

import app.factory.shapes.Circle;
import app.factory.shapes.Rectangle;
import app.factory.shapes.Shape;
import app.factory.shapes.Square;

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
