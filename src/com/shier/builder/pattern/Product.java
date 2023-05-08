package com.shier.builder.pattern;

import java.util.ArrayList;

/**
 * @author Shier
 * CreateTime 2023/4/25 22:26
 * 产品类
 */
public class Product {
    ArrayList<String>  parts = new ArrayList<>();

    /**
     * 添加新的产品部件
     * @param part
     */
    public void add(String part){
        parts.add(part);
    }

    /**
     * 列举所有的产品
     */
    public void show(){
        for (String part : parts) {
            System.out.println(part);
        }
    }
}
