package com.shier.combination.test;

/**
 * @author Shier
 * CreateTime 2023/5/10 17:27
 */
public class CompanyClient {
    public static void main(String[] args) {
        // 总部公司
        ConcreteCompany root = new ConcreteCompany("北京总公司");
        root.add(new HRDepartment("总公司人力资源部门"));
        root.add(new HRDepartment("总公司财务部门"));

        // 上海分公司 为总公司的子公司，其本身下还具有两个部门
        ConcreteCompany composite1 = new ConcreteCompany("上海华东分公司");
        composite1.add(new HRDepartment("华东分公司人力资源部"));
        composite1.add(new HRDepartment("华东分公司财务部"));
        root.add(composite1);

        // 南京办事处 为 华东分公司 的公司，其本身下还具有两个部门
        ConcreteCompany composite2 = new ConcreteCompany("南京办事处");
        composite2.add(new HRDepartment("南京办事处人力资源部门"));
        composite2.add(new HRDepartment("南京办事处财务部门"));
        composite1.add(composite2);

        // 根部还有其他部门
        HRDepartment leaf2 = new HRDepartment("其他部门");
        root.add(leaf2);

        System.out.println("公司管理结构图：");
        root.display(1);
        System.out.println("各自职责");
        root.lineOfDuty();
    }
}
