package com.shier.chain.test;

/**
 * @author Shier
 * CreateTime 2023/5/20 16:36
 * 总监
 */
public class Director extends Manager {
    public Director(String name) {
        super(name);
    }

    @Override
    public void requestApplications(Request request) {
        if (request.getRequestType() == "请假" && request.getNumber() <= 5) {
            System.out.println(this.name + ":" + request.getRequestContent() + " 数量：" + request.getNumber() + "天，被批准");
        } else if (this.superior != null) {
            this.superior.requestApplications(request);
        }
    }
}
