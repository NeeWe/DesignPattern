package com.lemon.adapter;

/**
 * @author Hello
 * @description 适配器对象
 * @date 2020-03-08 11:56
 */
public class Adapter extends Adaptee implements Target{
    @Override
    public void adapt() {
        super.request();
    }
}
