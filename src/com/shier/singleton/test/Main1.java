package com.shier.singleton.test;

/**
 * @author Shier
 */
public class Main1 {
    public static void main(String[] args) {
        int serialNumber1 = SerialNumberGenerator1.getInstance().generateSerialNumber();
        System.out.println("流水号 1: " + serialNumber1);

        int serialNumber2 = SerialNumberGenerator1.getInstance().generateSerialNumber();
        System.out.println("流水号 2: " + serialNumber2);
    }

}