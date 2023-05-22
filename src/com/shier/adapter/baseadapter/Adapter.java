package com.shier.adapter.baseadapter;

/**
 * @author Shier
 * CreateTime 2023/5/10 16:25
 * 适配类-对接两个适配的接口
 */
public class Adapter extends Target{

    /**
     * Adaptee对象
     */
    private Adaptee adaptee = new Adaptee();

    /**
     * 适配的请求
     */
    public void request(){
        adaptee.specificRequest();
    }
}
