package com.shier.express.demo;

/**
 * @author Shier
 * CreateTime 2023/5/24 19:29
 * 非终结者表达式
 */
public class NotTerminalExpression extends AbstractExpression{
    @Override
    public void interpret(Context context) {
        System.out.println("非终端解释器");
    }
}
