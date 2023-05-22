package com.shier.chain.test;

/**
 * @author Shier
 * CreateTime 2023/5/20 16:34
 * 普通经理类
 */
public class CommonManager extends Manager {
    public CommonManager(String name) {
        super(name);
    }

    @Override
    public void requestApplications(Request request) {
        if (request.getRequestType() == "请假" && request.getNumber() <= 2) {
            System.out.println(this.name + ":" + request.getRequestContent() + " 数量：" + request.getNumber() + "天，被批准");
        } else if (this.superior != null) {
            this.superior.requestApplications(request);
        }
    }
}
