package com.company;

//Szymon Zajączkowski
public class Main {
    public static void main(String[] args) {
        OrderBuilder orderBuilder = new OrderBuilder();
        DiscountFactory discountFactory = new DiscountFactory();

        Order order = orderBuilder
                .setPrice(55.54)
                .addDiscount(discountFactory.getInstance("PA"))
                .addDiscount(discountFactory.getInstance("PB"))
                .addDiscount(discountFactory.getInstance("NA"))
                .addDiscount(discountFactory.getInstance("NB"))
                .setStrategy(1)
                //.setStrategy(2)
                .build();

        System.out.println(order.getPrice());
    }
}
