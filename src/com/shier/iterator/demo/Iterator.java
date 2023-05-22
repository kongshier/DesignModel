package com.shier.iterator.demo;

/**
 * @author Shier
 * CreateTime 2023/5/13 21:16
 * Iterator 迭代器对象类
 */
public abstract class Iterator {
    // 第一个
    public abstract Object first();

    // 下一个
    public abstract Object netx();

    // 是否到最后
    public abstract boolean isDone();

    // 当前对象
    public abstract Object currentItems();
}
