package com.shier.builder.pattern;

/**
 * @author Shier
 * CreateTime 2023/4/25 22:30
 * 抽象建造者类
 */
public abstract class Builder {
    /**
     * 建造部件A
     */
    public abstract void buildPartA();

    /**
     * 建造部件B
     */
    public abstract void buildPartB();

    /**
     * 获得产品建造后返回结果
     * @return
     */
    public abstract Product getResult();
}
