package app.singletonpattern.cars.service;

import app.singletonpattern.cars.model.Car;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class CarQueryServiceImpl implements CarQueryService {

 private ArrayList<Car> cars;



 public CarQueryServiceImpl() {
     cars = new ArrayList<>();

 }

     @Override
     public void loadData() {
         try {
             String filePath = "/Users/vlad11ab/Documents/mycode/DesignPatterns/Patterns/src/app.singleton.cars/data/masini.txt";
             File file = new File(filePath);
             Scanner sc = new Scanner(file);
             while (sc.hasNextLine()) {

                 String line = sc.nextLine();
             }
         }catch (Exception e){
             e.printStackTrace();
         }

     }



    @Override
    public void afisare(){
        for(Car c : cars)
            System.out.println(c.toString());
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
