package com.pattern.factory;

public class OperationFactory {

    public static Operation createOperation(String sign){
        Operation operation = null;
        switch (sign){
            case "+":
                operation = new OperationAdd();
                break;
            case "-":
                operation = new OperationSub();
                break;
            case "*":
                operation = new OperationMul();
                break;
            case "/":
                operation = new OperationDev();
                break;
        }

        return operation;
    }
}
