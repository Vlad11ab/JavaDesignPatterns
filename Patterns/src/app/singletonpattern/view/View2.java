package app.singletonpattern.view;

import app.singletonpattern.cars.service.CarCommandService;
import app.singletonpattern.cars.service.CarCommandServiceSingleton;
import app.singletonpattern.cars.service.CarQueryService;
import app.singletonpattern.cars.service.CarQueryServiceSingleton;

public class View2 {
    private CarCommandService carCommandService;
    private CarQueryService carQueryService;


    public View2() {

        this.carCommandService = CarCommandServiceSingleton.getInstance();
        this.carQueryService = CarQueryServiceSingleton.getInstance();
        this.play();
    }

    public void play() {
        boolean running = true;

        this.select1();
    }

    private void select1(){
        this.carQueryService.afisare();
        System.out.println("asfdsa");
    }





}
