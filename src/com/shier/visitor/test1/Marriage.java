package com.shier.visitor.test1;

/**
 * @author Shier
 * CreateTime 2023/5/24 21:50
 * 结婚
 */
public class Marriage extends Action {
    public void getManConclusion(Man concreteElementA) {
        System.out.println(concreteElementA.getClass().getSimpleName()
                + " " + this.getClass().getSimpleName() + "时，感慨道：恋爱游戏终结时，‘有妻徒刑’遥无期。");
    }

    public void getWomanConclusion(Woman concreteElementB) {
        System.out.println(concreteElementB.getClass().getSimpleName()
                + " " + this.getClass().getSimpleName() + "时，欣慰曰：爱情长跑路漫漫，婚姻保险保平安。");
    }
}
