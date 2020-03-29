package com.lemon.flyweight;

public class Overcoat extends Clothing  {

    private String color;

    public Overcoat(String color) {
        this.color = color;
    }

    @Override
    void describe() {
        System.out.println(color + "外套");
    }
}
