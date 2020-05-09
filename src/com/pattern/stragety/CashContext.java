package com.pattern.stragety;

public class CashContext {
    private CashSuper cashSuper = null;

    public CashContext(String type){
        switch (type){
            case "无优惠":
                cashSuper = new CashNormal();
                break;
            case "打八折":
                cashSuper = new CashRebate(0.8);
                break;
            case "满300返30":
                cashSuper = new CashReturn(300,30);
                break;
            default:
                break;
        }
    }

    public double getResult(Double money){
        return cashSuper.getResult(money);
    }
}
