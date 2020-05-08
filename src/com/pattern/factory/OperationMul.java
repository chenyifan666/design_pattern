package com.pattern.factory;

public class OperationMul implements Operation{
    @Override
    public double operator(double num1, double num2) {
        return num1*num2;
    }
}
