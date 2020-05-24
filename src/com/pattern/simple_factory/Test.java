package com.pattern.simple_factory;

public class Test {
    public static void main(String[] args){
        String sign = "*";
        int num1 = 20;
        int num2 = 16;
        Operation operation = OperationFactory.createOperation(sign);
        System.out.println(operation.operator(num1,num2));
    }
}
