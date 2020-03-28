package com.lemon.facade;


/**
 * @author Hello
 * @description
 * @date 2020-03-10 15:53
 */
public class Facade {
    private SubSystemA subSystemA = new SubSystemA();
    private SubSystemB subSystemB = new SubSystemB();
    private SubSystemC subSystemC = new SubSystemC();

    public void operationA() {
        subSystemA.operationA();
    }

    public void operationB() {
        subSystemB.operationB();
    }

    public void operationC() {
        subSystemC.operationC();
    }
}
