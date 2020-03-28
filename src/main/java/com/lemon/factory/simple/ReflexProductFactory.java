package com.lemon.factory.simple;

import java.util.Objects;

/**
 * @author Hello
 * @description 利用反射的工厂方法
 * @date 2020-03-07 14:28
 */
public class ReflexProductFactory {
    public static AbstractProduct createProduct(String classFullPath) {
        try {
            Class<?> clazz = Class.forName(classFullPath);
            return (AbstractProduct) clazz.newInstance();
        } catch (ClassNotFoundException | IllegalAccessException |
                InstantiationException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {
        AbstractProduct product = ReflexProductFactory.createProduct(
                "com.lemon.factory.simple.ProductA");
        Objects.requireNonNull(product).selfIntroduce();
    }
}
