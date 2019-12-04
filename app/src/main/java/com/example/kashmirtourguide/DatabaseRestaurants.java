package com.example.kashmirtourguide;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseRestaurants extends SQLiteOpenHelper {
    public static final String DATABASE_NAME = "Restaurants.db";
    public static final String TABLE_NAME = "Restaurants_table";
    public static final String TABLE_NAME1 = "Restaurants_table1";
    public static final String TABLE_NAME2 = "Restaurants_table2";
    public static final String TABLE_NAME3 = "Restaurants_table3";
    public static final String TABLE_NAME4 = "Restaurants_table4";
    public static final String TABLE_NAME5 = "Restaurants_table5";
    public static final String TABLE_NAME6 = "Restaurants_table6";
    public static final String TABLE_NAME7 = "Restaurants_table7";
    public static final String Col_1 = "TITLE";
    public static final String Col_2 = "REVIEW";


    public DatabaseRestaurants(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table " + TABLE_NAME + "(ID INTEGER PRIMARY KEY AUTOINCREMENT, TITLE TEXT, REVIEW TEXT)");
        db.execSQL("create table " + TABLE_NAME1 + "(ID INTEGER PRIMARY KEY AUTOINCREMENT, TITLE TEXT, REVIEW TEXT)");
        db.execSQL("create table " + TABLE_NAME2 + "(ID INTEGER PRIMARY KEY AUTOINCREMENT, TITLE TEXT, REVIEW TEXT)");
        db.execSQL("create table " + TABLE_NAME3 + "(ID INTEGER PRIMARY KEY AUTOINCREMENT, TITLE TEXT, REVIEW TEXT)");
        db.execSQL("create table "+ TABLE_NAME4 + "(ID INTEGER PRIMARY KEY AUTOINCREMENT, TITLE TEXT, REVIEW TEXT)");
        db.execSQL("create table "+ TABLE_NAME5 + "(ID INTEGER PRIMARY KEY AUTOINCREMENT, TITLE TEXT, REVIEW TEXT)");
        db.execSQL("create table "+ TABLE_NAME6 + "(ID INTEGER PRIMARY KEY AUTOINCREMENT, TITLE TEXT, REVIEW TEXT)");
        db.execSQL("create table "+ TABLE_NAME7 + "(ID INTEGER PRIMARY KEY AUTOINCREMENT, TITLE TEXT, REVIEW TEXT)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME1);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME2);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME3);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME4);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME5);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME6);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME7);
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
    public boolean insertData4(String review)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv= new ContentValues();
        cv.put(Col_2,review);
        long result = db.insert(TABLE_NAME4," ",cv);
        db.close();
        if(result == -1)
            return false;
        else
            return true;
    }
    public boolean insertData5(String review)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv= new ContentValues();
        cv.put(Col_2,review);
        long result = db.insert(TABLE_NAME5," ",cv);
        db.close();
        if(result == -1)
            return false;
        else
            return true;
    }
    public boolean insertData6(String review)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv= new ContentValues();
        cv.put(Col_2,review);
        long result = db.insert(TABLE_NAME6," ",cv);
        db.close();
        if(result == -1)
            return false;
        else
            return true;
    }
    public boolean insertData7(String review)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv= new ContentValues();
        cv.put(Col_2,review);
        long result = db.insert(TABLE_NAME7," ",cv);
        db.close();
        if(result == -1)
            return false;
        else
            return true;
    }

    public Cursor getAllData0()
    {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res= db.rawQuery("select * from " + TABLE_NAME,null);
        return res;
    }
    public Cursor getAllData1()
    {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res= db.rawQuery("select * from " + TABLE_NAME1,null);
        return res;
    }
    public Cursor getAllData2()
    {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res= db.rawQuery("select * from " + TABLE_NAME2,null);
        return res;
    }
    public Cursor getAllData3()
    {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res= db.rawQuery("select * from " + TABLE_NAME3,null);
        return res;
    }
    public Cursor getAllData4()
    {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res= db.rawQuery("select * from " + TABLE_NAME4,null);
        return res;
    }
    public Cursor getAllData5()
    {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res= db.rawQuery("select * from " + TABLE_NAME5,null);
        return res;
    }
    public Cursor getAllData6()
    {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res= db.rawQuery("select * from " + TABLE_NAME6,null);
        return res;
    }
    public Cursor getAllData7()
    {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res= db.rawQuery("select * from " + TABLE_NAME7,null);
        return res;
    }
}