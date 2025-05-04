package app;


import app.builder.builders.Builder;
import app.builder2.User;
import app.builder3.Order;
import app.singleton.view.View;
import app.singleton.view.View2;

public class Main {
    public static void main(String[] args) {


       Order order = Order.builder().customerId(10)
               .amount(10)
               .id(10)
               .shippingAddress("sasd")
               .build();
    }
}