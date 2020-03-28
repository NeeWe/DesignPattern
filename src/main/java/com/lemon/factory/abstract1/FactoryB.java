package com.lemon.factory.abstract1;

/**
 * @author Hello
 * @description 工厂B
 * @date 2020-03-07 18:53
 */
public class FactoryB extends AbstractFactory {
    @Override
    public AbstractProductA createProductA() {
        return new FactoryBProductA();
    }

    @Override
    public AbstractProductB createProductB() {
        return new FactoryBProductB();
    }
}
