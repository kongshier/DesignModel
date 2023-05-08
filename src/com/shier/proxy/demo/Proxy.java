package com.shier.proxy.demo;

/**
 * @author Shier
 * CreateTime 2023/4/17 22:36
 * 代理类:代理真实类完成一些列的操作
 */
public class Proxy implements ISubject {
    private RealSubject rs; // 拥有真实类的属性

    public Proxy() {
        this.rs = new RealSubject(); // 代理初始化，也就是真实类的初始化过程
    }

    // 代理类要做的事情
    public void request() {
        this.rs.request();
    }
}
