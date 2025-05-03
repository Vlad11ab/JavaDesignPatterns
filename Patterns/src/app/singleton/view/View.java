package app.singleton.view;

import app.singleton.cars.service.*;

public class View {
    private CarCommandService carCommandService;
    private CarQueryService carQueryService;


    public View() {
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
