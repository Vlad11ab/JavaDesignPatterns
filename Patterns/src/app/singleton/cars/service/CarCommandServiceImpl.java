package app.singleton.cars.service;

import app.singleton.cars.model.Car;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class CarCommandServiceImpl implements CarCommandService {

    private ArrayList<Car> cars;
    private String filename;

    public CarCommandServiceImpl() {

        this.cars = new ArrayList<>();
        this.loadData();
    }

    @Override
    public void loadData() {

        try {
            String filepath = "/Users/vlad11ab/Documents/mycode/DesignPatterns/Patterns/src/app/cars/data/masini.txt";
            File file = new File(filepath);
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                this.cars.add(new Car(line));
            }

        }catch (Exception e) {
            e.printStackTrace();
        }
    }


    @Override
    public Car addCar(Car car) {
        this.cars.add(car);
        return car;
    }

    @Override
    public Car remove(Car car) {
        for(Car c : cars) {
            if (c.equals(car)) {
                this.cars.remove(c);
            }
        }
        return car;
    }


    @Override
    public void saveData() {
        String filePath="/Users/vlad11ab/Documents/mycode/DesignPatterns/Patterns/src/app.singleton.cars/data/masini.txt";
        try (FileWriter fileWriter = new FileWriter(filePath, false);
             PrintWriter printWriter = new PrintWriter(fileWriter)) {
            for (Car c : cars) {
                printWriter.println(c.toString());
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }


}


