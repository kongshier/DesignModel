package com.shier.express.test;

/**
 * @author Shier
 */
public class NonLanguageExpression implements Expression {
    private Expression firstExpression;
    private Expression secondExpression;

    public NonLanguageExpression(Expression firstExpression, Expression secondExpression) {
        this.firstExpression = firstExpression;
        this.secondExpression = secondExpression;
    }

    @Override
    public String interpret(Context context) {
        String firstTranslation = firstExpression.interpret(context);
        String secondTranslation = secondExpression.interpret(context);
        return firstTranslation + " " + secondTranslation;
    }
}
