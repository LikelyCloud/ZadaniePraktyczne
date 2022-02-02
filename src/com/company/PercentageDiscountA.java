package com.company;

public class PercentageDiscountA implements Discount {
    @Override
    public double calculateDiscount(Order order) {
        return order.getPrice() * 0.75;
    }
}
