package com.shier.express.test;

import java.util.HashMap;
import java.util.Map;

public class Context {
    private Map<String, String> translations;

    public Context() {
        translations = new HashMap<>();
    }

    public void addTranslation(String language, String translation) {
        translations.put(language, translation);
    }

    public String translate(String language) {
        return translations.get(language);
    }
}
