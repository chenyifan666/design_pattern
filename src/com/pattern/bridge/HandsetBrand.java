package com.pattern.bridge;

public abstract class HandsetBrand {
    protected HandsetSoftware handsetSoftware;

    public void setHandsetSoftware(HandsetSoftware handsetSoftware){
        this.handsetSoftware = handsetSoftware;
    }

    public abstract void run();
}
