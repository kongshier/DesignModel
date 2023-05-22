package com.shier.combination.test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Shier
 * CreateTime 2023/5/10 17:23
 * 具体分公司
 */
public class ConcreteCompany extends Company {

    /**
     * 子对象集合依赖存储下属的枝节点和叶子节点
     */
    private List<Company> childrenList = new ArrayList<>();

    public ConcreteCompany(String name) {
        super(name);
    }

    @Override
    public void add(Company company) {
        childrenList.add(company);
    }

    @Override
    public void remove(Company company) {
        childrenList.remove(company);
    }

    @Override
    public void display(int depth) {
        // 叶节点具体显示方法，显示名称和级别
        for (int i = 0; i < depth; i++) {
            System.out.print("-");
        }
        System.out.println(name);
        // 遍历下级节点
        for (Company component : childrenList) {
            component.display(depth + 1);
        }
    }

    /**
     * 履行职责
     */
    @Override
    public void lineOfDuty() {
        for (Company company : childrenList) {
            company.lineOfDuty();
        }
    }
}
