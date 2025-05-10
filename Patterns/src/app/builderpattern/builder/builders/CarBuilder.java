package app.builderpattern.builder.builders;

import app.builderpattern.builder.cars.Car;
import app.builderpattern.builder.cars.CarType;
import app.builderpattern.builder.components.Engine;

public class CarBuilder implements Builder {
    private CarType carType;
    private int seats;
    private Engine engine;

    @Override
    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }


    public Car getResult() {
        return new Car(carType, seats, engine);
    }


}
