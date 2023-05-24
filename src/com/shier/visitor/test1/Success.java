package com.shier.visitor.test1;

/**
 * @author Shier
 * CreateTime 2023/5/24 21:46
 * 成功类
 */
public class Success extends Action{
    public void getManConclusion(Man concreteElementA){
        System.out.println(concreteElementA.getClass().getSimpleName()
                +" "+this.getClass().getSimpleName()+"时，背后多半有一个伟大的女人。");
    }

    public void getWomanConclusion(Woman concreteElementB){
        System.out.println(concreteElementB.getClass().getSimpleName()
                +" "+this.getClass().getSimpleName()+"时，背后大多有一个不成功的男人。");
    }
}
