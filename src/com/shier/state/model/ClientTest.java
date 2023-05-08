package com.shier.state.model;

/**
 * @author Shier
 * CreateTime 2023/5/7 10:46
 */
public class ClientTest {
    public static void main(String[] args) {
        // 初始状态为ConcreteStateA
        Context context = new Context(new ConcreteStateA());
        // 不断请求，不断改变请求状态
        context.request();
        context.request();
        context.request();
    }
}
