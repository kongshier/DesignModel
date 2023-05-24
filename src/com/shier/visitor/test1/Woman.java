package com.shier.visitor.test1;

/**
 * @author Shier
 * CreateTime 2023/5/24 21:46
 * 女人类
 */
public class Woman extends Person{
    public void accept(Action visitor) {
        visitor.getWomanConclusion(this);
    }
}
