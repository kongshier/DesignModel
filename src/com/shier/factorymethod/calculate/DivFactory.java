package com.shier.factorymethod.calculate;

import com.shier.simplefactory.Add;
import com.shier.simplefactory.Div;
import com.shier.simplefactory.Operation;

/**
 * @author Shier
 * CreateTime 2023/4/18 22:43
 * 除法的工厂
 */
public class DivFactory implements IFactory{

    @Override
    public Operation crearOperation() {
        return new Div();
    }
}
