package com.pattern.chainofrepositorily;

public class Test {
    public static void main(String[] args){
        int leavel = 10;
        Manager common = new CommonManager();
        Manager major = new MajorManager();
        GeneralManager generalManager = new GeneralManager();

        common.setSuperior(major);
        major.setSuperior(generalManager);

        common.manage(leavel);
    }
}
