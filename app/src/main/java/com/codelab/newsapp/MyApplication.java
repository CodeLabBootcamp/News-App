package com.codelab.newsapp;

import android.app.Application;

import com.onesignal.OneSignal;

/**
 * Created by SniperDW on 12/21/2016.
 */

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        OneSignal.startInit(this).init();

    }
}
