package com.pattern.bridge;

public class Game implements HandsetSoftware{
    @Override
    public void run() {
        System.out.println("运行游戏软件");
    }
}
