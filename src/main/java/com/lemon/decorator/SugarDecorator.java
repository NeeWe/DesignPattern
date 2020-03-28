package com.lemon.decorator;

/**
 * @author Hello
 * @description
 * @date 2020-03-10 14:54
 */
public class SugarDecorator extends MilkTeaDecorator {

    public SugarDecorator(AddMateriel addMateriel) {
        super(addMateriel);
    }

    @Override
    public void make() {
        super.make();
        addSomething();
    }

    @Override
    protected void addSomething() {
        System.out.println("加点糖");
    }

}
