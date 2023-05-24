package com.shier.visitor.test1;

/**
 * @author Shier
 * CreateTime 2023/5/24 21:45
 * 男人类
 */
public class Man extends Person{
    public void accept(Action visitor) {
        visitor.getManConclusion(this);
    }
}
