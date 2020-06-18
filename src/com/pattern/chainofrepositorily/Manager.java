package com.pattern.chainofrepositorily;

public abstract class Manager {
    protected Manager superior;

    public void setSuperior(Manager superior){
        this.superior = superior;
    }

    public abstract void manage(int leavel);
}
