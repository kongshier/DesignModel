package com.shier.command.demo;

/**
 * @author Shier
 * CreateTime 2023/5/20 15:02
 */
public class Invoker {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }
    public void excuteCommand(){
        command.excuteCommand();
    }
}
