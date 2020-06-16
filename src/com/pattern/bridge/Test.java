package com.pattern.bridge;

public class Test {

    public static void main(String[] args){
        HandsetBrand handsetBrand = new HandsetBrandA();
        HandsetSoftware handsetSoftware = new Game();
        handsetBrand.setHandsetSoftware(handsetSoftware);
        handsetBrand.run();
    }
}
