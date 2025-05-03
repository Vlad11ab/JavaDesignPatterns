package app.singleton.cars.service;

public class CarQueryServiceSingleton {

    private static class LazyHolder{

        private static final CarQueryService INSTANCE = new CarQueryServiceImpl();
    }


    private CarQueryServiceSingleton(){

    }


    public static CarQueryService getInstance(){
        return LazyHolder.INSTANCE;
    }





}
