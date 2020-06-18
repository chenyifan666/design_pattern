package com.pattern.command;

import java.util.ArrayList;
import java.util.List;

public class Waiter {
    private List<Common> commonList = new ArrayList<>();

    public void addCommon(Common common){
        commonList.add(common);
    }

    public void notice(){
        for(Common common:commonList){
            common.conmmon();
        }
    }
}
