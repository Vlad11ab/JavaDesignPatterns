package app.builderpattern.builder.builders;

import app.builderpattern.builder.cars.CarType;
import app.builderpattern.builder.components.Engine;

public interface Builder {

    void setCarType(CarType carType);

    void setSeats(int seats);

    void setEngine(Engine engine);

}
