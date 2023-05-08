package com.shier.builder.computer;

/**
 * @author Shier
 * CreateTime 2023/4/26 22:05
 * ComputerBuilderB 具体建造者
 */
public class ComputerBuilderB extends ComputerBuilder{
    @Override
    public void buildCpu() {
        computer.setCpu("Intel i9 4090X");
    }

    @Override
    public void buildGpu() {
        computer.setGpu("NVIDIA GeForce RTX 4090");
    }

    @Override
    public void buildMemory() {
        computer.setMemory("64G");
    }
}
