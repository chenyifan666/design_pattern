package com.pattern.factory;

public class UndergraduateFactory implements Factory{
    @Override
    public LeiFeng createInOperation() {
        return new Undergraduate();
    }
}
