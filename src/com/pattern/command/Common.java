package com.pattern.command;

public abstract class Common {
    protected Barbecuer barbecuer;

    public Common(Barbecuer barbecuer){
        this.barbecuer = barbecuer;
    }

    public abstract void conmmon();
}
