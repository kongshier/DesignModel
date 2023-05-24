package com.shier.visitor.demo;

/**
 * @author Shier
 * CreateTime 2023/5/24 21:08
 *
 */
public abstract class Element {
    public abstract void accept(Visitor visitor);
}
