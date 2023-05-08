package com.shier.builder.test;

import java.awt.*;

/**
 * @author Shier
 * CreateTime 2023/4/25 22:53
 * 瘦小人
 */
public class PersonFatBuilder extends PersonBuilder {
    public PersonFatBuilder(Graphics graphics) {
        super(graphics);
    }

    /**
     * 头
     */
    @Override
    public void buildHead() {
        graphics.drawOval(250, 120, 30, 30);
    }

    /**
     * 身体
     */
    @Override
    public void buildBody() {
        graphics.drawOval(245, 150, 40, 50);
    }

    /**
     * 左手
     */
    @Override
    public void buildArmLeft() {
        graphics.drawLine(250, 150, 230, 200);
    }

    /**
     * 右手
     */
    @Override
    public void buildArmRight() {
        graphics.drawLine(280, 150, 300, 200);
    }

    /**
     * 右腿
     */
    @Override
    public void buildLegRight() {
        graphics.drawLine(270, 200, 285, 250);
    }

    /**
     * 左腿
     */
    @Override
    public void buildLegLeft() {
        graphics.drawLine(260, 200, 245, 250);
    }
}
