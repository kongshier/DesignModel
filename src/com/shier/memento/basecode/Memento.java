package com.shier.memento.basecode;

/**
 * @author Shier
 * CreateTime 2023/5/10 11:31
 * 备忘录类
 */
public class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
