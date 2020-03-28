package com.lemon.bridge;

/**
 * @author Hello
 * @description 圆形按钮类
 * @date 2020-03-09 18:07
 */
public class CircleButton extends ButtonBridge {

    @Override
    public void setColor() {
        System.out.println("圆形按钮");
        getAppearance().setColor();
    }
}
