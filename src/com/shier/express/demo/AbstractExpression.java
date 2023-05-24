package com.shier.express.demo;

/**
 * @author Shier
 * CreateTime 2023/5/24 19:27
 * 抽象表达式
 */
public abstract class AbstractExpression {
    /**
     * 解释操作 - 类似翻译
     * @param context
     */
    public abstract void interpret(Context context);
}
