package com.shier.builder.computer;

/**
 * @author Shier
 * CreateTime 2023/4/26 22:02
 * ComputerBuilder抽象类
 */
public abstract class ComputerBuilder {
    protected Computer computer;

    public Computer getComputer() {
        return computer;
    }

    /**
     * 构建Computer类
     */
    public void createNewComputer(){
        computer = new Computer();
    }
    public abstract void buildCpu();

    public abstract void buildGpu();

    public abstract void buildMemory();
}
