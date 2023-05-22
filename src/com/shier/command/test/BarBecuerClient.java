package com.shier.command.test;

/**
 * @author Shier
 * CreateTime 2023/5/20 15:25
 */
public class BarBecuerClient {
    public static void main(String[] args) {
        //开店前工作
        Barbecuer barbecuer = new Barbecuer(); // 后厨厨师
        BakeMuttonCommand muttonCommand = new BakeMuttonCommand(barbecuer); // 厨师进行烤羊肉串
        BakeChickenWingCommand chickenWingCommand = new BakeChickenWingCommand(barbecuer); // 厨师烤鸡翅
        Waiter waiter = new Waiter(); // 服务员

        System.out.println("开门营业");
        waiter.setOrders(muttonCommand); // 下单烤羊肉串
        waiter.setOrders(muttonCommand); // 下单烤羊肉串
        waiter.setOrders(muttonCommand); // 下单烤羊肉串
        waiter.setOrders(muttonCommand); // 下单烤羊肉串
        waiter.setOrders(muttonCommand); // 下单烤羊肉串
        waiter.cancelOrder(muttonCommand); // 取消一穿羊肉串

        waiter.setOrders(chickenWingCommand); // 下单烤鸡翅
        System.out.println("点菜完成，通知后厨烧菜");
        waiter.notifyCommand(); // 通知厨师
    }
}
