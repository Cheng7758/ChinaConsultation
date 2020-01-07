package com.example.chinaconsultation.config;

/**
 * Created by 爸爸 on 2019/4/1.
 */

public class NetConfig {
    public static String BASEURL;
    public static int type = 2;

    static {
        if (type == 1) {
            BASEURL = "http://www.zgmsbweb.com/";
         } else if (type == 2) {
            BASEURL = "http://www.baidu.com/";
        } else {
            BASEURL = "http://www.zgmsbweb.com/";
        }
    }
}
