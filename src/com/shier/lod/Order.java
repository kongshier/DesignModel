package com.shier.lod;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Shier
 * CreateTime 2023/4/22 22:49
 */
public class Order {
    private String orderId;
    private Customer customer;
    private Map<Product, Integer> productQuantities;

    public Order(String orderId, Customer customer) {
        this.orderId = orderId;
        this.customer = customer;
        this.productQuantities = new HashMap<>();
    }

    /**
     * 构造商品
     * @param product
     * @param quantity
     */
    public void addProduct(Product product, int quantity) {
        if (!productQuantities.containsKey(product)) {
            productQuantities.put(product, 0);
        }
        productQuantities.put(product, productQuantities.get(product) + quantity);
    }

    /**
     * 计算总价
     * @return
     */
    public double calculateTotalPrice() {
        double totalPrice = 0;
        for (Product product : productQuantities.keySet()) {
            int quantity = productQuantities.get(product);
            totalPrice += product.getPrice() * quantity;
        }
        return totalPrice;
    }

}
