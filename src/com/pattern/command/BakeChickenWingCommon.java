package com.pattern.command;

public class BakeChickenWingCommon extends Common{
    public BakeChickenWingCommon(Barbecuer barbecuer) {
        super(barbecuer);
    }

    @Override
    public void conmmon() {
        barbecuer.BakeChickenWing();
    }
}
