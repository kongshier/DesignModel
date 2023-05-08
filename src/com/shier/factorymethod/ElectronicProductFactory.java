package com.shier.factorymethod;

/**
 * @author Shier
 * 电子产品工厂
 */
public class ElectronicProductFactory implements ProductFactory {
    private String name;
    private double price;

    public ElectronicProductFactory(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public Product createProduct() {
        return new ElectronicProduct(this.name, this.price);
    }
}