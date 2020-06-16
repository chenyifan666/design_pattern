package com.pattern.bridge;

public class HandsetBrandA extends HandsetBrand{
    @Override
    public void run() {
        handsetSoftware.run();
    }
}
