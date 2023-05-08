package com.shier.sourcepattern;

/**
 * @author Shier
 * CreateTime 2023/4/21 22:32
 * 工作经历类
 */
public class WorkExperience implements Cloneable{
    private String company;
    private String workTime;

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getWorkTime() {
        return workTime;
    }

    public void setWorkTime(String workTime) {
        this.workTime = workTime;
    }
    /**
     * 实现clone方法
     */
    public WorkExperience clone() {
        WorkExperience object = null;
        // 使用克隆对象进行克隆内容
        try {
            object = (WorkExperience) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("克隆异常了");
            throw new RuntimeException(e);
        }
        return object;
    }
}
