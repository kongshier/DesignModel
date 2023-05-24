package com.shier.visitor.demo;

/**
 * @author Shier
 * CreateTime 2023/5/24 21:17
 * 具体B元素操作
 */
public class ConcreteElementB extends Element{
    @Override
    public void accept(Visitor visitor) {
        visitor.visitConcreteElementB(this);
    }

    /**
     * 其他操作
     */
    public void operateB(){}
}
