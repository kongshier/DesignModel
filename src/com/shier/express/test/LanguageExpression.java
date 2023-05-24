package com.shier.express.test;

/**
 * @author Shier
 */
public class LanguageExpression implements Expression {
    private String language;

    public LanguageExpression(String language) {
        this.language = language;
    }

    @Override
    public String interpret(Context context) {
        return context.translate(language);
    }
}
