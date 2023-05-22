package com.shier.iterator.demo;

/**
 * @author Shier
 * CreateTime 2023/5/13 21:15
 * 具体迭代器类 - 倒序
 */
public class ConcreteIteratorDesc extends Iterator {
    private ConcreteAggregate aggregate;

    private int current = 0;

    public ConcreteIteratorDesc(ConcreteAggregate aggregate) {
        this.aggregate = aggregate;
        // 从最后一个开始
        current = aggregate.getCount() - 1;
    }

    /**
     * 得到倒数第一个对象
     *
     * @return
     */
    @Override
    public Object first() {
        return aggregate.getCurrentItem(aggregate.getCount() - 1);
    }

    /**
     * 得到下一个对象
     *
     * @return
     */
    @Override
    public Object netx() {
        Object ret = null;
        // 递减
        current--;
        if (current < aggregate.getCount()) {
            ret = aggregate.getCurrentItem(current);
        }
        return ret;
    }

    /**
     * 判断是否到结尾
     *
     * @return
     */
    @Override
    public boolean isDone() {
        return current >= aggregate.getCount() ? true : false;
    }

    /**
     * 返回当前对象
     *
     * @return
     */
    @Override
    public Object currentItems() {
        return aggregate.getCurrentItem(current);
    }
}
