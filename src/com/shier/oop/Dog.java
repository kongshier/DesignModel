package com.shier.oop;

/**
 * @Author Shier
 * CreateTime 2023/4/3 16:47
 */
public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    public Dog() {
        super();
    }

    protected String getShoutSound() {
        return "汪";
    }
}
