package com.shier.flyweight.demo;

/**
 * @author Shier
 * CreateTime 2023/5/22 16:16
 */
public class FlyweightClient {
    public static void main(String[] args) {
        int extrinsicState = 22;
        FlyweightFactory factory = new FlyweightFactory();

        Flyweight flyweightA = factory.getFlyweight("A");
        flyweightA.operation(--extrinsicState);
        Flyweight flyweightB = factory.getFlyweight("B");
        flyweightB.operation(--extrinsicState);
        Flyweight flyweightC = factory.getFlyweight("C");
        flyweightC.operation(--extrinsicState);
        // 不要共享的
        UnsharedConcreteFlyweight unsharedFly = new UnsharedConcreteFlyweight();
        unsharedFly.operation(--extrinsicState);
    }
}
