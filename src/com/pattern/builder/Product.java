package com.pattern.builder;

import java.util.ArrayList;
import java.util.List;

public class Product {
    List<String> list = new ArrayList<>();

    public void add(String part){
        list.add(part);
    }

    public void show(){
        for(String str:list){
            System.out.print(str+" ");
        }
    }
}
