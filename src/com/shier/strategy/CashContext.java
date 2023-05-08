package com.shier.strategy;

/**
 * @author Shier
 * CreateTime 2023/4/11 22:55
 */
public class CashContext {
    /**
     * CashSuper对象
     */
    private ISale cashSuper;

    /**
     * 通过构造方法，传入具体的收费策略
     */
    public CashContext(int cashType) {
        //根据用户输入，将对应的策略对象作为参数传入CashContent对象中
        IFactory fs = null;
        switch (cashType) {
            case 1:
                //原价
                fs = new CashRebateReturnFactory(1d,0d,0d);
                break;
            case 2:
                //打8折
                fs = new CashRebateReturnFactory(0.8d,0d,0d);
                break;
            case 3:
                //打7折
                fs = new CashRebateReturnFactory(0.7d,0d,0d);
                break;
            case 4:
                //满300返100
                fs = new CashRebateReturnFactory(1,300d,100d);
                break;
            case 5:
                //先打8折,再满300返100
                fs = new CashRebateReturnFactory(0.8d,300d,100d);
                break;
            case 6:
                //先满200返50，再打7折
                fs = new CashReturnRebateFactory(0.7d,200d,50d);
                break;
            default:
                break;
        }
        this.cashSuper = fs.createSalesModel();
    }
    /**
     * 根据不同的收费策略返回不同的结构
     */
    public double getResult(double price, int num) {
        return cashSuper.acceptCash(price, num);
    }
}
