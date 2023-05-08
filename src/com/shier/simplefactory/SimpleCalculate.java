package com.shier.simplefactory;

import java.util.Scanner;

/**
 * @author Shier
 * CreateTime 2023/4/7 16:22
 * 简单的计算器
 */
public class SimpleCalculate {
    public static void main(String[] args) {
        // 改进之前
        //Scanner scanner = new Scanner(System.in);
        //System.out.print("请输入数字A:");
        //String A = scanner.nextLine();
        //System.out.print("请选择进行的操作运行（/、*、-、+）:");
        //String B = scanner.nextLine();
        //System.out.print("请输入数字B:");
        //String C = scanner.nextLine();
        //double D = 0d;
        //if (B.equals("+")) {
        //    D = Double.parseDouble(A) + Double.parseDouble(C);
        //}
        //if (B.equals("-")) {
        //    D = Double.parseDouble(A) - Double.parseDouble(C);
        //}
        //if (B.equals("*")) {
        //    D = Double.parseDouble(A) * Double.parseDouble(C);
        //}
        //if (B.equals("/")) {
        //    D = Double.parseDouble(A) / Double.parseDouble(C);
        //}
        //System.out.println("计算结果:" + D);

        // 代码规范之后
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("请输入数字A:");
            Double numberA = Double.parseDouble(scanner.nextLine());
            System.out.print("请选择进行的操作运行（/、*、-、+）:");
            String strOperate = scanner.nextLine();
            System.out.print("请输入数字B:");
            Double numberB = Double.parseDouble(scanner.nextLine());
            Operation operate = OperationFactory.createOperate(strOperate);
            double result = operate.getResult(numberA, numberB);
            System.out.println("计算结果:" + result);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
