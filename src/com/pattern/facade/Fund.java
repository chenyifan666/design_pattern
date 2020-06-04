package com.pattern.facade;

public class Fund {
    private Stock1 stock1 = new Stock1();
    private Stock2 stock2 = new Stock2();
    private Stock3 stock3 = new Stock3();

    public void buy(){
        stock1.buy();
        stock2.buy();
        stock3.buy();
    }

    public void sell(){
        stock1.sell();
        stock2.sell();
        stock3.sell();
    }
}
