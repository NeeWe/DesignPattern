package com.lemon.decorator;

/**
 * @author Hello
 * @description
 * @date 2020-03-10 14:59
 */
public class Client {

    public static void main(String[] args) {
        AddMeterial addMeterial = new BubbleMilkTea();
        MilkTeaDecorator milkTeaDecorator = new SugarDecorator(addMeterial);
        milkTeaDecorator.make();
    }
}
