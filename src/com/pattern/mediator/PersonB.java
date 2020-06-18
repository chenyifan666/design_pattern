package com.pattern.mediator;

public class PersonB extends Person{
    public PersonB(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void send(String message) {
        mediator.send(message,this);
    }

    @Override
    public void receive(String message) {
        System.out.println("用户B收到消息:"+message);
    }
}
