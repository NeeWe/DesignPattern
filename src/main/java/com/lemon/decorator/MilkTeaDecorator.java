package com.lemon.decorator;

/**
 * @author Hello
 * @description
 * @date 2020-03-10 14:48
 */
public abstract class MilkTeaDecorator implements AddMateriel {
    private AddMateriel addMateriel;

    public MilkTeaDecorator(AddMateriel addMateriel) {
        this.addMateriel = addMateriel;
    }

    @Override
    public void make() {
        addMateriel.make();
    }

    protected abstract void addSomething();
}
