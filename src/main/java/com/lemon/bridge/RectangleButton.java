package com.lemon.bridge;

/**
 * @author Hello
 * @description 矩形按钮类
 * @date 2020-03-09 18:28
 */
public class RectangleButton extends ButtonBridge {

    @Override
    public void setColor() {
        System.out.println("矩形按钮");
        getAppearance().setColor();
    }
}
