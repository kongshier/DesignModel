package com.shier.builder.computer;

/**
 * @author Shier
 * CreateTime 2023/4/26 22:01
 */
public class Computer {
    private String cpu;
    private String gpu;
    private String  memory;

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    public void setMemory(String  memory) {
        this.memory = memory;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    @Override
    public String toString() {
        return "Computer:{" +
                "cpu='" + cpu + '\'' +
                ", gpu='" + gpu + '\'' +
                ", memory=" + memory +
                '}';
    }
}
