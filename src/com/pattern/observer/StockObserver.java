package com.pattern.observer;

public class StockObserver extends Observer{

    private String name;

    private Subject subject;

    public StockObserver(String name, Subject subject) {
        this.name = name;
        this.subject = subject;
    }

    @Override
    public void update() {
        System.out.println(subject.getState()+","+name+"开始工作");
    }
}
