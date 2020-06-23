package com.pattern.flyweight;

public abstract class WebSite {
    protected User user;

    public void use(User user){
        this.user = user;
    }

    public abstract void execute();
}
