package com.pattern.state;

public class NoonState implements State{
    @Override
    public void writeProgram(Work work) {
        if(work.getHour()<14){
            System.out.println("现在是中午");
        }else{
            work.setState(new AfterNoonState());
            work.writeProgram();
        }
    }
}
