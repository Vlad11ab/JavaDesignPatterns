package app.builder.builders;

import app.builder.cars.CarType;
import app.builder.cars.Manual;
import app.builder.components.Engine;

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
