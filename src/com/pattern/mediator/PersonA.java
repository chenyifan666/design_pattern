package com.pattern.mediator;

public class PersonA extends Person{
    public PersonA(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void send(String message) {
        mediator.send(message,this);
    }

    @Override
    public void receive(String message) {
        System.out.println("用户A接受消息:"+message);
    }
}
