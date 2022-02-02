package com.company;

public class NominalDiscountB implements Discount{
    @Override
    public double calculateDiscount(Order order) {
        if (order.getPrice() > 100) {
            return Math.max(order.getPrice() - 30, 0);
        } else {
            return order.getPrice();
        }
    }
}
