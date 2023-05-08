package com.shier.oop;

/**
 * @Author Shier
 * CreateTime 2023/4/3 16:47
 */
public class MachineCat extends Cat implements ChangeThings {

    public MachineCat() {
        super();
    }

    public MachineCat(String name) {
        super(name);
    }

    @Override
    public String changThings(String thing) {
        return super.shout() + "我是一机械猫，我会很多事情,如变出" + thing;
    }
}
