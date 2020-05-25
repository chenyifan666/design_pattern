package com.pattern.template_method;

public class TestPaperA extends TestPaper{
    @Override
    public void answer1() {
        System.out.println("A");
    }

    @Override
    public void answer2() {
        System.out.println("B");
    }

    @Override
    public void answer3() {
        System.out.println("C");
    }
}
