package com.company;

public class PercentageDiscountB implements Discount{
    @Override
    public double calculateDiscount(Order order) {
        if (order.getPrice() > 50) {
            return order.getPrice() * 0.90;
        } else {
            return order.getPrice();
        }
    }
}
