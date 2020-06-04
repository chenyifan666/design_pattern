package com.pattern.abstract_factory;

public class Test {
    public static void main(String[] args) {
        IUser user = DatabaseUtil.createUser();
        user.insert();
        user.update();
    }
}
