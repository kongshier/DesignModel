package com.shier.oop;

/**
 * @Author Shier
 * CreateTime 2023/4/3 16:47
 */
public class Cattle extends Animal {

    public Cattle() {
        super();
    }

    public Cattle(String name) {
        super(name);
    }

    protected String getShoutSound() {
        return "眸";
    }
}
