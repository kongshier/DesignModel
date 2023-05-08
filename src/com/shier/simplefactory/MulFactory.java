package com.shier.simplefactory;

/**
 * @author Shier
 * CreateTime 2023/4/18 22:43
 * 乘的工厂
 */
public class MulFactory implements IFactory {

    @Override
    public Operation createOperation(String operType) {
        return new Mul();
    }
}
