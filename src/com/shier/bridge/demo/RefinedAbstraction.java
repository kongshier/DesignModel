package com.shier.bridge.demo;

/**
 * @author Shier
 * CreateTime 2023/5/17 12:09
 */
public class RefinedAbstraction extends Abstraction {
    @Override
    public void operation() {
        System.out.println("具体的Abstraction执行了");
        implementor.operation();
    }
}
