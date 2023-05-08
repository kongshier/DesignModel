package com.shier.abstractfactory.test;

/**
 * @author Shier
 * 现代风格家具制造商
 */
public class ModernFurnitureMaker {
    public Furniture createChair() {
        return new Furniture("椅子", "现代风格", 150.0);
    }

    public Furniture createSofa() {
        return new Furniture("沙发", "现代风格", 500.0);
    }
}