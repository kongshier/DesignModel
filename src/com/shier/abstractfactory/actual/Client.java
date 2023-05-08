package com.shier.abstractfactory.actual;

/**
 * @author Shier
 * 客户端
 */
public class Client {
    public static void main(String[] args) {
        // 创建现代风格家具工厂
        FurnitureMaker modernFactory = new ModernFurnitureFactory();
        Chair modernChair = modernFactory.createChair();
        Sofa modernSofa = modernFactory.createSofa();
        // 打印信息
        modernChair.printInfo();
        modernSofa.printInfo();
        // 创建传统风格家具工厂
        FurnitureMaker traditionalFactory = new TraditionalFurnitureFactory();
        Chair traditionalChair = traditionalFactory.createChair();
        Sofa traditionalSofa = traditionalFactory.createSofa();
        // 打印信息
        traditionalChair.printInfo();
        traditionalSofa.printInfo();
    }
}