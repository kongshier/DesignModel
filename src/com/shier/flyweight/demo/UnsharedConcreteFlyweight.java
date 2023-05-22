package com.shier.flyweight.demo;

/**
 * @author Shier
 * CreateTime 2023/5/22 16:09
 * 需要共享的具体Flyweight子类
 */
public class UnsharedConcreteFlyweight extends Flyweight {
    @Override
    public void operation(int extrinsicState) {
        System.out.println("不需要共享的具体Flyweight子类：" + extrinsicState);
    }
}
