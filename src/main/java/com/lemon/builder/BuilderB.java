package com.lemon.builder;

/**
 * @author Hello
 * @description 具体建造者B
 * @date 2020-03-08 09:22
 */
public class BuilderB extends AbstractBuilder{
    @Override
    public Object buildA() {
        return "建造者B建造的组件A";
    }

    @Override
    public Object buildB() {
        return "建造者B建造的组件B";
    }

    @Override
    public Object buildC() {
        return "建造者B建造的组件C";
    }
}
