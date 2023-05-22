package com.shier.bridge.test;

/**
 * @author Shier
 * CreateTime 2023/5/17 16:55
 * 手机品牌M
 */
public class PhoneBrandM extends PhoneBrand {
    @Override
    public void run() {
        System.out.print("品牌M");
        phoneSoft.run();
    }
}
