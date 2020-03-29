package com.lemon.flyweight;

import java.util.HashMap;
import java.util.Map;

public class ClothingStore {
    private static Map<String, Clothing> clothingPool = new HashMap<>();

    private ClothingStore() {

    }

    public static Clothing getClothing(String color) {
        if(clothingPool.containsKey(color)) {
            System.out.println(color + "衣服有库存");
            return clothingPool.get(color);
        } else {
            System.out.println(color + "衣服没有库存，进货");
            Overcoat overcoat = new Overcoat(color);
            clothingPool.put(color, overcoat);
            return overcoat;
        }
    }

}
