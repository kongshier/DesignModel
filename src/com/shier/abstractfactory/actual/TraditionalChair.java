package com.shier.abstractfactory.actual;


/**
 * @author Shier
 * 具体产品类-传统椅子
 */
public class TraditionalChair implements Chair {
    public void printInfo() {
        System.out.println("类型: 椅子, 风格: 传统, 价格: 100.0");

    }
}