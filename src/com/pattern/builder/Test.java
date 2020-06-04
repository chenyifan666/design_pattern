package com.pattern.builder;

public class Test {
    public static void main(String[] args) {
        BuilderA builderA = new BuilderA();
        BuilderB builderB = new BuilderB();
        Director director = new Director();
        director.concrete(builderA);
        builderA.getResult().show();
        director.concrete(builderB);
        builderB.getResult().show();
    }
}
