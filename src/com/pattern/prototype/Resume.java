package com.pattern.prototype;

public class Resume implements Cloneable{
    private String name;

    private String age;

    private Work work;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Work getWork() {
        return work;
    }

    public void setWork(Work work) {
        this.work = work;
    }

    public Resume clone(){
        Resume resume = new Resume();
        resume.age = this.age;
        resume.name = this.name;
        resume.work = this.work.clone();
        return resume;
    }
}
