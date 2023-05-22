package com.shier.iterator.demo;

/**
 * @author Shier
 * CreateTime 2023/5/13 21:15
 */
public class ConcreteIterator extends Iterator {
    private ConcreteAggregate aggregate;

    public ConcreteIterator(ConcreteAggregate aggregate) {
        this.aggregate = aggregate;
    }

    private int current = 0;

    /**
     * 得到第一个对象
     *
     * @return
     */
    @Override
    public Object first() {
        return aggregate.getCurrentItem(0);
    }

    /**
     * 得到下一个对象
     *
     * @return
     */
    @Override
    public Object netx() {
        Object ret = null;
        current++;
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
