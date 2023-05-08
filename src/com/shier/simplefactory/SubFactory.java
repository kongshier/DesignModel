package com.shier.simplefactory;

/**
 * @author Shier
 * CreateTime 2023/4/18 22:44
 * 减法的工厂
 */
public class SubFactory implements IFactory {

    @Override
    public Operation createOperation(String operType) {
        return new Sub();
    }
}
