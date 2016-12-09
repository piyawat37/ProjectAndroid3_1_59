package com.example.evitected.math_piece.ClassModel;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Evitected on 5/12/2559.
 */
public class DatabaseSQLite extends SQLiteOpenHelper{

    public static final String DATABASE_NAME = "MathPuzzle.db";

    public DatabaseSQLite(Context context, int version) {
        super(context, DATABASE_NAME, null, version);
        SQLiteDatabase db = this.getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE tb_DeviceUnique" +
                "( _id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL," +
                "Device_id VARCHAR," +
                "State_id INTEGER )");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS tb_DeviceUnique");
        onCreate(db);
    }
    public Cursor getDeviceID(){
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor result = db.rawQuery("select * from tb_DeviceUnique", null);
        if(result != null){
            result.moveToFirst();
        }
        return result;
    }
    public boolean insertNewDevice(String Device_ID){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues myValues = new ContentValues();
        myValues.put("Device_id",Device_ID);
        myValues.put("State_id",1);
        long result = db.insert("tb_DeviceUnique", null, myValues);
        if(result == -1){
            return false;
        }else{
            return true;
        }
    }
    public boolean updateState(int id,int State){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues myValues = new ContentValues();
        myValues.put("State_id", State);
        return db.update("tb_DeviceUnique", myValues,"_id = "+id, null) > 0;
    }

    public boolean ResetState(){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues myValues = new ContentValues();
        myValues.put("State_id", 1);
        return db.update("tb_DeviceUnique", myValues,"_id = 1", null) > 0;
    }
}
