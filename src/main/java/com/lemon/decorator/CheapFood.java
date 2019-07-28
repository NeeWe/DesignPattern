package com.lemon.decorator;

public class CheapFood extends Food {

    public CheapFood(Person person) {
        super(person);
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("喝啤酒");
        System.out.println("撸串");
    }
}
