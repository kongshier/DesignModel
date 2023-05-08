package com.shier.builder.computer;

/**
 * @author Shier
 * CreateTime 2023/4/26 22:13
 * main方法中使用Director构建具体的电脑对象
 */
public class ComputerTest {
    public static void main(String[] args) {
        // 创建Director类
        Director director = new Director();

        // 具体建造者A
        ComputerBuilderA builderA = new ComputerBuilderA();
        director.setComputerBuilder(builderA);
        director.buildComputer();
        Computer computerA = director.getComputer();
        System.out.println("电脑A的配置：");
        System.out.println(computerA.toString());

        // 创建电脑建造者B
        ComputerBuilder builderB = new ComputerBuilderB();
        director.setComputerBuilder(builderB);
        director.buildComputer();
        Computer computerB = director.getComputer();
        System.out.println("电脑B的配置：");
        System.out.println(computerB.toString());

        // 创建电脑建造者C
        ComputerBuilder builderC = new ComputerBuilderC();
        director.setComputerBuilder(builderC);
        director.buildComputer();
        Computer computerC = director.getComputer();
        System.out.println("电脑C的配置：");
        System.out.println(computerC.toString());
    }
}
