package com.android.demotestapp;

import android.app.Application;

import androidx.room.Room;

import com.android.model.AppDatabase;

public class DemoApp extends Application {

    private static DemoApp context;
    @Override
    public void onCreate() {
        super.onCreate();
        context=this;
    }

    public static AppDatabase getAppDb(){
        return Room.databaseBuilder(context, AppDatabase.class, "demo.db").build();
    }
}
