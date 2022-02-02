package com.company;

public class StoreStrategy implements CalculateStrategy{
    @Override
    public void executeStrategy(Order order) {
        order.getDiscountList().sort(((o1, o2) -> {
            if (o1 instanceof PercentageDiscountB)
                return 1;
            else if (o2 instanceof PercentageDiscountB)
                return -1;
            else if (o1 instanceof PercentageDiscountA)
                return 1;
            else if (o2 instanceof PercentageDiscountA)
                return -1;
            else if (o1 instanceof NominalDiscountB)
                return 1;
            else if (o2 instanceof NominalDiscountB)
                return -1;
            else if (o1 instanceof NominalDiscountA)
                return 1;
            else if (o2 instanceof NominalDiscountA)
                return -1;
            return 0;
        }));
    }
}
