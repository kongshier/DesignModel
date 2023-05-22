package com.shier.command.test;

/**
 * @author Shier
 * CreateTime 2023/5/20 15:21
 * 抽象命令类
 */
public abstract class Command {
    public Barbecuer barbecuer;

    public Command(Barbecuer barbecuer) {
        this.barbecuer = barbecuer;
    }
    /**
     *执行命令
     */
    public abstract void excuteCommand();
}
