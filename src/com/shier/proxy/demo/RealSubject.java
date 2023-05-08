package com.shier.proxy.demo;

/**
 * @author Shier
 * CreateTime 2023/4/17 22:36
 * 真实的实体类
 */
public class RealSubject  implements ISubject {
    @Override
    public void request() {
        System.out.println("RealSubject do something");
    }
}