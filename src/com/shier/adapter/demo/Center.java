package com.shier.adapter.demo;

/**
 * @author Shier
 * CreateTime 2023/5/10 16:43
 * 中锋
 */
public class Center extends Player {
    public Center(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println("中锋：" + this.name + "进攻");
    }

    @Override
    public void defense() {
        System.out.println("中锋：" + this.name + "防守");
    }
}
