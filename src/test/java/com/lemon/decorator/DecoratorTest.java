package com.lemon.decorator;

import org.junit.Test;

public class DecoratorTest {
    @Test
    public void test() {
        Person person = new NormalPerson();
        Food expensiveFood = new ExpensiveFood(person);
        expensiveFood.eat();

        Food cheapFood = new CheapFood(person);
        cheapFood.eat();
    }
}
