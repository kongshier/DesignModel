package com.shier.template;
/**
 *
 * @author Shier
 * CreateTime 2023/4/22 22:03
 */
public class Test {

	public static void main(String[] args){

		System.out.println("学生甲抄的试卷：");
        TestPaper studentA = new TestPaperA();
        studentA.testQuestion1();
        studentA.testQuestion2();
        studentA.testQuestion3();

        System.out.println("学生乙抄的试卷：");
        TestPaper studentB = new TestPaperB();
        studentB.testQuestion1();
        studentB.testQuestion2();
        studentB.testQuestion3();
	}
}