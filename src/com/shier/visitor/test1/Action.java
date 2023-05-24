package com.shier.visitor.test1;

/**
 * @author Shier
 * CreateTime 2023/5/24 21:45
 * 状态抽象类
 */
public abstract class Action {
    /**
     * 得到男人结论或反应
     *
     * @param concreteElementA
     */
    public abstract void getManConclusion(Man concreteElementA);

    /**
     * 得到女人结论或反应
     *
     * @param concreteElementB
     */
    public abstract void getWomanConclusion(Woman concreteElementB);
}
