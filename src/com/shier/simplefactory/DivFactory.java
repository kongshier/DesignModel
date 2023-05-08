package com.shier.simplefactory;

/**
 * @author Shier
 * CreateTime 2023/4/18 22:43
 * 除法的工厂
 */
public class DivFactory implements IFactory {

    @Override
    public Operation createOperation(String operType) {
        return new Div();
    }
}
