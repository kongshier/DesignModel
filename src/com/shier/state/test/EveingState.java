package com.shier.state.test;

/**
 * @author Shier
 * CreateTime 2023/5/7 12:13
 * 具体加班累
 */
public class EveingState extends State {
    @Override
    public void workTime(Work work) {
        if (work.getWorkFinished()) {
            // 工作完成，下班
            work.setCurrentState(new RestState());
            work.workTime();
        } else {
            // 工作没有完成则继续加班
            //work.setCurrentState(new ForcedLiveWork());
            if (work.getHour() < 21) {
                System.out.println("当前时间" + work.getHour() + "点，又开始加班，疲累之极，**加班。");
            } else {
                // 到点睡觉
                work.setCurrentState(new SleepingState());
                work.workTime();
            }
        }
    }
}
