package com.shier.strategy;

import java.util.Scanner;

/**
 * @author Shier
 * CreateTime 2023/4/10 21:40
 */
public class ShopCashDemo03 {
    public static void main(String[] args) {
        //商品单价
        double price = 0d;
        //商品购买数量
        int num = 0;
        //当前商品合计费用
        double totalPrices = 0d;
        // 打几折
        int discount = 0;
        //总计所有商品费用
        double total = 0d;
        Scanner sc = new Scanner(System.in);
        // 不断输入，知道输入的价格或和数量小于0
        do {
            System.out.print("请输入商品折扣模式（1.正常收费 2.打八折 3.打七折 4.满300返100）：");
            discount = Integer.parseInt(sc.nextLine());
            System.out.print("请输入商品单价：");
            price = Double.parseDouble(sc.nextLine());
            System.out.print("请输入商品数量：");
            num = Integer.parseInt(sc.nextLine());
            if (price > 0 && num > 0) {
                //简单工厂模式根据discount的数字选择合适的收费类生成实例
                ISale csuper = CashFactory.createCashAccept(discount);
                //通过多态，可以根据不同收费策略计算得到收费的结果
                totalPrices = csuper.acceptCash(price,num);
            }
            total = total + totalPrices;
            System.out.println("单价：" + price + "元 	数量：" + num + " 合计：" + totalPrices + "元");
            System.out.println("总计：" + total + "元");
        }
        while (price > 0 && num > 0);
    }
}
