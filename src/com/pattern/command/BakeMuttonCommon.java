package com.pattern.command;

public class BakeMuttonCommon extends Common{
    public BakeMuttonCommon(Barbecuer barbecuer) {
        super(barbecuer);
    }

    @Override
    public void conmmon() {
        barbecuer.BakeMutton();
    }
}
