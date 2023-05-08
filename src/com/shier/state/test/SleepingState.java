package com.shier.state.test;

/**
 * @author Shier
 * CreateTime 2023/5/7 12:15
 * 睡觉状态
 */
public class SleepingState extends State {
    @Override
    public void workTime(Work work) {
        System.out.println("当前时间" + work.getHour() + "点，睡觉时间到了，躺床就睡着。");
    }
}
