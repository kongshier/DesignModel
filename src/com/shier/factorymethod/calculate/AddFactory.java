package com.shier.factorymethod.calculate;

import com.shier.simplefactory.Add;
import com.shier.simplefactory.Operation;

/**
 * @author Shier
 * CreateTime 2023/4/18 22:43
 * 加的工厂
 */
public class AddFactory implements IFactory{

    @Override
    public Operation crearOperation() {
        return new Add();
    }
}
