package com.pattern.flyweight;

public class Test {
    public static void main(String[] args) {
        User user = new User("张三");
        WebSite webSite = WebSiteFactory.getWebSite("展示类网站");
        webSite.use(user);
        webSite.execute();

        WebSite webSite1 = WebSiteFactory.getWebSite("博客类网站");
        webSite1.use(user);
        webSite1.execute();
    }
}
