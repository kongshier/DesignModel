package com.shier.abstractfactory.actual;

/**
 * @author Shier
 * 具体工厂类-现代风格家具
 */
public class ModernFurnitureFactory implements FurnitureMaker {
    public Chair createChair() {
        return new ModernChair();
    }

    public Sofa createSofa() {
        return new ModernSofa();
    }
}