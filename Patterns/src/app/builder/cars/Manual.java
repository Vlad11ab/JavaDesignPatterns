package app.builder.cars;

import app.builder.components.Engine;

public class Manual {
    private final CarType carType;
    private final int seats;
    private final Engine engine;

    public Manual(CarType carType, int seats, Engine engine){
        this.carType = carType;
        this.seats = seats;
        this.engine = engine;
    }

    public CarType getCarType() {
        return carType;
    }

    public int getSeats() {
        return seats;
    }

    public Engine getEngine() {
        return engine;
    }


    public String print() {
        String info = "";
        info += "Car Type: " + carType + "\n";
        info += "Seats: " + seats + "\n";
        info += "Engine: " + engine + "\n";

        return info;
    }



}
