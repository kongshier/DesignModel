package com.shier.factorymethod.calculate;

/**
 * @author Shier
 * CreateTime 2023/4/8 17:30
 */
public class Add extends Operation {
    @Override
    public double getResult(double numberA, double numberB) {
        return numberA + numberB;
    }
}
