package app.builderpattern.builder.director;

import app.builderpattern.builder.builders.Builder;
import app.builderpattern.builder.cars.CarType;
import app.builderpattern.builder.components.Engine;

public class Director {

    public void constructSportsCar(Builder builder) {
        builder.setCarType(CarType.sportsCar);
        builder.setSeats(2);
        builder.setEngine(new Engine(3.0, 0));
    }

    public void constructCityCar(Builder builder) {
        builder.setCarType(CarType.cityCar);
        builder.setSeats(4);
        builder.setEngine(new Engine(1.4, 0));
    }

    public void constructSUV(Builder builder) {
        builder.setCarType(CarType.SUV);
        builder.setSeats(4);
        builder.setEngine(new Engine(2.5, 0));
    }


}
