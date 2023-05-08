package com.shier.factorymethod;

/**
 * @author Shier
 * <p>
 * 电子产品类
 */
public class ElectronicProduct implements Product {
    private String name;
    private double price;

    public ElectronicProduct(String name, double price) {
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
        System.out.println("ElectronicProduct{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}');
    }

}