package com.pattern.observer;

public abstract class Subject {
    private String state;

    public abstract void attach(Observer observer);

    public abstract void detach(Observer observer);

    public abstract void notice();

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
