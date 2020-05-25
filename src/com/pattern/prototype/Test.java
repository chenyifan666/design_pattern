package com.pattern.prototype;

public class Test {
    public static void main(String[] args){
        Resume resume = new Resume();
        resume.setName("张三");
        resume.setAge("123");
        Work work = new Work();
        work.setName("aaa");
        work.setDescribe("aaaa");
        resume.setWork(work);
        Resume resume1 = resume.clone();
        resume1.getWork().setName("bbb");
        System.out.println(resume.getWork().getName());
        System.out.println(resume1.getWork().getName());
    }
}
