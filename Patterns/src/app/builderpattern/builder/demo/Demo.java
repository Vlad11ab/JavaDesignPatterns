package app.builderpattern.builder.demo;

import app.builderpattern.builder.builders.CarBuilder;
import app.builderpattern.builder.builders.CarManualBuilder;
import app.builderpattern.builder.cars.Car;
import app.builderpattern.builder.cars.Manual;
import app.builderpattern.builder.director.Director;

public class Demo {




    public static void main(String[] args) {
        Director director = new Director();
        CarBuilder builder = new CarBuilder();


        director.constructSportsCar(builder);

        Car car = builder.getResult();
        System.out.println("Car built:\n" + car.getCarType());



        CarManualBuilder manualBuilder = new CarManualBuilder();

        director.constructSportsCar(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println("\nCar manual built:\n" + carManual.print());
    }




}
