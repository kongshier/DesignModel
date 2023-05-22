package com.shier.media.demo;

/**
 * @author Shier
 * CreateTime 2023/5/22 15:09
 */
public class ConcreteColleague2 extends Colleague{
    /**
     * 获取中介者对象
     *
     * @param mediator
     */
    public ConcreteColleague2(Mediator mediator) {
        super(mediator);
    }

    /**
     * 发送消息
     * @param message
     */
    public void send(String message) {
        this.mediator.send(message,this);
    }

    /**
     * 接受消息
     * @param message
     */
    public void notify(String message) {
        System.out.println("同事2收到消息 " + message);
    }
}
