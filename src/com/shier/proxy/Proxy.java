package com.shier.proxy;

/**
 * @author Shier
 * CreateTime 2023/4/17 22:04
 * 代理类
 */
public class Proxy implements GiveGift {

    private Pursuit pursuit; //认识追求者


    public Proxy(ObjectGirl girl) { // 也认识被追求者
        this.pursuit = new Pursuit(girl); // 代理初始化，实际就是追求者初始化过程
    }

    public void giveFlowers() { // 代理者向被追求者松礼物
        this.pursuit.giveFlowers();
    }

    public void giveChocolate() {
        this.pursuit.giveChocolate();
    }

    public void giveDolls() {
        this.pursuit.giveDolls();
    }
}
