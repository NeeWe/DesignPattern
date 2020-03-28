package com.lemon.factory.simple;

/**
 * @author Hello
 * @description 产品工厂，负责根据参数创建具体产品
 * @date 2020-03-07 14:13
 */
public class ProductFactory {
    public static AbstractProduct createProduct(String name) {
        switch (name) {
            case "A":
                return new ProductA();
            case "B":
                return new ProductB();
            default:
                throw new IllegalArgumentException("该产品不存在");
        }
    }
}
