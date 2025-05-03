package app.singleton.cars.service;

import app.singleton.cars.model.Car;

public interface CarCommandService extends Data{

    Car addCar(Car car);
    Car remove(Car car);


}
