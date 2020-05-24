package com.pattern.factory;

public class Test {
    public static void main(String[] args) {
        Factory factory = new VolunteerFactory();

        LeiFeng leiFeng1 = factory.createInOperation();
        leiFeng1.buy();
    }
}
