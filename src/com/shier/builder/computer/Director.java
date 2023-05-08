package com.shier.builder.computer;

/**
 * @author Shier
 * CreateTime 2023/4/26 22:10
 * 创建Director类，用于指挥具体建造者类构建出特定的对象电脑对象：
 */
public class Director {

    private ComputerBuilder computerBuilder;

    public void setComputerBuilder(ComputerBuilder computerBuilder){
        this.computerBuilder = computerBuilder;
    }
    public Computer getComputer(){
        return computerBuilder.getComputer();
    }

    /**
     * 调用ComputerBuilder中抽象方法
     */
    public void buildComputer(){
        computerBuilder.createNewComputer();
        computerBuilder.buildCpu();
        computerBuilder.buildGpu();
        computerBuilder.buildMemory();
    }
}
