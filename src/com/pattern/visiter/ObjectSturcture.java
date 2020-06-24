package com.pattern.visiter;

import java.util.ArrayList;
import java.util.List;

public class ObjectSturcture {
    private List<Person> personList = new ArrayList<>();

    public void add(Person person){
        personList.add(person);
    }

    public void remove(Person person){
        personList.remove(person);
    }

    public void display(Action action){
        for(Person person:personList){
            person.accept(action);
        }
    }
}
