package com.shier.singleton.basecode;

/**
 * @author Shier
 * CreateTime 2023/5/14 9:23
 * 单例模式
 */
public class Singleton {
    private static Singleton singleton;

    /**
     * 无参构造 防止外部代码利用new来实例化的可能
     */
    private Singleton() {
    }

    /**
     * 只能通过此途径获取Singleton实例
     * @return
     */
    public static Singleton getInstance() {
        // 为空，则创建实例
        if (singleton == null) {
            singleton = new Singleton();
        }
        // 不为空，则已创建，直接返回实例
        return singleton;
    }
}
