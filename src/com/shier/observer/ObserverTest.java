package com.shier.observer;

/**
 * @author Shier
 * CreateTime 2023/4/26 22:57
 */
public class ObserverTest {
    public static void main(String[] args) {
        Subject subject = new ConcreteSubject();
        subject.attach(new ConcreteObserver("shier1", subject));
        subject.attach(new ConcreteObserver("shier2", subject));
        subject.attach(new ConcreteObserver("shier3", subject));
        subject.attach(new ConcreteObserver("shier4", subject));
        subject.setSubjectState("睡觉了");
        // 通知其他观察者
        subject.notifyObserver();
    }
}
