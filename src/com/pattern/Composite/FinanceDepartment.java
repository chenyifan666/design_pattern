package com.pattern.Composite;

public class FinanceDepartment extends Company{
    public FinanceDepartment(String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.println("负责财务工作");
    }
}
