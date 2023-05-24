package com.shier.express.demo;

/**
 * @author Shier
 * CreateTime 2023/5/24 19:31
 * 解释器外的全局信息
 */
public class Context {
    private String input;
    private String outPut;

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public String getOutPut() {
        return outPut;
    }

    public void setOutPut(String outPut) {
        this.outPut = outPut;
    }
}
