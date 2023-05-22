package com.shier.media.test;

/**
 * @author Shier
 * CreateTime 2023/5/22 15:36
 * 伊拉克类
 */
public class Iraq extends Country {
    /**
     * 得到安理会中介者
     *
     * @param unitedNations
     */
    public Iraq(UnitedNations unitedNations) {
        super(unitedNations);
    }

    /**
     * 伊拉克发布消息
     *
     * @param message
     */
    public void declare(String message) {
        this.unitedNations.declare(message, this);
    }

    /**
     * 伊拉克接受其他国家信息
     * @param message
     */
    public void getMessage(String message) {
        System.out.println("伊拉克收到消息：" + message);
    }
}
