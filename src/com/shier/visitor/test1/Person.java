package com.shier.visitor.test1;

/**
 * @author Shier
 * CreateTime 2023/5/24 21:45
 * 人类抽象类
 */
public abstract class Person {
    //接受
    public abstract void accept(Action visitor);
}
