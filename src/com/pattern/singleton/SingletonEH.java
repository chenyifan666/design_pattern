package com.pattern.singleton;

public class SingletonEH {
    private SingletonEH(){}

    private static SingletonEH singletonEH = new SingletonEH();

    public static SingletonEH getInstance(){
        return singletonEH;
    }

    public void get(){
        System.out.println("饿汉式单例模式");
    }
}
