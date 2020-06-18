package com.pattern.command;

public class Test {

    public static void main(String[] args){
        Waiter waiter = new Waiter();
        Barbecuer barbecuer = new Barbecuer();

        Common bakeMuttonCommon = new BakeMuttonCommon(barbecuer);
        Common bakeChickenWingCommon = new BakeChickenWingCommon(barbecuer);

        waiter.addCommon(bakeMuttonCommon);
        waiter.addCommon(bakeMuttonCommon);
        waiter.addCommon(bakeChickenWingCommon);
        waiter.addCommon(bakeMuttonCommon);
        waiter.addCommon(bakeChickenWingCommon);
        waiter.addCommon(bakeChickenWingCommon);
        waiter.notice();
    }
}
