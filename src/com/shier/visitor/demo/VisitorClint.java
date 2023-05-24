package com.shier.visitor.demo;

/**
 * @author Shier
 * CreateTime 2023/5/24 21:23
 */
public class VisitorClint {
    public static void main(String[] args) {
        ObjectStructure structure = new ObjectStructure();
        structure.attach(new ConcreteElementA());
        structure.attach(new ConcreteElementB());

        ConcreteVisitor1 visitor1 = new ConcreteVisitor1();
        ConcreteVisitor2 visitor2 = new ConcreteVisitor2();

        structure.accept(visitor1);
        structure.accept(visitor2);
    }
}
