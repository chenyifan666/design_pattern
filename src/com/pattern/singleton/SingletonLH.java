package com.pattern.singleton;

public class SingletonLH {
    private SingletonLH(){}

    private static SingletonLH singletonLH = null;

    public static SingletonLH getInstance(){
        if(singletonLH==null){
            synchronized (SingletonLH.class){
                if(singletonLH==null) {
                    singletonLH = new SingletonLH();
                }
            }
        }
        return singletonLH;
    }

    public void get(){
        System.out.println("懒汉式单例模式");
    }
}
