package com.shier.media.demo;

/**
 * @author Shier
 * CreateTime 2023/5/22 15:15
 */
public class ConcreteMediator extends Mediator {

    /**
     * 认识其他两个同事
     */
    private ConcreteColleague1 colleague1;
    private ConcreteColleague2 colleague2;

    /**
     * 知道具体同事的对象
     *
     * @param colleague1
     */
    public void setColleague1(ConcreteColleague1 colleague1) {
        this.colleague1 = colleague1;
    }

    public void setColleague2(ConcreteColleague2 colleague2) {
        this.colleague2 = colleague2;
    }

    /**
     * 重写发送消息方法，根据不同具体同事对象做出判断通知其他同事
     * @param message
     * @param colleague
     */
    @Override
    public void send(String message, Colleague colleague) {
        if (colleague == colleague1) {
            colleague2.notify(message);
        } else {
            colleague1.notify(message);
        }
    }
}
