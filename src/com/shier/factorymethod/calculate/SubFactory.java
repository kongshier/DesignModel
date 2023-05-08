package com.shier.factorymethod.calculate;

import com.shier.simplefactory.Add;
import com.shier.simplefactory.Operation;
import com.shier.simplefactory.Sub;

/**
 * @author Shier
 * CreateTime 2023/4/18 22:44
 * 减法的工厂
 */
public class SubFactory implements IFactory{

    @Override
    public Operation crearOperation() {
        return new Sub();
    }
}
