package app.singletonpattern.cars.model;

public class Car {
    private String model;
    private String color;
    private int price;

    //Constructor
    public Car(String model, String color, int price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }

    public Car(String text){
        String[] split = text.split(",");
        this.model = split[0];
        this.color = split[1];
        this.price = Integer.parseInt(split[2]);
    }

    //Setters
    public void setModel(String model) {
        this.model = model;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    //Getters
    public String getModel() {
        return model;
    }
    public String getColor() {
        return color;
    }
    public int getPrice() {
        return price;
    }


    public String descriere(){

        String text = "";
        text += "Model: " + this.model + "\n";
        text += "Color: " + this.color + "\n";
        text += "Price: " + this.price + "\n";
        return text;
    }

    @Override
    public String toString() {

        return model + " " + color + " " + price;
    }


}
