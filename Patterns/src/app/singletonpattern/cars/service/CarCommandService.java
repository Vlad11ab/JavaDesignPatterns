package app.singletonpattern.cars.service;

import app.singletonpattern.cars.model.Car;

public interface CarCommandService extends Data{

    Car addCar(Car car);
    Car remove(Car car);


}
