package com.pattern.chainofrepositorily;

public class MajorManager extends Manager{
    @Override
    public void manage(int leavel) {
        if(leavel<6){
            System.out.println("总监评审");
        }else {
            superior.manage(leavel);
        }
    }
}
