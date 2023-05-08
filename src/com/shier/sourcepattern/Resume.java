package com.shier.sourcepattern;

/**
 * @author Shier
 * CreateTime 2023/4/21 22:03
 * 简历类
 */
public class Resume implements Cloneable {
    private String name;
    private String sex;
    private String age;

    private WorkExperience workExperience;

    public Resume(String name) {
        this.name = name;
        this.workExperience = new WorkExperience();
    }

    /**
     * 设置个人信息
     */
    public void setPersonalInfo(String sex, String age) {
        this.sex = sex;
        this.age = age;
    }

    /**
     * 设置工作经历
     */
    public void setWorkExperience(String company, String workTime) {
        this.workExperience.setCompany(company);
        this.workExperience.setWorkTime(workTime);
    }

    /**
     * 展示简历
     */
    public void showResume() {
        System.out.println("姓名：" + this.name + "\t年龄" + this.age + "\t性别" + this.sex);
        System.out.println("工作经历：" + this.workExperience.getCompany() + "\t时间：" + this.workExperience.getWorkTime());
    }

    /**
     * 实现clone方法
     */
    public Resume clone() {
        Resume object = null;
        // 使用克隆对象进行克隆内容
        try {
            object = (Resume) super.clone();
            // 进行深拷贝
            this.workExperience = this.workExperience.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("克隆异常了");
            throw new RuntimeException(e);
        }
        return object;
    }
}
