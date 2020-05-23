package com.pattern.decorator;

public class Finery extends Person{

    private Person finery;

    public void decorate(Person person){
        finery = person;
    }

    public void show(){
        if(finery!=null){
            finery.show();
        }
    }
}
