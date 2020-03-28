package com.lemon.builder;

/**
 * @author Hello
 * @description 指挥者，负责直接与客户端交互，建造产品
 * @date 2020-03-08 09:23
 */
public class Director {
    private AbstractBuilder builder;

    public Director(AbstractBuilder builder) {
        this.builder = builder;
    }

    public Product build() {
        Product product = new Product();
        product.setComponentA(builder.buildA());
        product.setComponentB(builder.buildB());
        product.setComponentC(builder.buildC());
        return product;
    }
}
