package com.pattern.visiter;

public class Failed extends Action{
    @Override
    public void getManConclusion(Man man) {
        System.out.println("男人失败的表现"+man.getClass().getName());
    }

    @Override
    public void getWomanConclusion(Woman woman) {
        System.out.println("女人失败的表现"+woman.getClass().getName());
    }
}
