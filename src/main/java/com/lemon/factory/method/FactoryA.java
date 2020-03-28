package com.lemon.factory.method;

/**
 * @author Hello
 * @description 具体工厂A
 * @date 2020-03-07 15:30
 */
public class FactoryA extends AbstractFactory{
    @Override
    public AbstractProduct createProduct() {
        return new ProductA();
    }
}
