package com.shier.media.demo;

/**
 * @author Shier
 * CreateTime 2023/5/22 15:19
 */
public class MediaClient {
    public static void main(String[] args) {
        ConcreteMediator mediator = new ConcreteMediator();

        // 两个具体同事都认识中介者
        ConcreteColleague1 colleague1 = new ConcreteColleague1(mediator);
        ConcreteColleague2 colleague2 = new ConcreteColleague2(mediator);
        // 中介者认识两个同事
        mediator.setColleague1(colleague1);
        mediator.setColleague2(colleague2);

        // 同事之间进行交流
        colleague1.send("你今晚吃饭了吗？");
        colleague2.send("我今晚还没有吃饭呢");
    }
}
