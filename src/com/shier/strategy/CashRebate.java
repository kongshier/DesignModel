package com.shier.strategy;

/**
 * @author Shier
 * CreateTime 2023/4/10 21:53
 * <p>
 * 打折收费
 */
public class CashRebate extends CashSuper {
    private double moneyRebate = 1d;

    //初始化时必需输入折扣率。八折就输入0.8
    public CashRebate(double moneyRebate) {
        this.moneyRebate = moneyRebate;
    }

    //计算收费时需要在原价基础上乘以折扣率
    public double acceptCash(double price, int num) {
        double result = price * num * this.moneyRebate;
        return super.acceptCash(result, 1);
    }
}
