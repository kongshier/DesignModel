package com.shier.bridge.test;

/**
 * @author Shier
 * CreateTime 2023/5/17 16:59
 */
public class PhoneClient1 {
    public static void main(String[] args) {
        // 调用M手机游戏
        PhoneBrand1 mGame = new PhoneBrandMGame();
        mGame.run();
        // 调用M手机通讯录
        PhoneBrand1 mAddressList= new PhoneBrandMAddressList();
        mAddressList.run();

        // 调用N手机游戏
        PhoneBrand1 nGame = new PhoneBrandNGame();
        nGame.run();
        // 调用N手机通讯录
        PhoneBrand1 nAddressList= new PhoneBrandNAddressList();
        nAddressList.run();

    }
}
