package com.shier.state.test;

/**
 * @author Shier
 * CreateTime 2023/5/7 12:10
 * 中午状态
 */
public class NoonState extends State {
    @Override
    public void workTime(Work work) {
        if (work.getHour() < 13) {
            System.out.println("当前时间" + work.getHour() + "点,饿了，午饭，犯困，午休。");
        } else {
            // 超过13点就转入下午工作状态
            work.setCurrentState(new AfternoonState());
            work.workTime();
        }
    }
}
