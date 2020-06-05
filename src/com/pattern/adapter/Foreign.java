package com.pattern.adapter;

public class Foreign {
    private String name;

    public Foreign(String name){
        this.name = name;
    }

    public void aaa(){
        System.out.println(name+"外籍球员进攻");
    }

    public void bbb(){
        System.out.println(name+"外籍球员防守");
    }
}
