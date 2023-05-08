package com.shier.oop;

/**
 * @Author Shier
 * CreateTime 2023/4/3 16:47
 */
public class Sheep extends Animal {

    public Sheep() {
        super();
    }

    public Sheep(String name) {
        super(name);
    }

    protected String getShoutSound() {
        return "咩";
    }
}
