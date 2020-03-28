package com.lemon.factory.method;

/**
 * @author Hello
 * @description
 * @date 2020-03-07 15:35
 */
public class Demo {
    public static void main(String[] args) {
        AbstractFactory factoryA = new FactoryA();
        AbstractFactory factoryB = new FactoryB();
        factoryA.createProduct().selfIntroduce();
        factoryB.createProduct().selfIntroduce();
    }
}
