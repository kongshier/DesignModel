package com.shier.builder.pattern;

/**
 * @author Shier
 * CreateTime 2023/4/25 22:33
 * 具体建造者A
 */
public class ConcreteBuilderA extends Builder{

    private Product product  =new Product();

    @Override
    public void buildPartA() {
        System.out.println("部件A");
    }

    @Override
    public void buildPartB() {
        System.out.println("部件B");
    }

    @Override
    public Product getResult() {
        return product;
    }
}
