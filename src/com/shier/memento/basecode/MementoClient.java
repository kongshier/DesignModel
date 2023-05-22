package com.shier.memento.basecode;

/**
 * @author Shier
 * CreateTime 2023/5/10 11:36
 */
public class MementoClient {
    public static void main(String[] args) {
        // 原始类初始化
        Originator originator = new Originator();
        originator.setState("ON");
        originator.show();

        // 保存当前状态
        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(originator.createMemento());

        // 状态进行改变
        originator.setState("OFF");
        originator.show();

        // 恢复初始的状态
        originator.recoveryMemento(caretaker.getMemento());
        originator.show();
    }
}
