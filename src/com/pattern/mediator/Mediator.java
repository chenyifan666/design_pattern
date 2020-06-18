package com.pattern.mediator;

public class Mediator {

    private Person person1;

    private Person person2;

    public void setPerson1(Person person1){
        this.person1 = person1;
    }

    public void setPerson2(Person person2){
        this.person2 = person2;
    }

    public void send(String message,Person person){
        if(person==person1){
            person2.receive(message);
        }else if(person==person2){
            person1.receive(message);
        }
    }
}
