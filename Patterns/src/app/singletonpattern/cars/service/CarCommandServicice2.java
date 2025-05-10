package app.singletonpattern.cars.service;

import app.singletonpattern.cars.model.Car;

public class CarCommandServicice2 implements CarCommandService{

    public  CarCommandServicice2(){
        System.out.println("eu sunt 2");
    }
    @Override
    public Car addCar(Car car) {
        return null;
    }

    @Override
    public Car remove(Car car) {
        return null;
    }

    @Override
    public void loadData() {

    }

    @Override
    public void saveData() {

    }
}
