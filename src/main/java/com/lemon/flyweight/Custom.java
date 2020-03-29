package com.lemon.flyweight;

public class Custom {
    public static void main(String[] args) {
        Clothing redColor = ClothingStore.getClothing("红色");
        Clothing redColor2 = ClothingStore.getClothing("红色");
    }
}
