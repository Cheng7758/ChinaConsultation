package com.example.chinaconsultation.utils;

import android.app.Application;
import android.content.Context;

/**
 * Created by 爸爸 on 2019/4/4.
 */

public class MyApp extends Application {
    public static Context sContext;
    public static MyApp sMyApp;

    public static boolean isTiao() {
        return tiao;
    }

    public static void setTiao(boolean tiao) {
        MyApp.tiao = tiao;
    }

    public static boolean tiao=false;
//    private RefWatcher refWatcher;

    @Override
    public void onCreate() {
        super.onCreate();
        sContext=this;
        sMyApp=this;
//        refWatcher= setupLeakCanary();


    }
//
//    private RefWatcher setupLeakCanary() {
//        if (LeakCanary.isInAnalyzerProcess(this)) {
//            return RefWatcher.DISABLED;
//        }
//        return LeakCanary.install(this);
//    }




    public static MyApp getMyApp(){
        return sMyApp != null ? sMyApp : null;
    }

    public static Context getContext(){
        return sMyApp.getApplicationContext();
    }
}
