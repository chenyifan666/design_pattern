package com.pattern.state;

public class MorningState implements State{
    @Override
    public void writeProgram(Work work) {
        if(work.getHour()<12){
            System.out.println("现在是上午");
        }else{
            work.setState(new NoonState());
            work.writeProgram();
        }
    }
}
