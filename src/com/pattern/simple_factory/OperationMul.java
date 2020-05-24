package com.pattern.simple_factory;

public class OperationMul implements Operation{
    @Override
    public double operator(double num1, double num2) {
        return num1*num2;
    }
}
