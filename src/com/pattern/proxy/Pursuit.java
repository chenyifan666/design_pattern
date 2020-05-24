package com.pattern.proxy;

public class Pursuit implements GiveGift{
    private Girl girl;

    public Pursuit(Girl girl){
        this.girl = girl;
    }

    @Override
    public void giveDolls() {
        System.out.println("送"+girl.getName()+"洋娃娃");
    }

    @Override
    public void giveFlowers() {
        System.out.println("送"+girl.getName()+"鲜花");
    }

    @Override
    public void giveChocolate() {
        System.out.println("送"+girl.getName()+"巧克力");
    }
}
