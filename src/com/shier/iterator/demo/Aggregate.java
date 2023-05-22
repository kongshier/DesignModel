package com.shier.iterator.demo;

/**
 * @author Shier
 * CreateTime 2023/5/13 21:07
 * 聚集抽象类
 */
public abstract class Aggregate {
    /**
     * 创建迭代器
     *
     * @return
     */
    public abstract Iterator createIterator();
}
