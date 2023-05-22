package com.shier.chain.dmeo;

/**
 * @author Shier
 * CreateTime 2023/5/20 16:04
 * 处理请求的接口
 */
public abstract class Handler {
    protected Handler successor;

    /**
     * 设置继承者
     * @param successor
     */
    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }
    public abstract void handleRequest(int request);
}
