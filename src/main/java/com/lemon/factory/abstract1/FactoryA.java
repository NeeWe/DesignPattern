package com.lemon.factory.abstract1;

/**
 * @author Hello
 * @description 工厂A
 * @date 2020-03-07 18:53
 */
public class FactoryA extends AbstractFactory{
    @Override
    public AbstractProductA createProductA() {
        return new FactoryAProductA();
    }

    @Override
    public AbstractProductB createProductB() {
        return new FactoryAProductB();
    }
}
