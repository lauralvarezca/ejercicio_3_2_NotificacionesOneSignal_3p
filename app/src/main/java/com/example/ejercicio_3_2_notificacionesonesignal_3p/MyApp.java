package com.example.ejercicio_3_2_notificacionesonesignal_3p;

import android.app.Application;

import com.onesignal.OneSignal;

public class MyApp extends Application {

    private static final String ONESIGNAL_APP_ID = "3a5c0cf8-43c3-45fe-852f-fb4582a7d4b3";

    @Override
    public void onCreate() {
        super.onCreate();

        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE);

        OneSignal.initWithContext(this);
        OneSignal.setAppId(ONESIGNAL_APP_ID);

        OneSignal.promptForPushNotifications();
    }
}