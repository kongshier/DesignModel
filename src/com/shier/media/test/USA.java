package com.shier.media.test;

/**
 * @author Shier
 * CreateTime 2023/5/22 15:36
 * 美国类
 */
public class USA extends Country {
    /**
     * 得到安理会中介者
     *
     * @param unitedNations
     */
    public USA(UnitedNations unitedNations) {
        super(unitedNations);
    }

    /**
     * 美国发布消息
     *
     * @param message
     */
    public void declare(String message) {
        this.unitedNations.declare(message, this);
    }

    /**
     * 美国接受其他国家信息
     * @param message
     */
    public void getMessage(String message) {
        System.out.println("美国收到消息：" + message);
    }
}
