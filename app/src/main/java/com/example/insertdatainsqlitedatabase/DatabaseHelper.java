package com.example.insertdatainsqlitedatabase;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DatabaseHelper extends SQLiteOpenHelper {

    public static final String DATABAS_NAME= "student.db";
    public static final int DATABAS_VERSION= 1;

    //for table
    public static final String STUDENT_TABLE="student_table";
    //for colm
    public static final String COL_ID= "id";
    public static final String COL_NAME= "name";
    public static final String COL_AGE= "age";
    public static final String COL_ADDRESS= "address";
    //for table creating query
    public static final String CREATE_TABLE= "create table " +STUDENT_TABLE+"("+COL_ID+ " INTEGER PRIMARY KEY AUTOINCREMENT, "+COL_NAME+"TEXT, "+COL_AGE+" INTEGER, "+COL_ADDRESS+" TEXT "+")";



    public DatabaseHelper(@Nullable Context context) {
        super(context, DATABAS_NAME, null, DATABAS_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL(CREATE_TABLE);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exists " + STUDENT_TABLE);
        this.onCreate(db);

    }
}
