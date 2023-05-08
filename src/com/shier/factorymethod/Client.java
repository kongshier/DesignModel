package com.shier.factorymethod;

public class Client {
    public static void main(String[] args) {
        ProductFactory bookFactory = new BookProductFactory("Java编程思想", 99.9);
        Product book = bookFactory.createProduct();
        book.productShow();

        ProductFactory electronicFactory = new ElectronicProductFactory("iPad Pro", 7999);
        Product electronic = electronicFactory.createProduct();
        electronic.productShow();
    }
}