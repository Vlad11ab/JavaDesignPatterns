package app.builder.builders;

import app.builder.cars.CarType;
import app.builder.components.Engine;

public interface Builder {

    void setCarType(CarType carType);

    void setSeats(int seats);

    void setEngine(Engine engine);

}
