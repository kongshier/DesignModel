package com.shier.observer;

/**
 * @author Shier
 * CreateTime 2023/4/26 22:55
 */
public class ConcreteObserver extends Observer{
    private String name;
    private Subject subject;

    public ConcreteObserver(String name, Subject subject) {
        this.name = name;
        this.subject = subject;
    }

    @Override
    public void update() {
        System.out.println("观察者"+this.name+"的最新状态是"+this.subject.subjectState);
    }
}
