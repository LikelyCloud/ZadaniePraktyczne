package com.company;

public class NominalDiscountA implements Discount{
    @Override
    public double calculateDiscount(Order order) {
        return Math.max(order.getPrice() - 20, 0);
    }
}
