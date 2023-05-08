package com.shier.proxy;

/**
 * @author Shier
 * CreateTime 2023/4/17 22:04
 * 追求者
 */
public class Pursuit implements GiveGift{
    private ObjectGirl girl;

    public Pursuit(ObjectGirl girl) {
        this.girl = girl;
    }

    public void giveFlowers() {
        System.out.println(this.girl.getGirlName() + ",你好！，小明叫我送给你的花。");
    }
    public void giveChocolate() {
        System.out.println(this.girl.getGirlName() + ",你好！，小明叫我送给你的巧克力。");
    }
    public void giveDolls() {
        System.out.println(this.girl.getGirlName() + ",你好！，小明叫我送给你的洋娃娃。");
    }
}
