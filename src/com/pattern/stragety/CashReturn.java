package com.pattern.stragety;

public class CashReturn extends CashSuper {
    private double base;
    private double res;

    public CashReturn(double base,double res){
        this.base = base;
        this.res = res;
    }

    @Override
    public double getResult(Double money) {
        int count =(int)(money/base);
        return money - count*res;
    }
}
