package com.lemon.builder;

import lombok.Data;

/**
 * @author Hello
 * @description 复杂产品，由组件ABC构成
 * @date 2020-03-08 09:23
 */
@Data
public class Product {
    private Object componentA;
    private Object componentB;
    private Object componentC;
}
