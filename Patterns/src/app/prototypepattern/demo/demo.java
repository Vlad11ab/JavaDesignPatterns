package app.prototypepattern.demo;

import app.prototypepattern.shapes.Circle;
import app.prototypepattern.shapes.Shape;
import app.prototypepattern.shapes.Square;


public class demo {

    public static void main (String [] args) {

        Shape cerc = new Circle("roșu");
        Shape patrat = new Square("albastru");

        Shape cercClonat = (Shape) cerc.toClone();
        Shape patratClonat = (Shape) patrat.toClone();

        cerc.draw();
        cercClonat.draw();

        patrat.draw();
        patratClonat.draw();
    }

}
