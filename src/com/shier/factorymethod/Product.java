package com.shier.factorymethod;

/**
 * @author Shier
 * 产品接口
 */
public interface Product {
    // 产品共有的名称
    String getName();

    // 产品都有价格
    double getPrice();

    // 买的是什么产品
    void productShow();
}