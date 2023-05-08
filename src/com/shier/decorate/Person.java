package com.shier.decorate;

/**
 * @author Shier
 * CreateTime 2023/4/16 22:30
 */
public class Person implements ICharacter{
    private String name;

    public Person(String name) {
        this.name = name;
    }
    public void show() {
        System.out.println(name + "的装扮");
    }
}
