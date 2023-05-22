package com.shier.command.demo;

/**
 * @author Shier
 * CreateTime 2023/5/20 14:58
 * 抽象命令类
 */
public  abstract class Command {
    protected Receiver receiver;

    public Command(Receiver receiver) {
        this.receiver = receiver;
    }

    /**
     * 执行命令
     */
    public abstract void excuteCommand();
}
