package com.lemon.facade;

/**
 * @author Hello
 * @description
 * @date 2020-03-10 15:54
 */
public class Client {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.operationA();
        facade.operationB();
        facade.operationC();
    }
}
