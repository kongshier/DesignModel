package com.shier.memento.basecode;

/**
 * @author Shier
 * CreateTime 2023/5/10 11:35
 * 管理类
 */
public class Caretaker {
    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
