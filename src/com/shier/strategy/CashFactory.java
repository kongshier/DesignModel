package com.shier.strategy;

/**
 * @author Shier
 * CreateTime 2023/4/10 21:50
 * 收费工厂
 */
public class CashFactory {
    public static ISale createCashAccept(int cashType){
        ISale cs = null;
        switch (cashType) {
            case 1:
                //正常收费
                cs = new CashNormal();
                break;
            case 2:
                //打八折
                cs = new CashRebate(0.8d);
                break;
            case 3:
                //打七折
                cs = new CashRebate(0.7d);
                break;
            case 4:
                //满300返100
                cs = new CashReturn(300d,100d);
                break;
            default:
                break;
        }
        return cs;
    }
}
