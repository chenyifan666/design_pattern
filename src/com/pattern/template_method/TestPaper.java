package com.pattern.template_method;

public abstract class TestPaper {
    public void question1(){
        System.out.println("问题一");
        answer1();
    }

    public abstract void answer1();

    public void question2(){
        System.out.println("问题二");
        answer1();
    }

    public abstract void answer2();

    public void question3(){
        System.out.println("问题三");
        answer3();
    }

    public abstract void answer3();


}
