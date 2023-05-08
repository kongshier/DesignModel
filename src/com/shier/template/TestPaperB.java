package com.shier.template;

/**
 * 学生乙抄的试卷
 *
 * @author Shier
 * CreateTime 2023/4/22 22:03
 */
public class TestPaperB extends TestPaper{
    /**
     * 第一题答案
     * @return
     */
    @Override
    protected String answer1() {
        return "b";
    }

    /**
     * 第二题
     * @return
     */
    @Override
    protected String answer2() {
        return "a";
    }

    /**
     * 第三题
     * @return
     */
    @Override
    protected String answer3() {
        return "c";
    }
}
