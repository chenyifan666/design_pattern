package com.pattern.visiter;

public class Man extends Person{
    @Override
    public void accept(Action action) {
        action.getManConclusion(this);
    }
}
