package com.shier.state.model;

/**
 * @author Shier
 * CreateTime 2023/5/7 10:45
 */
public class ConcreteStateB extends State {

    /**
     * 设置ConcreteStateB的下一个状态是ConcreteStateA
     * @param context
     */
    @Override
    public void handle(Context context) {
        context.setState(new ConcreteStateA());
    }
}
