package com.pattern.interpreter;

public class Note extends Expression{
    @Override
    public void execute(String key, double value) {
        switch (key){
            case "C":
                System.out.print("1 ");
                break;
            case "D":
                System.out.print("2 ");
                break;
            case "E":
                System.out.print("3 ");
                break;
            case "F":
                System.out.print("4 ");
                break;
            case "A":
                System.out.print("5 ");
                break;
            case "B":
                System.out.print("6 ");
                break;
        }
    }
}
