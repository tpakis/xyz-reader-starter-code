package com.example.xyzreader.application;

import android.app.Application;
import android.content.Context;

import com.facebook.stetho.Stetho;

public class XYZApplication extends Application {
    private static Context context;
    private static XYZApplication mApplication;

    public void onCreate() {
        super.onCreate();

        mApplication = this;
        XYZApplication.context = getApplicationContext();
        initializeStetho();
    }

    public void initializeStetho() {
        Stetho.initializeWithDefaults(this);
    }
}
