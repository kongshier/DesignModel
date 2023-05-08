package com.shier.proxy;

/**
 * @author Shier
 * CreateTime 2023/4/17 22:09
 */
public class ProxyTest {
    public static void main(String[] args) {
        ObjectGirl xiaohong = new ObjectGirl();
        xiaohong.setGirlName("小红");
        Proxy xiaohua = new Proxy(xiaohong);
        xiaohua.giveDolls();
        xiaohua.giveFlowers();
        xiaohua.giveChocolate();
    }
}
