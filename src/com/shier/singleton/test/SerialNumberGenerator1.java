package com.shier.singleton.test;

/**
 * @author Shier
 */
public class SerialNumberGenerator1 {
    private static volatile SerialNumberGenerator instance;
    private int serialNumber;

    /**
     * 防止直接实例化SerialNumberGenerator1
     */
    private SerialNumberGenerator1() {
        serialNumber = 0;
    }

    /**
     * 获取SerialNumberGenerator1的唯一方式
     * @return
     */
    public static SerialNumberGenerator getInstance() {
        if (instance == null) {
            synchronized (SerialNumberGenerator.class) {
                if (instance == null) {
                    instance = new SerialNumberGenerator();
                }
            }
        }
        return instance;
    }

    /**
     * 生成的流水号
     * @return
     */
    public int generateSerialNumber() {
        synchronized (SerialNumberGenerator.class) {
            serialNumber++;
            return serialNumber;
        }
    }
}