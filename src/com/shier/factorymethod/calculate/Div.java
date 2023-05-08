package com.shier.factorymethod.calculate;

/**
 * @author Shier
 * CreateTime 2023/4/8 17:30
 */
public class Div extends Operation {
    @Override
    public double getResult(double numberA, double numberB) {
        if (numberB == 0) {
            System.out.println("除数不能为0");
            throw new ArithmeticException();
        }
        return numberA / numberB;
    }
}
