package com.shier.adapter.demo;

/**
 * @author Shier
 * CreateTime 2023/5/10 16:43
 * 后卫
 */
public class Guards extends Player {
    public Guards(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println("后卫：" + this.name + "进攻");
    }

    @Override
    public void defense() {
        System.out.println("后卫：" + this.name + "防守");
    }
}
