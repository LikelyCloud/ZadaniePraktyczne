package com.company;

import java.util.ArrayList;

public class Order {
    private double price;
    private ArrayList<Discount> discountList;
    private CalculateStrategy calculateStrategy;


    public Order(double price, ArrayList<Discount> discountList, CalculateStrategy calculateStrategy) {
        this.price = price;
        this.discountList = discountList;
        this.calculateStrategy = calculateStrategy;

        calculateFinalPrice();
    }

    public double getPrice() {
        return price;
    }

    private void calculateFinalPrice() {
        if (calculateStrategy != null) {
            calculateStrategy.executeStrategy(this);
        }
        for (Discount discount : discountList) {
            this.price = discount.calculateDiscount(this);
        }
    }

    public ArrayList<Discount> getDiscountList() {
        return discountList;
    }
}
