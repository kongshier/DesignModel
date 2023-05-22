package com.shier.adapter.baseadapter;

/**
 * @author Shier
 * CreateTime 2023/5/10 16:27
 */
public class AdapterClient {
    public static void main(String[] args) {
        Target target = new Adapter();
        // 客户端调用的就是Target的request方法
        target.request();
    }
}
