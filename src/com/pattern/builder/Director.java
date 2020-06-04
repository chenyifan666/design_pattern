package com.pattern.builder;

public class Director{
    public void concrete(Builder builder){
        builder.builderPartA();
        builder.builderPartB();
    }
}
