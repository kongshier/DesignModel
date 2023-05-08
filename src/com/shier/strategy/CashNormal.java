package com.shier.strategy;

/**
 * @author Shier
 * CreateTime 2023/4/10 21:54
 *
 * 正常收费，原价返回
 */
public class CashNormal implements ISale {
    // 原价
    public double acceptCash(double price,int num){
        return price * num;
    }
}
