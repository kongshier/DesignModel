package com.shier.media.demo;

/**
 * @author Shier
 * CreateTime 2023/5/22 15:13
 * 抽象中介者类
 */
public abstract class Mediator {
    /**
     * 发送消息的抽象方法，得到同事对象和消息
     * @param message
     * @param colleague
     */
    public abstract void send(String message, Colleague colleague);
}
