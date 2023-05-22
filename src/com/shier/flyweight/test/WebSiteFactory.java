package com.shier.flyweight.test;

import java.util.Hashtable;

/**
 * @author Shier
 * CreateTime 2023/5/22 16:33
 */
public class WebSiteFactory {
    private Hashtable<String, WebSite> flyweights = new Hashtable<>();

    /**
     * 获得网站分类
     *
     * @param key
     * @return
     */
    public WebSite getWebSiteCategory(String key) {
        if (!flyweights.contains(key)) {
            flyweights.put(key, new ConcreteWebSite(key));
        }
        return flyweights.get(key);
    }

    /**
     * 获得网站实例个数
     *
     * @return
     */
    public int getWebSiteCount() {
        return flyweights.size();
    }
}
