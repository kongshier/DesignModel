package com.shier.adapter.demo;

/**
 * @author Shier
 * CreateTime 2023/5/10 16:46
 */
public class AdapterClient {
    public static void main(String[] args) {
        Player forwards = new Forwards("巴蒂尔");
        forwards.attack();
        Player guards = new Guards("麦格雷迪");
        guards.attack();

        Player center = new Translator("姚明");
        center.defense();
        center.attack();
    }
}
