package com.lemon.singleton;

/**
 * @author Hello
 * @description 懒汉式单例模式
 * @date 2020-03-08 11:01
 */
public class LazySingleton {
    private static LazySingleton lazySingleton;

    private LazySingleton() {}

    public static LazySingleton getInstance() {
        if(lazySingleton == null) {
            lazySingleton = new LazySingleton();
        }

        return lazySingleton;
    }
}
