package com.shier.chain.test;

/**
 * @author Shier
 */
public class ChainClient {
    public static void main(String[] args) {

        CommonManager manager = new CommonManager("大明经理");
        Director director = new Director("大大明总监");
        GeneralManager generalManager = new GeneralManager("大大大明总经理");

        // 设置管理者之间上下级关系 经理 => 总监 => 总经理
        manager.setSuperior(director);
        director.setSuperior(generalManager);

        // 加薪 5000
        Request request = new Request();
        request.setRequestType("加薪");
        request.setRequestContent("Shier请求加薪");
        request.setNumber(5000);
        // 从自己最近的上司开始请求也就是经理
        manager.requestApplications(request);

        // 加薪10000
        Request request1 = new Request();
        request1.setRequestType("加薪");
        request1.setRequestContent("Shier请求加薪");
        request1.setNumber(10000);
        manager.requestApplications(request1);

        // 请假一天
        Request request2 = new Request();
        request2.setRequestType("请假");
        request2.setRequestContent("Shier请假");
        request2.setNumber(1);
        manager.requestApplications(request2);

        // 请假四天
        Request request3 = new Request();
        request3.setRequestType("请假");
        request3.setRequestContent("Shier请假");
        request3.setNumber(4);
        manager.requestApplications(request3);

    }
}