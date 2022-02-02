package com.company;

public class DiscountFactory {
    public Discount getInstance(String str) {
        if (str == "PA") {
            return new PercentageDiscountA();
        } else if (str == "PB") {
            return new PercentageDiscountB();
        } else if (str == "NA") {
            return new NominalDiscountA();
        } else if (str == "NB") {
            return new NominalDiscountB();
        } else {
            return null;
        }
    }
}
