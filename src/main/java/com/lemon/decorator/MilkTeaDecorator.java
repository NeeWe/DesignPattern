package com.lemon.decorator;

/**
 * @author Hello
 * @description
 * @date 2020-03-10 14:48
 */
public abstract class MilkTeaDecorator implements AddMeterial {
    private AddMeterial addMeterial;

    public MilkTeaDecorator(AddMeterial addMeterial) {
        this.addMeterial = addMeterial;
    }

    @Override
    public void make() {
        addMeterial.make();
    }

    protected abstract void addSomething();
}
