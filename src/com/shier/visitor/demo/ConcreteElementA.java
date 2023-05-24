package com.shier.visitor.demo;

/**
 * @author Shier
 * CreateTime 2023/5/24 21:17
 * 具体A元素操作
 */
public class ConcreteElementA extends Element{
    @Override
    public void accept(Visitor visitor) {
        // 使用双分派技术，实现处理与数据结构的分离
        visitor.visitConcreteElementA(this);
    }

    /**
     * 其他操作
     */
    public void operateA(){}
}
