package com.pattern.proxy;

public class Test {
    public static void main(String[] args) {
        Girl girl = new Girl("纠纠");

        Proxy proxy = new Proxy(girl);

        proxy.giveChocolate();
        proxy.giveDolls();
        proxy.giveFlowers();
    }
}
