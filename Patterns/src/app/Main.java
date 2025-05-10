package app;


import app.builderpattern.builder3.Order;

public class Main {
    public static void main(String[] args) {


       Order order = Order.builder().customerId(10)
               .amount(10)
               .id(10)
               .shippingAddress("sasd")
               .build();
    }
}