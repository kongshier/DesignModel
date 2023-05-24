package com.shier.express.demo;

/**
 * @author Shier
 * CreateTime 2023/5/24 19:29
 * 终结者表达式
 */
public class TerminalExpression extends AbstractExpression{
    @Override
    public void interpret(Context context) {
        System.out.println("终端解释器");
    }
}
