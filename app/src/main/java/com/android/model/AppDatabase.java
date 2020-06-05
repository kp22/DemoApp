package com.android.model;

import androidx.room.Database;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;

@Database(entities = {User.class,
}, version = 1)

@TypeConverters(OptionConvector.class)
public abstract class AppDatabase extends RoomDatabase {
    public abstract UserDao userDao();
}
