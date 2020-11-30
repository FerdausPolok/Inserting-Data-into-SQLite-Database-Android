package com.example.insertdatainsqlitedatabase;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseSource {
    //operational code likhbo ei class a

    //reference variable nibo

    DatabaseHelper studentDatabaseHelper;
    SQLiteDatabase sqLiteDatabase;
    DatabaseModel databaseModel;

    public DatabaseSource(Context context){

        studentDatabaseHelper = new DatabaseHelper(context);

    }

    public void open(){
        //database open korbo

        sqLiteDatabase = studentDatabaseHelper.getWritableDatabase();
    }

    public void close(){
        //diff operation er por database close korar jonne

        studentDatabaseHelper.close();
    }

    public boolean addStudent(DatabaseModel databaseModel){
        this.open();
        ContentValues contentValues = new ContentValues();
        contentValues.put(studentDatabaseHelper.COL_NAME,databaseModel.getName());
        contentValues.put(studentDatabaseHelper.COL_AGE,databaseModel.getAge());
        contentValues.put(studentDatabaseHelper.COL_ADDRESS,databaseModel.getAddress());
        Long insertedRow = sqLiteDatabase.insert(studentDatabaseHelper.STUDENT_TABLE,null,contentValues);
        this.close();
        if (insertedRow<0){
            return true;
        }
        else
            return false;

    }




}
