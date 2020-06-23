package com.pattern.interpreter;

public class Scale extends Expression{
    @Override
    public void execute(String key, double value) {
        switch (String.valueOf(value)){
            case "1.0":
                System.out.print("低音 ");
                break;
            case "2.0":
                System.out.print("中音 ");
                break;
            case "3.0":
                System.out.print("高音 ");
                break;
        }
    }
}
