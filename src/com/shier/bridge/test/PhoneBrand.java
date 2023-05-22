package com.shier.bridge.test;

/**
 * @author Shier
 * CreateTime 2023/5/17 17:17
 * 手机品牌
 */
public abstract class PhoneBrand {
    protected PhoneSoft phoneSoft;

    /**
     * 设置手机软件
     *
     * @param phoneSoft
     */
    public void setPhoneSoft(PhoneSoft phoneSoft) {
        this.phoneSoft = phoneSoft;
    }

    /**
     * 执行
     */
    public abstract void run();
}
