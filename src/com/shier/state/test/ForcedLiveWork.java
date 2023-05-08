package com.shier.state.test;

/**
 * @author Shier
 * CreateTime 2023/5/7 12:27
 * 强制下班
 */
public class ForcedLiveWork extends State {
    @Override
    public void workTime(Work work) {
        if (work.getHour() < 20) {
            System.out.println("当前时间" + work.getHour() + "点，公司规定，此刻必须要离开公司了。");
        } else {
            // 到点睡觉
            work.setCurrentState(new SleepingState());
            work.workTime();
        }
    }
}
