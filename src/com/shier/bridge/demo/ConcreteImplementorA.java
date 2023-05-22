package com.shier.bridge.demo;

/**
 * @author Shier
 * CreateTime 2023/5/17 12:06
 * 具体实现A
 */
public class ConcreteImplementorA extends Implementor {
    @Override
    public void operation() {
        System.out.println("具体实现 A 的方法执行了！");
    }
}
