package com.shier.visitor.test1;

import java.util.ArrayList;

/**
 * @author Shier
 * CreateTime 2023/5/24 21:46
 * 对象结构
 */
public class ObjectStructure {
    private ArrayList<Person> elements = new ArrayList<Person>();

    //增加
    public void attach(Person element) {
        elements.add(element);
    }
    //移除
    public void detach(Person element) {
        elements.remove(element);
    }
    //查看显示
    public void display(Action visitor) {
        for(Person e : elements) {
            e.accept(visitor);
        }
    }
}
