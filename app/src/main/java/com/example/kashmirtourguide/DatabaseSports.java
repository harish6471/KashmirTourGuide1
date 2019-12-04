package com.example.kashmirtourguide;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseSports extends SQLiteOpenHelper {
    public static final String DATABASE_NAME = "Sports.db";
    public static final String TABLE_NAME = "Sports_table";
    public static final String TABLE_NAME1 = "Sports_table1";
    public static final String TABLE_NAME2 = "Sports_table2";
    public static final String TABLE_NAME3 = "Sports_table3";
    public static final String Col_1 = "TITLE";
    public static final String Col_2 = "REVIEW";


    public DatabaseSports(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table " + TABLE_NAME + "(ID INTEGER PRIMARY KEY AUTOINCREMENT, TITLE TEXT, REVIEW TEXT)");
        db.execSQL("create table " + TABLE_NAME1 + "(ID INTEGER PRIMARY KEY AUTOINCREMENT, TITLE TEXT, REVIEW TEXT)");
        db.execSQL("create table " + TABLE_NAME2 + "(ID INTEGER PRIMARY KEY AUTOINCREMENT, TITLE TEXT, REVIEW TEXT)");
        db.execSQL("create table " + TABLE_NAME3 + "(ID INTEGER PRIMARY KEY AUTOINCREMENT, TITLE TEXT, REVIEW TEXT)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME1);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME2);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME3);

        onCreate(db);
    }

    public boolean insertData0(String review)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv= new ContentValues();
        cv.put(Col_2,review);
        long result = db.insert(TABLE_NAME," ",cv);
        db.close();
        if(result == -1)
            return false;
        else
            return true;
    }
    public boolean insertData1(String review)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv= new ContentValues();
        cv.put(Col_2,review);
        long result = db.insert(TABLE_NAME1," ",cv);
        db.close();
        if(result == -1)
            return false;
        else
            return true;
    }
    public boolean insertData2(String review)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv= new ContentValues();
        cv.put(Col_2,review);
        long result = db.insert(TABLE_NAME2," ",cv);
        db.close();
        if(result == -1)
            return false;
        else
            return true;
    }
    public boolean insertData3(String review)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv= new ContentValues();
        cv.put(Col_2,review);
        long result = db.insert(TABLE_NAME3," ",cv);
        db.close();
        if(result == -1)
            return false;
        else
            return true;
    }

    public Cursor getAllData0() {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res = db.rawQuery("select * from " + TABLE_NAME, null);
        return res;
    }

    public Cursor getAllData1() {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res = db.rawQuery("select * from " + TABLE_NAME1, null);
        return res;
    }

    public Cursor getAllData2() {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res = db.rawQuery("select * from " + TABLE_NAME2, null);
        return res;
    }

    public Cursor getAllData3() {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res = db.rawQuery("select * from " + TABLE_NAME3, null);
        return res;
    }
}
