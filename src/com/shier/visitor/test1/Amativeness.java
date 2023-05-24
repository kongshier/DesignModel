package com.shier.visitor.test1;

import sun.security.x509.AVA;

/**
 * @author Shier
 * CreateTime 2023/5/24 21:46
 * 恋爱类
 */
public class Amativeness extends Action {
    public void getManConclusion(Man concreteElementA){
        System.out.println(concreteElementA.getClass().getSimpleName()
                +" "+this.getClass().getSimpleName()+"时，凡事不懂也要装懂。");
    }

    public void getWomanConclusion(Woman concreteElementB){
        System.out.println(concreteElementB.getClass().getSimpleName()
                +" "+this.getClass().getSimpleName()+"时，遇事懂也装作不懂。");
    }
}
