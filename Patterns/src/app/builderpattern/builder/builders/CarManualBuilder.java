package app.builderpattern.builder.builders;

import app.builderpattern.builder.cars.CarType;
import app.builderpattern.builder.cars.Manual;
import app.builderpattern.builder.components.Engine;

public class CarManualBuilder implements Builder {
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


    public Manual getResult() {
        return new Manual(carType, seats, engine);
    }
}
