package com.lemon.factory.abstract1;

/**
 * @author Hello
 * @description 抽象工厂，具有创建产品A和产品B的抽象方法
 * @date 2020-03-07 18:52
 */
public abstract class AbstractFactory {
    public abstract AbstractProductA createProductA();
    public abstract AbstractProductB createProductB();
}
