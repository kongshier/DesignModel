package com.shier.visitor.test;

/**
 * @author Shier
 * CreateTime 2023/5/24 21:37
 * 男人
 */
public class Man extends Person {

    /**
     * 得到结论或反应
     */
    public void getConclusion() {
        if (action == "成功") {
            System.out.println(this.getClass().getSimpleName() + this.action + "时，背后多半有一个伟大的女人。");
        } else if (action == "失败") {
            System.out.println(this.getClass().getSimpleName() + this.action + "时，闷头喝酒，谁也不用劝。");
        } else if (action == "恋爱") {
            System.out.println(this.getClass().getSimpleName() + this.action + "时，凡事不懂也要装懂。");
        }
    }
}