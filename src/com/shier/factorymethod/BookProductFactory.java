package com.shier.factorymethod;

/**
 * @author Shier
 * 书本工厂
 */
public class BookProductFactory implements ProductFactory {
    private String name;
    private double price;

    public BookProductFactory(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public Product createProduct() {
        return new BookProduct(this.name, this.price);
    }
}
