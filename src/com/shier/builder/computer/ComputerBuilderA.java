package com.shier.builder.computer;

/**
 * @author Shier
 * CreateTime 2023/4/26 22:05
 * ComputerBuilderA 具体建造者
 */
public class ComputerBuilderA extends ComputerBuilder{
    @Override
    public void buildCpu() {
        computer.setCpu("Intel i7-12500H");
    }

    @Override
    public void buildGpu() {
        computer.setGpu("NVIDIA GeForce RTX 1650");
    }

    @Override
    public void buildMemory() {
        computer.setMemory("16G");
    }
}
