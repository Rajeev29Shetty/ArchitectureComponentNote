package com.example.rajeev.architecturecomponentexample.database;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.TypeConverter;
import android.arch.persistence.room.TypeConverters;
import android.content.Context;


@Database(entities = {NoteEntity.class}, version = 1)
@TypeConverters(DateConverter.class)
public abstract class AppDatabase extends RoomDatabase {

    public static final String DATABASE_NAME = "AppDatabase.db";
    private static volatile AppDatabase instamnce;
    private static final Object LOCK = new Object();

    public abstract NoteDao noteDao();

    public static AppDatabase getInstamnce(Context context){
        if(instamnce == null){
            synchronized (LOCK){
                if(instamnce == null){
                    instamnce = Room.databaseBuilder(context, AppDatabase.class, DATABASE_NAME).build();
                }
            }
        }
        return instamnce;
    }
}
