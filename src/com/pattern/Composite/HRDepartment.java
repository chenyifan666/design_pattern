package com.pattern.Composite;

public class HRDepartment extends Company{
    public HRDepartment(String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.println("负责人事工作");
    }
}
