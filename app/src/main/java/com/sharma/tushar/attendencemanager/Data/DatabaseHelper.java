package com.sharma.tushar.attendencemanager.Data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {

    private static String DBname = "Attendance Manager";
    private static int DBversion = 1;

    public DatabaseHelper(Context context) {
        super(context, DBname, null, DBversion);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String query = "create table Subjects(" +
                "S_No int(2) Primary Key AUTOINCREMENT," +
                "Sub_Name varchar(40) NOT NULL UNIQUE," +
                "Total_Classes int(3) NOT NULL," +
                "Attended int(3) NOT NULL);";
        db.execSQL(query);
        query = "create table NotAttended(" +
                "Date int(8) NOT NULL," +
                "Sub_Code varchar(20) NOT NULL);";
        db.execSQL(query);
        query = "create table DailySchedule(" +
                "Day int(1) Primary Key AUTOINCREMENT," +
                "Sub_Code varchar(20) NOT NULL);";
        db.execSQL(query);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    }
}
