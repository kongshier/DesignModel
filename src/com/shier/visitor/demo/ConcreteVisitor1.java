package com.shier.visitor.demo;

/**
 * @author Shier
 * CreateTime 2023/5/24 21:17
 */
public class ConcreteVisitor1 extends Visitor {
    @Override
    public void visitConcreteElementA(ConcreteElementA concreteElementA) {
        System.out.println(concreteElementA.getClass().getSimpleName() + "被：" + this.getClass().getSimpleName() + "访问了");
    }

    @Override
    public void visitConcreteElementB(ConcreteElementB concreteElementB) {
        System.out.println(concreteElementB.getClass().getSimpleName() + "被：" + this.getClass().getSimpleName() + "访问了");
    }
}
