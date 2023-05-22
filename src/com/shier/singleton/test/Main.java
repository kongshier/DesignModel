package com.shier.singleton.test;

/**
 * @author Shier
 * CreateTime 2023/5/14 9:31
 * 客户端
 */
public class Main {
    public static void main(String[] args) {
        SerialNumberGenerator generator1 = new SerialNumberGenerator();
        int serialNumber1 = generator1.generateSerialNumber();
        System.out.println("流水号1: " + serialNumber1);

        SerialNumberGenerator generator2 = new SerialNumberGenerator();
        int serialNumber2 = generator2.generateSerialNumber();
        System.out.println("流水号2: " + serialNumber2);
    }
}
