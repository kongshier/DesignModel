package com.shier.abstractfactory.actual;

/**
 * @author Shier
 * 具体产品类-现代椅子
 */
public class ModernChair implements Chair {
    public void printInfo() {
        System.out.println("类型: 椅子, 风格: 现代, 价格: 150.0");
    }
}