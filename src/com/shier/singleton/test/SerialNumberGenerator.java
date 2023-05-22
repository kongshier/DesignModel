package com.shier.singleton.test;

/**
 * @author Shier
 * CreateTime 2023/5/14 9:30
 * 流水号例子
 */
public class SerialNumberGenerator {
    private int serialNumber;

    /**
     * 外界可以实例化SerialNumberGenerator
     */
    public SerialNumberGenerator() {
        serialNumber = 0;
    }

    public int generateSerialNumber() {
        serialNumber++;
        return serialNumber;
    }
}
