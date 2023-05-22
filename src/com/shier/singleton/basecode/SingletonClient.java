package com.shier.singleton.basecode;

/**
 * @author Shier
 * CreateTime 2023/5/14 9:27
 */
public class SingletonClient {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        if (instance1 == instance2) {
            System.out.println("两个是同一个实例对象");
        }
    }
}
