package com.pattern.interpreter;

public class Test {
    public static void main(String[] args) {
        String text = "O 2 E 0.5 C 0.5 A 3";
        while (text.length()>0){
            String str = text.substring(0,1);
            Expression expression = null;
            switch (str){
                case "O":
                    expression = new Scale();
                    break;
                default:
                    expression = new Note();
                    break;
            }
            expression.interprete(text);
            text = text.substring(text.indexOf(" ",2)+1);
        }
    }
}
