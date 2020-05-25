package com.pattern.prototype;

public class Work implements Cloneable{
    private String name;

    private String describe;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public Work clone() {
        Work work = null;
        try {
            work = (Work)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return work;
    }
}
