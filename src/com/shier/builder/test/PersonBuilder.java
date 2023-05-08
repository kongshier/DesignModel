package com.shier.builder.test;

import java.awt.*;

/**
 * @author Shier
 * CreateTime 2023/4/25 23:01
 * 建造小人抽象类
 */
public abstract class PersonBuilder {
    protected Graphics graphics;

    public PersonBuilder(Graphics graphics) {
        this.graphics = graphics;
    }
    // 头
    public abstract  void buildHead();
    // 身体
    public abstract  void buildBody();
    // 左手
    public abstract  void buildArmLeft();
    // 右手
    public abstract  void buildArmRight();
    // 右腿
    public abstract  void buildLegRight();
    // 左腿
    public abstract  void buildLegLeft();
}
