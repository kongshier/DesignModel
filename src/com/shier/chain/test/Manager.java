package com.shier.chain.test;

/**
 * @author Shier
 * CreateTime 2023/5/20 16:33
 * 抽象管理这类
 */
public abstract class Manager {
    protected String name;

    public Manager(String name) {
        this.name = name;
    }

    /**
     * 设置管理者上级
     */
    protected Manager superior;

    public void setSuperior(Manager superior) {
        this.superior = superior;
    }

    /**
     * 请求申请
     *
     * @param request
     */
    public abstract void requestApplications(Request request);
}
