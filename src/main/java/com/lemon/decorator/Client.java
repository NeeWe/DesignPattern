package com.lemon.decorator;

/**
 * @author Hello
 * @description
 * @date 2020-03-10 14:59
 */
public class Client {

    public static void main(String[] args) {
        MilkTea milkTea = new BubbleMilkTea();
        MilkTeaDecorator milkTeaDecorator = new SugarDecorator(milkTea);
        milkTeaDecorator.make();
    }
}
