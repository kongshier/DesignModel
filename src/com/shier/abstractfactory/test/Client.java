package com.shier.abstractfactory.test;

/**
 * @author Shier
 * 客户端类
 */
public class Client {
    public static void main(String[] args) {
        // 创建现代风格家具
        ModernFurnitureMaker modernMaker = new ModernFurnitureMaker();
        Furniture modernChair = modernMaker.createChair();
        Furniture modernSofa = modernMaker.createSofa();

        // 打印信息
        modernChair.printInfo();
        modernSofa.printInfo();

        // 创建传统风格家具
        TraditionalFurnitureMaker traditionalMaker = new TraditionalFurnitureMaker();
        Furniture traditionalChair = traditionalMaker.createChair();
        Furniture traditionalSofa = traditionalMaker.createSofa();

        // 打印信息
        traditionalChair.printInfo();
        traditionalSofa.printInfo();
    }
}