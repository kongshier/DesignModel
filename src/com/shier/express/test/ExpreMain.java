package com.shier.express.test;

/**
 * @author Shier
 * CreateTime 2023/5/24 19:50
 */
public class ExpreMain {
    public static void main(String[] args) {
        String sentence = "How much does it cost?";
        String language = "中文";

        String translatedSentence;

        if (language.equals("English")) {
            translatedSentence = translateToEnglish(sentence);
        } else if (language.equals("Spanish")) {
            translatedSentence = translateToSpanish(sentence);
        } else if (language.equals("French")) {
            translatedSentence = translateToFrench(sentence);
        } else if (language.equals("中文")) {
            translatedSentence = translateToChinese(sentence);
        } else {
            translatedSentence = "Language not supported";
        }

        System.out.println("Translated sentence: " + translatedSentence);
    }

    private static String translateToEnglish(String sentence) {
        // 实现将句子翻译为英语的逻辑
        return sentence;
    }

    private static String translateToChinese(String sentence) {
        // 实现将句子翻译为英语的逻辑
        return "要多少钱？";
    }

    private static String translateToSpanish(String sentence) {
        // 实现将句子翻译为西班牙语的逻辑
        return "¿Cuánto cuesta?";
    }

    private static String translateToFrench(String sentence) {
        // 实现将句子翻译为法语的逻辑
        return "Combien ça coûte ?";
    }
}
