package com.shier.command.test;

/**
 * @author Shier
 * CreateTime 2023/5/20 15:24
 */
public class Waiter1 {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    /**
     * 通知后厨进行烧烤
     */
    public void notifyCommand(){
        command.excuteCommand();
    }
}
