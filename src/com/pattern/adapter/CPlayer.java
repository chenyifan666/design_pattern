package com.pattern.adapter;

public class CPlayer extends Player{
    public CPlayer(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println(name+"中锋进攻");
    }

    @Override
    public void defind() {
        System.out.println(name+"中锋防守");
    }
}
