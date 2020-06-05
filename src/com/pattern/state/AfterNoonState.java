package com.pattern.state;

public class AfterNoonState implements State{
    @Override
    public void writeProgram(Work work) {
        System.out.println("现在是下午");
    }
}
