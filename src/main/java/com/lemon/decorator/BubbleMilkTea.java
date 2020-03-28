package com.lemon.decorator;

/**
 * @author Hello
 * @description
 * @date 2020-03-10 14:47
 */
public class BubbleMilkTea implements AddMeterial {

    @Override
    public void make() {
        System.out.println("加奶、茶、珍珠");
    }
}
