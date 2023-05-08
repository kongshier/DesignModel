package com.shier.state.model;

/**
 * @author Shier
 * CreateTime 2023/5/7 10:41
 */
public class Context {
    private State state;

    /**
     * 初始化当前状态
     *
     * @param state
     */
    public Context(State state) {
        this.state = state;
    }

    /**
     * 可读写的状态，用户读取当前状态和设置新的状态
     * @return
     */
    public State getState() {
        return state;
    }

    public void setState(State state) {
        System.out.println("当前状态：" + this.state.getClass().getName());
        this.state = state;
    }

    /**
     * 对请求做处理，并设置下一个状态
     */
    public void request() {
        this.state.handle(this);
    }
}
