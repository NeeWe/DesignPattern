package com.lemon.decorator;

public class NormalPerson implements Person {

    @Override
    public void eat() {
        System.out.println("吃饭");
    }
}
