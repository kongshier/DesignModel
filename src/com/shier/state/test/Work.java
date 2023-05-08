package com.shier.state.test;

/**
 * @author Shier
 * CreateTime 2023/5/7 11:01
 * 工作类
 */
public class Work {
    /**
     * 时间点
     */
    private int hour;

    /**
     * 是否完成工作任务-是否到达下班条件
     */
    private boolean workFinished = false;

    /**
     * 当前状态-设置下一个状态
     */
    private State currentState;

    /**
     * 初始化状态-上午
     */
    public Work() {
        currentState = new ForenoonState();
    }

    /**
     * 工作时间段-显示当前状态，并切换到下一个状态
     */
    public void workTime() {
        this.currentState.workTime(this);
    }

    public State getCurrentState() {
        return currentState;
    }
    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public boolean getWorkFinished() {
        return workFinished;
    }

    public void setWorkFinished(boolean workFinished) {
        this.workFinished = workFinished;
    }
}
