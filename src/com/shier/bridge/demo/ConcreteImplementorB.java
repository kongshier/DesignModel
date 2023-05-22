package com.shier.bridge.demo;

/**
 * @author Shier
 * CreateTime 2023/5/17 12:06
 * 具体实现A
 */
public class ConcreteImplementorB extends Implementor {
    @Override
    public void operation() {
        System.out.println("具体实现 B 的方法执行了！");
    }
}
