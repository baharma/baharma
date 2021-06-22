package com.example.sqlite;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import androidx.annotation.Nullable;

class MyDatabaseHelper extends SQLiteDatabase {
private Context context;
public static final string DATABASE_NAME=
    public MyDatabaseHelper(@Nullable Context context){
        super(context, DATABASE_NAME, null,DATABASE_VERSION);
    }
    public void onCreate(SQLiteDatabase sqLiteDatabase){

    }
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1){

    }
}
