package com.shier.visitor.test;

/**
 * @author Shier
 * CreateTime 2023/5/24 21:36
 * 人抽象类
 */
public abstract class Person {
    protected String action;

    public String getAction() {
        return this.action;
    }

    public void setAction(String value) {
        this.action = value;
    }

    /**
     * 得到结论或反应
     */
    public abstract void getConclusion();
}
