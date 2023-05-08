package com.shier.builder.computer;

/**
 * @author Shier
 * CreateTime 2023/4/26 22:05
 * ComputerBuilderC 具体建造者
 */
public class ComputerBuilderC extends ComputerBuilder{
    @Override
    public void buildCpu() {
        computer.setCpu("AMD Ryzen 9 5900X");
    }

    @Override
    public void buildGpu() {
        computer.setGpu("NVIDIA GeForce RTX 3080");
    }

    @Override
    public void buildMemory() {
        computer.setMemory("24G");
    }
}
