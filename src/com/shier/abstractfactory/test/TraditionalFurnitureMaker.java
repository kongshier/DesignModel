package com.shier.abstractfactory.test;

/**
 * @author Shier
 * 传统风格家具制造商
 */
public class TraditionalFurnitureMaker {
    public Furniture createChair() {
        return new Furniture("椅子", "传统风格", 100.0);
    }

    public Furniture createSofa() {
        return new Furniture("沙发", "传统风格", 600.0);
    }
}