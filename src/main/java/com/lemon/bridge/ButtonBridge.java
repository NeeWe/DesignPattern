package com.lemon.bridge;

/**
 * @author Hello
 * @description 抽象按钮类，充当桥梁
 * @date 2020-03-09 18:00
 */
public abstract class ButtonBridge {
    private Appearance appearance;

    public abstract void setColor();

    public void setAppearance(Appearance appearance) {
        this.appearance = appearance;
    }

    public Appearance getAppearance() {
        return appearance;
    }
}
