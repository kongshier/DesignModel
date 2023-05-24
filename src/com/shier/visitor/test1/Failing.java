package com.shier.visitor.test1;

import sun.security.x509.AVA;

/**
 * @author Shier
 * CreateTime 2023/5/24 21:46
 * 失败类
 */
public class Failing extends Action {
    public void getManConclusion(Man concreteElementA){
        System.out.println(concreteElementA.getClass().getSimpleName()
                +" "+this.getClass().getSimpleName()+"时，闷头喝酒，谁也不用劝。");
    }

    public void getWomanConclusion(Woman concreteElementB){
        System.out.println(concreteElementB.getClass().getSimpleName()
                +" "+this.getClass().getSimpleName()+"时，眼泪汪汪，谁也劝不了。");
    }
}
