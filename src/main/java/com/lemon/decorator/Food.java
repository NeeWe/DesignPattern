package com.lemon.decorator;

public abstract class Food implements Person{

    private Person person;

    Food(Person person) {
        this.person = person;
    }

    @Override
    public void eat() {
        person.eat();
    }
}
