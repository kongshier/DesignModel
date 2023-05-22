package com.shier.bridge.demo;

/**
 * @author Shier
 * CreateTime 2023/5/17 12:08
 */
public abstract class Abstraction {
    protected Implementor implementor;

    public void setImplementor(Implementor implementor) {
        this.implementor = implementor;
    }

    public abstract void operation();
}
