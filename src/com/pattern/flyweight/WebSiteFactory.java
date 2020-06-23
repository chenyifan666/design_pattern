package com.pattern.flyweight;

import java.util.HashMap;
import java.util.Map;

public class WebSiteFactory {
    private static Map<String,WebSite> webSiteMap = new HashMap<>();

    public static WebSite getWebSite(String key){
        WebSite webSite = webSiteMap.get(key);
        if(webSite == null){
            webSite = new ConcreteWebSite(key);
            webSiteMap.put(key,webSite);
        }
        return webSite;
    }
}
