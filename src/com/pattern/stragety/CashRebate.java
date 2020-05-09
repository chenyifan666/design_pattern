package com.pattern.stragety;

public class CashRebate extends CashSuper{
    private double discount;

    public CashRebate(double discount){
        super();
        this.discount = discount;
    }

    @Override
    public double getResult(Double money) {
        return money*discount;
    }
}
