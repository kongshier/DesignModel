package com.shier.oop;

/**
 * @Author Shier
 * CreateTime 2023/4/3 16:47
 */
public class Cat extends Animal {

    public Cat() {
        super();
    }

    public Cat(String name) {
        super(name);
    }

    protected String getShoutSound() {
        return "喵";
    }
}
