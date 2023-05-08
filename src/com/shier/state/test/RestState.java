package com.shier.state.test;

/**
 * @author Shier
 * CreateTime 2023/5/7 12:15
 * 按时下班
 */
public class RestState extends State {
    @Override
    public void workTime(Work work) {
        System.out.println("当前时间：" + work.getHour() + "点，下班回家咯！！");
    }
}
