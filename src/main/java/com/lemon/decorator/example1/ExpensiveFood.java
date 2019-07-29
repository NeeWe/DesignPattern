package com.lemon.decorator.example1;

public class ExpensiveFood extends Food {
    public ExpensiveFood(Person person) {
        super(person);
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("喝咖啡");
        System.out.println("吃蛋糕");
    }
}
