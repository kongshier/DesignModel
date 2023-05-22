package com.shier.iterator.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Shier
 * CreateTime 2023/5/13 21:09
 * 具体聚集类
 */
public class ConcreteAggregate extends Aggregate {
    /**
     * 存储聚合对象
     */
    private List<Object> list = new ArrayList<>();


    @Override
    public Iterator createIterator() {
        return new ConcreteIterator(this);
    }

    /**
     * 返回聚合总个数
     *
     * @return
     */
    public int getCount() {
        return list.size();
    }

    /**
     * 增加新对象
     *
     * @param obj
     */
    public void add(Object obj) {
        list.add(obj);
    }

    /**
     * 得到指定的对象
     */
    public Object getCurrentItem(int index) {
        return list.get(index);
    }
}
