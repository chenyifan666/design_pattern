package com.pattern.observer;

import java.util.ArrayList;
import java.util.List;

public class Boss extends Subject{
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notice() {
        for(Observer observer:observers){
            observer.update();
        }
    }
}
