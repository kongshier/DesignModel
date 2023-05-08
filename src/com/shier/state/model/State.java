package com.shier.state.model;

/**
 * @author Shier
 * CreateTime 2023/5/7 10:39
 * 抽象状态类
 */
public abstract class State {
    public abstract void  handle(Context context);
}
