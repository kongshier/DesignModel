package com.shier.facade;

/**
 * @author Shier
 * CreateTime 2023/4/23 22:18
 */
public class FacadeTest {
    public static void main(String[] args) {
        Fund fund = new Fund();
        // 基金完成购买
        fund.buyFund();
        // 基金赎回
        fund.sellFund();
    }
}

// 股票一
class Stock1 {
    // 卖股票
    public void sell() {
        System.out.println("股票一售出");
    }

    //买股票
    public void buy() {
        System.out.println("股票一买入");
    }
}

// 股票二
class Stock2 {
    // 卖股票
    public void sell() {
        System.out.println("股票二售出");
    }

    //买股票
    public void buy() {
        System.out.println("股票二买入");
    }
}

// 国债一
class NationDebt1 {
    // 卖国债
    public void sell() {
        System.out.println("国债一售出");
    }

    //买国债
    public void buy() {
        System.out.println("国债一买入");
    }
}

// 房地厂一
class Realty1 {
    // 卖房地厂
    public void sell() {
        System.out.println("房地产一售出");
    }

    // 买房地厂
    public void buy() {
        System.out.println("房地厂一买入");
    }
}

