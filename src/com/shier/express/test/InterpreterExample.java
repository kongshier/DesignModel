package com.shier.express.test;

public class InterpreterExample {
    public static void main(String[] args) {
        Context context = new Context();
        context.addTranslation("English", "Hello");
        context.addTranslation("French", "Bonjour");
        context.addTranslation("Spanish", "Hola");

        Expression englishExpression = new LanguageExpression("English");
        Expression frenchExpression = new LanguageExpression("French");
        Expression spanishExpression = new LanguageExpression("Spanish");

        Expression combinedExpression = new NonLanguageExpression(frenchExpression,spanishExpression);

        String travelerLanguage = "French";

        String translatedText = null;
        if (travelerLanguage.equals("English")) {
            translatedText = englishExpression.interpret(context);
        } else if (travelerLanguage.equals("French")) {
            translatedText = combinedExpression.interpret(context);
        } else if (travelerLanguage.equals("Spanish")) {
            translatedText = spanishExpression.interpret(context);
        }
        System.out.println("Traveler: " + translatedText);
    }
}
