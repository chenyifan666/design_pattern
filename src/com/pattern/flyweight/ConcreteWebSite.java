package com.pattern.flyweight;

public class ConcreteWebSite extends WebSite{

    private String name;

    public ConcreteWebSite(String name){
        this.name = name;
    }

    @Override
    public void execute() {
        System.out.println(name+"---"+user.getName());
    }
}
