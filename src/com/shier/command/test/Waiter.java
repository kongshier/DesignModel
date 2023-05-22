package com.shier.command.test;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * @author Shier
 * CreateTime 2023/5/20 15:24
 */
public class Waiter {
    /**
     * 增加存放具体命令的容器
     */
    private ArrayList<Command> orders = new ArrayList<Command>();

    /**
     * 下单
     *
     * @param commands
     */
    public void setOrders(Command commands) {
        String name = commands.getClass().getSimpleName();

        if (name.equals("BakeChickenWingCommand")) {
            System.out.println("服务员：鸡翅没有了，请点别的烧烤");
        } else {
            this.orders.add(commands);
            System.out.println("增加订单：" + name + " 时间：" + getNowTime());
        }
    }

    //取消订单
    public void cancelOrder(Command command) {
        String className = command.getClass().getSimpleName();
        // 可以取消部门订单
        orders.remove(command);
        System.out.println("取消订单：" + className + " 时间：" + getNowTime());
    }

    //通知执行
    public void notifyCommand() {
        // 根据用户点的烧烤订单通知后厨制作
        for (Command command : orders) {
            command.excuteCommand();
        }
    }

    private String getNowTime() {
        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
        return formatter.format(new Date()).toString();
    }
}
