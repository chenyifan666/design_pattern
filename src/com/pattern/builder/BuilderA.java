package com.pattern.builder;

public class BuilderA extends Builder{
    private Product product = new Product();
    @Override
    public void builderPartA() {
        product.add("部件一");
    }

    @Override
    public void builderPartB() {
        product.add("部件二");
    }

    @Override
    public Product getResult() {
        return product;
    }
}
