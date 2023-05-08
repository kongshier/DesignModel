package com.shier.oop;

/**
 * @Author Shier
 * CreateTime 2023/4/3 16:47
 */
public class MachineDog extends Cat implements ChangeThings {

    public MachineDog() {
        super();
    }

    public MachineDog(String name) {
        super(name);
    }

    @Override
    public String changThings(String thing) {
        return super.shout() + "我是一机械狗，我会很多事情,我比普通的狗更加智能" + thing;
    }
}
