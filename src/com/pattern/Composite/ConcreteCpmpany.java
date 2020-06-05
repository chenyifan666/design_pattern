package com.pattern.Composite;

public class ConcreteCpmpany extends Company{
    public ConcreteCpmpany(String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.println("负责总体管理");
    }
}
