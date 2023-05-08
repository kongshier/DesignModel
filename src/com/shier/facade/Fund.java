package com.shier.facade;

import java.util.Scanner;

/**
 * @author Shier
 * CreateTime 2023/4/23 22:30
 * 买入卖出的操作在基金类完成，就不用用户关心
 * 也就是说基金类需要了解到市场股票等项目的买入卖出情况，以备用户知道
 */
public class Fund {
    Stock1 stock1;
    Stock2 stock2;
    NationDebt1 nationDebt1;
    Realty1 realty1;

    public Fund() {
        stock1 = new Stock1();
        stock2 = new Stock2();
        nationDebt1 = new NationDebt1();
        realty1 = new Realty1();
    }

    //基金类购买
    public void buyFund() {
        stock1.buy();
        stock2.buy();
        nationDebt1.buy();
        realty1.buy();
    }
    //基金类销售
    public void sellFund() {
        stock1.sell();
        stock2.sell();
        nationDebt1.sell();
        realty1.sell();
    }
}
