package com.shier.builder.pattern;

/**
 * @author Shier
 * CreateTime 2023/4/25 22:36
 * 指导者类
 */
public class Director {
    public void construct(Builder builder){
        builder.buildPartA();
        builder.buildPartB();
    }
}
