package com.pattern.visiter;

public class Test {
    public static void main(String[] args) {
        ObjectSturcture objectSturcture = new ObjectSturcture();
        Man man = new Man();
        Woman woman = new Woman();

        objectSturcture.add(man);
        objectSturcture.add(woman);

        Action action1 = new Success();
        objectSturcture.display(action1);

        Action action2 = new Failed();
        objectSturcture.display(action2);
    }
}
