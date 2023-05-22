package com.shier.combination.test;

/**
 * @author Shier
 * CreateTime 2023/5/10 17:20
 * 人力资源部，树叶节点
 */
public class HRDepartment extends Company {
    public HRDepartment(String name) {
        super(name);
    }

    /**
     * 这里是叶子节点，所以说增加和删除什么都不用干
     *
     * @param company
     */
    @Override
    public void add(Company company) {
    }

    @Override
    public void remove(Company company) {
    }

    @Override
    public void display(int depth) {
        // 叶节点具体显示方法，显示名称和级别
        for (int i = 0; i < depth; i++) {
            System.out.print("-");
        }
        System.out.println(name);
    }

    @Override
    public void lineOfDuty() {
        System.out.println(name + " 员工招聘培训管理");
    }
}
