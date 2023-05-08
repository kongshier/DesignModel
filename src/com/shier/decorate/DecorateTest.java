package com.shier.decorate;

/**
 * @author Shier
 * CreateTime 2023/4/16 22:35
 */
public class DecorateTest {
    public static void main(String[] args) {
        Person kun = new Person("Ikun");
        System.out.print("第一套装扮：");
        // 穿球鞋的Ikun
        Sneakers sneakers = new Sneakers();
        sneakers.decorate(kun);
        // 在穿球鞋的Ikun基础上，再给他穿一条背带裤
        Bdk bdk = new Bdk();
        bdk.decorate(sneakers);
        bdk.show();
        System.out.println();
        System.out.print("第二套装扮：");
        // 穿西装的ikun
        Suit suit = new Suit();
        suit.decorate(kun);
        // 在穿西装的ikun基础上再传一个皮鞋
        LeatherShoes leatherShoes = new LeatherShoes();
        leatherShoes.decorate(suit);
        // 在穿西装和皮鞋的基础上带零领带
        Tie tie = new Tie();
        tie.decorate(leatherShoes);
        // 再带一个草帽，标配
        Strawhat strawhat = new Strawhat();
        strawhat.decorate(tie);
        strawhat.show();
    }
}
