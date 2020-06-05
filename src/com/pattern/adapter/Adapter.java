package com.pattern.adapter;

public class Adapter extends Player{

    private Foreign foreign;
    public Adapter(String name) {
        super(name);
        foreign = new Foreign(name);
    }

    @Override
    public void attack() {
        foreign.aaa();
    }

    @Override
    public void defind() {
        foreign.bbb();
    }
}
