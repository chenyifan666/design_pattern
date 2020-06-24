package com.pattern.visiter;

public class Success extends Action{
    @Override
    public void getManConclusion(Man man) {
        System.out.println("男人成功的表现"+man.getClass().getName());
    }

    @Override
    public void getWomanConclusion(Woman woman) {
        System.out.println("女人成功的表现"+woman.getClass().getName());
    }
}
