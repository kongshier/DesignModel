package com.shier.observer;

import java.util.ArrayList;

/**
 * @author Shier
 * CreateTime 2023/4/26 22:48
 * 抽象通知者类
 */
public abstract class Subject {
    protected String subjectState;

    public String getSubjectState() {
        return subjectState;
    }

    public void setSubjectState(String subjectState) {
        this.subjectState = subjectState;
    }

    private ArrayList<Observer> list = new ArrayList<Observer>();

    /**
     * 增加观察者
     *
     * @param observer
     */
    public void attach(Observer observer) {
        list.add(observer);
    }

    /**
     * 减少观察者
     *
     * @param observer
     */
    public void detach(Observer observer) {
        list.remove(observer);
    }

    /**
     * 通知观察者
     */
    public void notifyObserver() {
        for (Observer observer : list) {
            observer.update();
        }
    }
}
