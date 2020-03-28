package com.lemon.bridge;

/**
 * @author Hello
 * @description 外观实现B 设置为绿色
 * @date 2020-03-09 18:06
 */
public class AppearanceImplB implements Appearance {
    @Override
    public void setColor() {
        System.out.println("绿色");
    }
}
