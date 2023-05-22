package com.shier.combination.demo;

/**
 * @author Shier
 * CreateTime 2023/5/10 17:27
 */
public class CombinationClient {
    public static void main(String[] args) {
        // 根节点
        Composite root = new Composite("root");
        root.add(new Leaf("HRDepartment A"));
        root.add(new Leaf("HRDepartment B"));

        // composite1 为root的子节点，其本身下还具有两个叶子节点
        Composite composite1 = new Composite("ConcreteCompany 1");
        composite1.add(new Leaf("HRDepartment 1-A"));
        composite1.add(new Leaf("HRDepartment 1-B"));
        root.add(composite1);

        // composite1-1 为 composite1 的子节点，其本身下还具有两个叶子节点
        Composite composite2 = new Composite("ConcreteCompany 1-1");
        composite2.add(new Leaf("HRDepartment 1-1-A"));
        composite2.add(new Leaf("HRDepartment 1-1-B"));
        composite1.add(composite2);

        // 根部还有两个叶子节点 C 和 D
        Leaf leaf2 = new Leaf("HRDepartment C");
        root.add(leaf2);
        // 3 被移除了
        Leaf leaf3 = new Leaf("HRDepartment D");
        root.add(leaf3);
        root.remove(leaf3);

        root.display(1);
    }
}
