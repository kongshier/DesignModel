package com.shier.proxy.demo;

/**
 * @author Shier
 * CreateTime 2023/4/17 22:39
 */
public class Test {
    public static void main(String[] args) {
        Proxy proxy = new Proxy();
        proxy.request(); // 通过代理发送给RealSubject类
    }
}
