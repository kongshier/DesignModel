package com.shier.visitor.demo;

/**
 * @author Shier
 * CreateTime 2023/5/24 21:10
 * 抽象访问者类
 */
public abstract class Visitor {
    public abstract void visitConcreteElementA(ConcreteElementA concreteElementA);

    public abstract void visitConcreteElementB(ConcreteElementB concreteElementB);
}
