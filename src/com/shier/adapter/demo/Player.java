package com.shier.adapter.demo;

/**
 * @author Shier
 * CreateTime 2023/5/10 16:42
 * 球员
 */
public abstract class Player {
    protected String name;

    public Player(String name) {
        this.name = name;
    }
    // 进攻
    public abstract void attack();
    // 防守
    public abstract void defense();
}
