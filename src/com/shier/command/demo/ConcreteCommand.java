package com.shier.command.demo;

/**
 * @author Shier
 * CreateTime 2023/5/20 15:01
 * 具体执行命令
 */
public class ConcreteCommand extends Command{

    public ConcreteCommand(Receiver receiver) {
        super(receiver);
    }

    @Override
    public void excuteCommand() {
        receiver.action();
    }
}
