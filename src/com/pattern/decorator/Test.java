package com.pattern.decorator;

public class Test {

    public static void main(String[] args){
        Person person = new Person("张三");

        Suit suit = new Suit();
        Tshirt tshirt = new Tshirt();
        BigTrouse bigTrouse = new BigTrouse();

        tshirt.decorate(person);
        bigTrouse.decorate(tshirt);
        suit.decorate(bigTrouse);

        suit.show();
    }
}
