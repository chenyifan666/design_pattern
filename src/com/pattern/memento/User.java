package com.pattern.memento;

public class User {
    private int state;
    private String name;

    public User(int state,String name){
        this.state = state;
        this.name = name;
    }

    public Memento save(){
        return new Memento(state,name);
    }

    public void read(Memento memento){
        this.state = memento.getState();
        this.name = memento.getName();
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
