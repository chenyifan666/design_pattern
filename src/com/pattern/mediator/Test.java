package com.pattern.mediator;

public class Test {
    public static void main(String[] args) {
        Mediator mediator = new Mediator();

        Person personA = new PersonA(mediator);
        Person personB = new PersonB(mediator);

        mediator.setPerson1(personA);
        mediator.setPerson2(personB);

        personA.send("二号同志，你好");
        personB.send("一号同志，你也好");
    }
}
