package com.shier.visitor.test;

/**
 * @author Shier
 * CreateTime 2023/5/24 21:37
 * 女人
 */
public class Woman extends Person {

    /**
     * 得到结论或反应
     */

    public void getConclusion() {
        if (action == "成功") {
            System.out.println(this.getClass().getSimpleName() + this.action + "时，背后大多有一个不成功的男人。");
        } else if (action == "失败") {
            System.out.println(this.getClass().getSimpleName() + this.action + "时，眼泪汪汪，谁也劝不了。");
        } else if (action == "恋爱") {
            System.out.println(this.getClass().getSimpleName() + this.action + "时，遇事懂也装作不懂。");
        }
    }
}
