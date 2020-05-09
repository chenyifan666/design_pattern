package com.pattern.stragety;

public class Test {
    public static void main(String[] args){
        String type = "满300返30";
        CashContext context = new CashContext(type);
        System.out.println(context.getResult(300.0));
    }
}
