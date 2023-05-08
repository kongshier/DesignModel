package com.shier.state.test;

/**
 * @author Shier
 * CreateTime 2023/5/7 12:12
 * 下午具体状态
 */
public class AfternoonState extends State {
    @Override
    public void workTime(Work work) {
        if (work.getHour() < 17) {
            System.out.println("当前时间" + work.getHour() + "点,下午状态还可以，继续敲代码。");
        } else {
            // 超时17点就进去傍晚工作时间点
            work.setCurrentState(new EveingState());
            work.workTime();
        }
    }
}
