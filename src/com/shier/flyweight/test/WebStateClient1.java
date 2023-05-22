package com.shier.flyweight.test;

/**
 * @author Shier
 * CreateTime 2023/5/22 16:39
 */
public class WebStateClient1 {
    public static void main(String[] args) {
        WebSiteFactory webSiteFactory = new WebSiteFactory();
        WebSite siteCategory = webSiteFactory.getWebSiteCategory("产品展示");
        siteCategory.use(new User("十二1号"));
        WebSite siteCategory1 = webSiteFactory.getWebSiteCategory("产品展示");
        siteCategory1.use(new User("十二2号"));
        WebSite siteCategory2 = webSiteFactory.getWebSiteCategory("产品展示");
        siteCategory2.use(new User("十二3号"));
        WebSite siteCategory3 = webSiteFactory.getWebSiteCategory("博客");
        siteCategory3.use(new User("十二4号"));
        WebSite siteCategory4 = webSiteFactory.getWebSiteCategory("博客");
        siteCategory4.use(new User("十二5号"));
        WebSite siteCategory5 = webSiteFactory.getWebSiteCategory("博客");
        siteCategory5.use(new User("十二6号"));
        System.out.println("总共创建了 " + webSiteFactory.getWebSiteCount() + " 个实例");
    }
}
