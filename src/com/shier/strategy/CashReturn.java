package com.shier.strategy;

/**
 * @author Shier
 * CreateTime 2023/4/10 21:55
 * <p>
 * 满多少反多少
 */
public class CashReturn extends CashSuper {
    //返利条件
    private double moneyCondition = 0d;
    //返利值
    private double moneyReturn = 0d;

    //返利收费。初始化时需要输入返利条件和返利值。
    //比如“满300返100”，就是moneyCondition=300,moneyReturn=100
    public CashReturn(double moneyCondition, double moneyReturn) {
        this.moneyCondition = moneyCondition;
        this.moneyReturn = moneyReturn;
    }

    //计算收费时，当达到返利条件，就原价减去返利值
    public double acceptCash(double price, int num) {
        double result = price * num;
        if (moneyCondition > 0 && result >= moneyCondition)
            // 比如 result = 420 - (420/300) * 100 = 320 320就是优惠之后的价格，这个情况是满300减一百，满六百见两百了
            result = result - Math.floor(result / moneyCondition) * moneyReturn;
        // 只要大于300，才会返利100
        //result = result - moneyReturn;
        return super.acceptCash(result, 1);
    }
}
