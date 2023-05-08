package com.shier.factorymethod;

/**
 * @author Shier
 * 书本产品类
 */
public class BookProduct implements Product {
    private String name;
    private double price;

    public BookProduct(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public void productShow() {
        System.out.println("BookProduct{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}');
    }

}