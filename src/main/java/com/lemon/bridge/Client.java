package com.lemon.bridge;

/**
 * @author Hello
 * @description
 * @date 2020-03-09 18:09
 */
public class Client {
    public static void main(String[] args) {
        ButtonBridge button = new CircleButton();
        Appearance implementA = new AppearanceImplA();
        Appearance implementB = new AppearanceImplB();

        button.setAppearance(implementA);

        button.setColor();

        button.setAppearance(implementB);

        button.setColor();
    }
}
