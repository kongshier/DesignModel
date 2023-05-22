package com.shier.iterator.demo;

/**
 * @author Shier
 * CreateTime 2023/5/13 21:27
 */
public class BaseClient {
    public static void main(String[] args) {

        // 聚集对象 上面的例子就相当于公交车bus
        ConcreteAggregate aggregateBus = new ConcreteAggregate();
        aggregateBus.add("shier");
        aggregateBus.add("公交公司员工");
        aggregateBus.add("小菜");
        aggregateBus.add("大白");
        aggregateBus.add("小黑");
        aggregateBus.add("小偷");

        // 迭代器对象声明，即相当于售票员
        ConcreteIterator conductor = new ConcreteIterator(aggregateBus);
        // 向第一个乘客售票
        conductor.first();
        while (!conductor.isDone()) {
            // 没有到最后一个则一直走向下一个乘客
            System.out.println(conductor.currentItems() + ": 请买票！");
            conductor.netx();
        }

    }
}
