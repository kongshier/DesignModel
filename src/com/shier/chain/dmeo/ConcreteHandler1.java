package com.shier.chain.dmeo;

/**
 * @author Shier
 * CreateTime 2023/5/20 16:06
 */
public class ConcreteHandler1 extends Handler {
    @Override
    public void handleRequest(int request) {
        if (request >= 0 && request < 10) {
            // 当前处理者权限 0 ~ 9
            System.out.println(this.getClass().getSimpleName() + "处理了请求" + request);
        } else if (successor != null) {
            // 转移给下一个处理者
            successor.handleRequest(request);
        }
    }
}
