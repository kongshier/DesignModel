package com.shier.adapter.demo;

/**
 * @author Shier
 * CreateTime 2023/5/10 16:50
 * 适配器 - 翻译类 将姚明和队友之间的沟通进行互通
 */
public class Translator extends Player{
    private ForeignCenter foreignCenter = new ForeignCenter();
    public Translator(String name) {
        super(name);
        foreignCenter.setName(name);
    }

    @Override
    public void attack() {
        foreignCenter.进攻();
    }

    @Override
    public void defense() {
        foreignCenter.防守();
    }
}
