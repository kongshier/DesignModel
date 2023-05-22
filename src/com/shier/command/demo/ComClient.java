package com.shier.command.demo;

/**
 * @author Shier
 * CreateTime 2023/5/20 15:03
 */
public class ComClient {
    public static void main(String[] args) {

        Receiver receiver = new Receiver();
        ConcreteCommand command = new ConcreteCommand(receiver);
        Invoker invoker = new Invoker();

        invoker.setCommand(command);
        invoker.excuteCommand();
    }
}
