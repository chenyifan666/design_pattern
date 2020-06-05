package com.pattern.adapter;

public class PgPlayer extends Player{
    public PgPlayer(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println(name+"后卫进攻");
    }

    @Override
    public void defind() {
        System.out.println(name+"后卫防守");
    }
}
