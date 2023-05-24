package com.shier.visitor.demo;

import java.util.ArrayList;

/**
 * @author Shier
 * CreateTime 2023/5/24 21:20
 */
public class ObjectStructure {
    private ArrayList<Element> elements = new ArrayList<>();

    public void attach(Element element) {
        elements.add(element);
    }

    public void detach(Element element) {
        elements.remove(element);
    }

    public void accept(Visitor visitor) {
        for (Element element : elements) {
            element.accept(visitor);
        }
    }
}
