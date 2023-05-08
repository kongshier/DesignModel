package com.shier.sourcepattern;

/**
 * @author Shier
 * CreateTime 2023/4/21 22:08
 */
public class ResumeTest1 {
    public static void main(String[] args) {
        Resume resume1 = new Resume("Shier");
        resume1.setPersonalInfo("男", "19");
        resume1.setWorkExperience("鱼皮科技1", "2023-04~05");

        Resume resume2 = resume1.clone();
        resume2.setWorkExperience("鱼皮科技2", "2023-04~05");

        Resume resume3 = resume1.clone();
        resume3.setWorkExperience("鱼皮科技3", "2023-04~05");

        resume1.showResume();
        resume2.showResume();
        resume3.showResume();
    }
}
