package com.shier.combination.demo;

/**
 * @author Shier
 * CreateTime 2023/5/10 17:16
 */
public abstract class Component {
    protected String name;

    public Component(String name) {
        this.name = name;
    }

    /**
     * 增加节点
     *
     * @param component
     */
    public abstract void add(Component component);

    /**
     * 移除
     *
     * @param component
     */
    public abstract void remove(Component component);

    /**
     * 树结构
     */
    public abstract void display(int depth);
}
