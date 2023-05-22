package com.shier.media.demo;

/**
 * @author Shier
 * CreateTime 2023/5/22 15:08
 */
public abstract class Colleague {
    protected Mediator mediator;

    /**
     * 获取中介者对象
     * @param mediator
     */
    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }
}
