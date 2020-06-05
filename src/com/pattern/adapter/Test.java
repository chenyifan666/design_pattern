package com.pattern.adapter;

public class Test {
    public static void main(String[] args) {
        Player pgPlayer = new PgPlayer("张三");
        pgPlayer.attack();

        Player cPlayer = new CPlayer("李四");
        cPlayer.defind();

        Player adapter = new Adapter("王五");
        adapter.attack();
    }
}
