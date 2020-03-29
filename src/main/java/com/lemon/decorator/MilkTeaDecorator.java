package com.lemon.decorator;

/**
 * @author Hello
 * @description
 * @date 2020-03-10 14:48
 */
public abstract class MilkTeaDecorator implements MilkTea {
    private MilkTea milkTea;

    public MilkTeaDecorator(MilkTea milkTea) {
        this.milkTea = milkTea;
    }

    @Override
    public void make() {
        milkTea.make();
    }

    protected abstract void addSomething();
}
