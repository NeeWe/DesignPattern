package com.lemon.factory.simple;

/**
 * @author Hello
 * @description 具体产品A
 * @date 2020-03-07 14:10
 */
public class ProductA extends AbstractProduct {
    @Override
    void selfIntroduce() {
        System.out.println("I'am ProductA");
    }
}
