package com.pattern.interpreter;

public abstract class Expression {
    public void interprete(String text){
        if(text.length()==0){
            return;
        }else {
            String key = text.substring(0,1);
            text = text.substring(2);
            Double value =Double.valueOf(text.substring(0,text.indexOf(" ")));
            text = text.substring(text.indexOf(" ")+1);
            execute(key,value);
        }
    }

    public abstract void execute(String key,double value);
}
