package com.shier.flyweight.demo;

import java.util.Hashtable;

/**
 * @author Shier
 * CreateTime 2023/5/22 16:12
 * 享元工厂
 */
public class FlyweightFactory {
    private Hashtable<String, Flyweight> flyweights = new Hashtable<String, Flyweight>();

    /**
     * 初始化工厂三个实例
     */
    public FlyweightFactory() {
        flyweights.put("A", new ConcreteFlyweight());
        flyweights.put("B", new ConcreteFlyweight());
        flyweights.put("C", new ConcreteFlyweight());
    }

    /**
     * 根据客户端请求，获得已生成的实例
     *
     * @param key
     * @return
     */
    public Flyweight getFlyweight(String key) {
        return flyweights.get(key);
    }
}
