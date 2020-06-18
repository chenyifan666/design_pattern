package com.pattern.chainofrepositorily;

public class CommonManager extends Manager{
    @Override
    public void manage(int leavel) {
        if(leavel<3){
            System.out.println("经理评审");
        }else {
            superior.manage(leavel);
        }
    }
}
