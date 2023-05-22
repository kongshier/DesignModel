package com.shier.combination.test;

/**
 * @author Shier
 * CreateTime 2023/5/10
 * 公司抽象类
 */
public abstract class Company {
    protected String name;

    public Company(String name) {
        this.name = name;
    }

    /**
     * 增加部门
     *
     * @param component
     */
    public abstract void add(Company component);

    /**
     * 移除部门
     *
     * @param component
     */
    public abstract void remove(Company component);

    /**
     * 显示公司结构
     */
    public abstract void display(int depth);

    /**
     * 履行职责-不同的部门有不同的职责
     */
    public abstract void lineOfDuty();
}
