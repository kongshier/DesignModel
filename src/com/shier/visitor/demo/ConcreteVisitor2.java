package com.shier.visitor.demo;

/**
 * @author Shier
 * CreateTime 2023/5/24 21:10
 * 具体访问者B
 */
public class ConcreteVisitor2 extends Visitor {

    @Override
    public void visitConcreteElementA(ConcreteElementA concreteElementA) {
        System.out.println(concreteElementA.getClass().getSimpleName() + "被：" + this.getClass().getSimpleName() + "访问了");
    }

    @Override
    public void visitConcreteElementB(ConcreteElementB concreteElementB) {
        System.out.println(concreteElementB.getClass().getSimpleName() + "被：" + this.getClass().getSimpleName() + "访问了");
    }
}
