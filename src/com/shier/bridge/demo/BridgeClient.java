package com.shier.bridge.demo;

/**
 * @author Shier
 * CreateTime 2023/5/17 12:09
 */
public class BridgeClient {
    public static void main(String[] args) {
        Abstraction abstraction= new RefinedAbstraction();
        // 传入A实现类
        abstraction.setImplementor(new ConcreteImplementorA());
        abstraction.operation();

        // 传入B实现类
        abstraction.setImplementor(new ConcreteImplementorB());
        abstraction.operation();
    }
}
