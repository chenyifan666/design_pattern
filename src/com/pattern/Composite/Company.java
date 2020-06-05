package com.pattern.Composite;

import java.util.ArrayList;
import java.util.List;

public abstract class Company {

    protected String name;

    protected List<Company> companyList = new ArrayList<>();

    public Company(String name){
        this.name = name;
    }

    public void add(Company company){
        companyList.add(company);
    }

    public void remove(Company company){
        companyList.remove(company);
    }

    public void display(int depth){
        for(int i=0;i<depth;i++){
            System.out.print("-");
        }
        System.out.println(name);
        for(Company company:companyList){
            company.display(depth+2);
        }
    }

    public abstract void work();
}
