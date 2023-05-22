package com.shier.chain.dmeo;

/**
 * @author Shier
 * CreateTime 2023/5/20 16:09
 */
public class ChainClient {
    public static void main(String[] args) {
        ConcreteHandler1 handler1 = new ConcreteHandler1();
        ConcreteHandler2 handler2 = new ConcreteHandler2();
        ConcreteHandler3 handler3 = new ConcreteHandler3();
        // 设置职责链上下关系
        handler1.setSuccessor(handler2);
        handler2.setSuccessor(handler3);

        // 请求
        int[] request = {15, 67, 8, 9, 46, 1, 5, 23, 41};

        // 循环给最小矗立着提交请求，不同的数额，得不同的权限处理者处理
        for (int i : request) {
            handler1.handleRequest(i);
        }
    }
}
