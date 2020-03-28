package com.lemon.singleton;

/**
 * @author Hello
 * @description 饿汉式单例模式
 * @date 2020-03-08 10:57
 */
public class HungrySingleton {
    private static final HungrySingleton HUNGRY_SINGLETON = new HungrySingleton();

    private HungrySingleton() {}

    public static HungrySingleton getInstance() {
        return HUNGRY_SINGLETON;
    }
}
