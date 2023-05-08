package com.shier.strategy;

/**
 * @author Shier
 * CreateTime 2023/4/10 21:51
 */
public class CashSuper implements ISale {
    private ISale sale;

    // 装饰对象
    public void decorate(ISale iSale) {
        this.sale = iSale;
    }

    public double acceptCash(double price, int num) {
        double result = 0d;
        if (this.sale != null) {
            // 若装饰对象存在，则执行装饰对象的算法
            result = this.sale.acceptCash(price, num);
        }
        return result;
    }
}
