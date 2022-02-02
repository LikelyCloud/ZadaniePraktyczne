package com.company;

import java.util.ArrayList;

public class OrderBuilder {
    private ArrayList<Discount> discountList;
    private double price;
    private CalculateStrategy calculateStrategy;

    public OrderBuilder() {
        this.reset();
    }

    public OrderBuilder addDiscount(Discount discount) {
        if (discount != null) {
            this.discountList.add(discount);
        }
        return this;
    }

    public OrderBuilder setPrice(double price) {
        this.price = price;
        return this;
    }

    public OrderBuilder setStrategy(int number) {
        switch (number) {
            case 1:
                this.calculateStrategy = new ClientStrategy();
                break;
            case 2:
                this.calculateStrategy = new StoreStrategy();
                break;
            default:
                this.calculateStrategy = null;
        }
        return this;
    }

    public void reset() {
        this.discountList = new ArrayList<>();
        this.price = 0;
        this.calculateStrategy = null;
    }

    public Order build() {
        return new Order(price, discountList, calculateStrategy);
    }
}
