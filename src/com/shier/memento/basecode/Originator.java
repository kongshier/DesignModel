package com.shier.memento.basecode;

/**
 * @author Shier
 * CreateTime 2023/5/10 11:26
 * 发起人（Originator）类
 */
public class Originator {
    /**
     * 状态
     */
    private String state;

    /**
     * 显示数据
     */
    public void show() {
        System.out.println("Current State : " + this.state);
    }

    /**
     * 创建备忘录
     *
     * @return 将当前需要保存的信息导入并实例化出一个Memento对象
     */
    public Memento createMemento(){
        return new Memento(this.state);
    }
    /**
     * 恢复备忘录
     */
    public void recoveryMemento(Memento memento){
        this.setState(memento.getState());
    }

    /**
     * 需要保存的属性
     *
     * @return
     */
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
