package com.shier.adapter.demo;

/**
 * @author Shier
 * CreateTime 2023/5/10 16:43
 * 前锋
 */
public class Forwards extends Player {
    public Forwards(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println("前锋：" + this.name + "进攻");
    }

    @Override
    public void defense() {
        System.out.println("前锋：" + this.name + "防守");
    }
}
