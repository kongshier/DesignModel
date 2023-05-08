package com.shier.simplefactory;

/**
 * @author Shier
 * CreateTime 2023/4/18 22:43
 * 加的工厂
 */
public class AddFactory implements IFactory {


    @Override
    public Operation createOperation(String operType) {
        return new Add();
    }
}
