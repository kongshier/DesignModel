package com.shier.abstractfactory.test;

/**
 * @author Shier
 * 家具类
 */
public class Furniture {
    private String type;
    private String style;
    private double price;

    public Furniture(String type, String style, double price) {
        this.type = type;
        this.style = style;
        this.price = price;
    }

    public void printInfo() {
        System.out.println("Type: " + type);
        System.out.println("Style: " + style);
        System.out.println("Price: " + price);
    }
}