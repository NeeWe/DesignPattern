package com.lemon.bridge;

/**
 * @author Hello
 * @description 外观实现A 设置为红色
 * @date 2020-03-09 18:05
 */
public class AppearanceImplA implements Appearance {
    @Override
    public void setColor() {
        System.out.println("红色");
    }
}
