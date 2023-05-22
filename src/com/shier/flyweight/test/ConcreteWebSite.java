package com.shier.flyweight.test;

import com.shier.state.test.State;

/**
 * @author Shier
 * CreateTime 2023/5/22 16:32
 */
public class ConcreteWebSite extends WebSite {

    private String name = "";

    public ConcreteWebSite(String name) {
        this.name = name;
    }

    @Override
    public void use(User user) {
        System.out.println("网站分类：" + name + " 来自客户：" + user.getName() + "的需求");
    }
}
