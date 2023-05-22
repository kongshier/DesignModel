package com.shier.bridge.test;

/**
 * @author Shier
 * CreateTime 2023/5/17 16:59
 */
public class PhoneClient {
    public static void main(String[] args) {
        // 调用 M 品牌手机
        PhoneBrand brandM = new PhoneBrandM();
        // 调用通用的手机游戏
        brandM.setPhoneSoft(new PhoneGame());
        brandM.run();
        // 通讯录
        brandM.setPhoneSoft(new PhoneAddressList());
        brandM.run();

        // 调用N品牌手机
        PhoneBrand brandN = new PhoneBrandN();
        // 手机游戏
        brandN.setPhoneSoft(new PhoneGame());
        brandN.run();
        // 通讯录
        brandN.setPhoneSoft(new PhoneAddressList());
        brandN.run();
    }

}
