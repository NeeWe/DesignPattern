package com.lemon.adapter;

/**
 * @author Hello
 * @description 客户端调用
 * @date 2020-03-08 11:58
 */
public class Client {
    public void callRequest() {
        Target target = new Adapter();
        target.adapt();
    }
}
