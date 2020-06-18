package com.pattern.mediator;

public abstract class Person {
    protected Mediator mediator;

    public Person(Mediator mediator){
        this.mediator = mediator;
    }

    public abstract void send(String message);

    public abstract void receive(String message);
}
