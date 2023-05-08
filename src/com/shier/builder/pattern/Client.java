package com.shier.builder.pattern;

/**
 * @author Shier
 * CreateTime 2023/4/25 22:37
 * 客户端代码
 */
public class Client {
    public static void main(String[] args) {
        Director director = new Director();
        ConcreteBuilderA builderA = new ConcreteBuilderA();
        ConcreteBuilderB builderB = new ConcreteBuilderB();
        // 指导者用ConcreteBuilderA创建方法来建造产品
        director.construct(builderA); // A建造者创建的产品是A和B
        Product resultA = builderA.getResult();
        resultA.show();

        // 指导者用ConcreteBuilderB创建方法来建造产品
        director.construct(builderB);// B建造者创建的产品是C和D
        Product resultB = builderB.getResult();
        resultB.show();
    }
}
