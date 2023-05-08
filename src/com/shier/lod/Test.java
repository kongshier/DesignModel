package com.shier.lod;

/**
 * @author Shier
 *
 */
public class Test {
    public static void main(String[] args) {
        Customer customer = new Customer("张三", "北京市海淀区");
        Product product1 = new Product("电视机", 5000);
        Product product2 = new Product("冰箱", 3000);

        Order order = new Order("202304220001", customer);
        order.addProduct(product1, 2);
        order.addProduct(product2, 1);

        double totalPrice = order.calculateTotalPrice();
        System.out.println("订单总价：" + totalPrice);
    }
}
