package com.shier.state.test;

/**
 * @author Shier
 * CreateTime 2023/5/7 12:02
 * 早上具体状态
 */
public class ForenoonState extends State {
    @Override
    public void workTime(Work work) {
        if (work.getHour() < 12) {
            System.out.println("当前时间" + work.getHour() + "点，上午工作，精神百倍。");
        } else {
            // 超过12点就转入中午状态
            work.setCurrentState(new NoonState());
            work.workTime();
        }
    }
}
