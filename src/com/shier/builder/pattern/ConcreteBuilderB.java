package com.shier.builder.pattern;

/**
 * @author Shier
 * CreateTime 2023/4/25 22:33
 * 具体建造者B
 */
public class ConcreteBuilderB extends Builder{

    private Product product  =new Product();

    @Override
    public void buildPartA() {
        System.out.println("部件C");
    }

    @Override
    public void buildPartB() {
        System.out.println("部件D");
    }

    @Override
    public Product getResult() {
        return product;
    }
}
