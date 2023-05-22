package com.shier.chain.test;

/**
 * @author Shier
 * CreateTime 2023/5/20 16:36
 * 总经理
 */
public class GeneralManager extends Manager {
    public GeneralManager(String name) {
        super(name);
    }

    @Override
    public void requestApplications(Request request) {
        if (request.getRequestType() == "请假") {
            System.out.println(this.name + ":" + request.getRequestContent() + " 数量：" + request.getNumber() + "天，被批准");
        } else if (request.getRequestType() == "加薪" && request.getNumber() <= 5000) {
            System.out.println(this.name + ":" + request.getRequestContent() + " 数量：" + request.getNumber() + "元，被批准");
        } else if (request.getRequestType() == "加薪" && request.getNumber() > 5000) {
            System.out.println(this.name + ":" + request.getRequestContent() + " 数量：" + request.getNumber() + "元，再说吧");
        }
    }
}
