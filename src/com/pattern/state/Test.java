package com.pattern.state;

public class Test {
    public static void main(String[] args){
        Work work = new Work();
        work.setHour(2);
        work.writeProgram();
        work.setHour(13);
        work.writeProgram();
        work.setHour(16);
        work.writeProgram();
    }
}
