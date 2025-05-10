package app.singletonpattern.cars.service;

public class CarCommandServiceSingleton {

    public static class LazzyHolder{

        private static final CarCommandService INSTANCE = new CarCommandServicice2();
    }

    private CarCommandServiceSingleton() {

    }

    public static CarCommandService getInstance() {
        return CarCommandServiceSingleton.LazzyHolder.INSTANCE;
    }




}
