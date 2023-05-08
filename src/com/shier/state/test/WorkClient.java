package com.shier.state.test;

/**
 * @author Shier
 * CreateTime 2023/5/7 11:09
 */
public class WorkClient {
    public static void main(String[] args) {
        Work work = new Work();
        // 早上
        work.setHour(9);
        work.workTime();
        work.setHour(11);
        work.workTime();
        // 中午
        work.setHour(12);
        work.workTime();
        //下午
        work.setHour(13);
        work.workTime();
        work.setHour(14);
        work.workTime();

        work.setHour(17);
        //工作未完成
        work.setWorkFinished(false);
        // 加班
        work.workTime();

        work.setHour(19);
        work.workTime();
        work.setHour(22);
        work.workTime();
    }
}
