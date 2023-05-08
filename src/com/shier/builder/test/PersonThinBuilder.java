package com.shier.builder.test;

import java.awt.*;

/**
 * @author Shier
 * CreateTime 2023/4/25 22:53
 * 瘦小人
 */
public class PersonThinBuilder extends PersonBuilder {
    public PersonThinBuilder(Graphics graphics) {
        super(graphics);
    }

    /**
     * 头
     */
    @Override
    public void buildHead() {
        graphics.drawOval(150, 120, 30, 30);
    }

    /**
     * 身体
     */
    @Override
    public void buildBody() {
        graphics.drawRect(160, 150, 10, 50);
    }

    /**
     * 左手
     */
    @Override
    public void buildArmLeft() {
        graphics.drawLine(160, 150, 140, 200);
    }

    /**
     * 右手
     */
    @Override
    public void buildArmRight() {
        graphics.drawLine(170, 150, 190, 200);
    }

    /**
     * 右腿
     */
    @Override
    public void buildLegRight() {
        graphics.drawLine(170, 200, 185, 250);
    }

    /**
     * 左腿
     */
    @Override
    public void buildLegLeft() {
        graphics.drawLine(160, 200, 145, 250);
    }
}
