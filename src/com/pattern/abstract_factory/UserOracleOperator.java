package com.pattern.abstract_factory;

public class UserOracleOperator extends IUser{
    @Override
    public void insert() {
        System.out.println("向oracle数据库中插入user数据");
    }

    @Override
    public void update() {
        System.out.println("向oracel数据库中更新user数据");
    }
}
