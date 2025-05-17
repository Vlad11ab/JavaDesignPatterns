package app.prototypepattern.shapes;

public abstract class Shape implements Prototype{
    protected String color;

    public Shape(String color){
        this.color = color;
    }

    public abstract void draw();

    }

