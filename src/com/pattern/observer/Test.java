package com.pattern.observer;

public class Test {
    public static void main(String[] args) {
        Subject boss = new Boss();
        boss.setState("老板来了");
        Observer stockObserverA = new StockObserver("张三",boss);
        Observer stockObserverB = new StockObserver("李四",boss);
        boss.attach(stockObserverA);
        boss.attach(stockObserverB);
        boss.notice();
        boss.setState("老板走了");
        boss.detach(stockObserverA);
        boss.notice();
    }
}
