package com.shier.factorymethod.calculate;

/**
 * @author Shier
 * CreateTime 2023/4/8 17:56
 */
public class OperationFactory {
    public static Operation createOperate(String operate) {
        Operation operation = null;
        IFactory factory = null;
        switch (operate) {
            case "+":
                //operation = new Add();
                factory = new AddFactory();
                break;
            case "/":
                factory = new DivFactory();
                break;
            case "-":
                factory = new SubFactory();
                break;
            case "*":
                factory = new MulFactory();
                break;
            default:
                break;
        }
        return operation;
    }
}
