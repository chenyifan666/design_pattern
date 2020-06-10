package com.pattern.singleton;

public class Test {
    public static void main(String[] args) {
        SingletonEH singletonEH = SingletonEH.getInstance();
        SingletonLH singletonLH = SingletonLH.getInstance();
        singletonEH.get();
        singletonLH.get();
    }
}
