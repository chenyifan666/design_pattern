package com.pattern.simple_factory;

public class OperationDev implements Operation{
    @Override
    public double operator(double num1, double num2) {
        if(num2==0){
            throw new ArithmeticException("被除数不能为零");
        }
        return num1/num2;
    }
}
