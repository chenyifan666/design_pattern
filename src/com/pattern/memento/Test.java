package com.pattern.memento;

public class Test {
    public static void main(String[] args) {
        User user = new User(1,"张三");
        MementoManager mementoManager = new MementoManager();
        mementoManager.setMemento(user.save());
        user.setState(100);
        System.out.println(user.getState());
        user.read(mementoManager.getMemento());
        System.out.println(user.getState());
    }
}
