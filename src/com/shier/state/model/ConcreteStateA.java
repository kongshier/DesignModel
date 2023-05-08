package com.shier.state.model;

/**
 * @author Shier
 * CreateTime 2023/5/7 10:40
 */
public class ConcreteStateA extends State{

    /**
     * 设置ConcreteStateA的下一个状态是ConcreteStateB
     * @param context
     */
    @Override
    public void handle(Context context) {
        context.setState(new ConcreteStateB());
    }
}
