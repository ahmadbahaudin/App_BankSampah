package com.example.loginbanksampah;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class DBHelper extends SQLiteOpenHelper {

    public static final String database_name = "db_login";
    public static final String tabel_nama = "tblogin_login";

    public static final String row_id = "_id";
    public static final String row_username = "username";
    public static final String row_email = "email";
    public static final String row_tlp = "email";
    public static final String row_password = "password";

    private SQLiteDatabase db;

    public DBHelper(Context context) {
        super(context, database_name, null, 5);
        db = getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String query = "CREATE TABLE " + tabel_nama + "(" + row_id + " INTEGER PRIMARY KEY AUTOINCREMENT,"
                + row_username + " TEXT," + row_email + " TEXT," +  row_tlp + " TEXT," + row_password + " TEXT)";
        db.execSQL(query);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + tabel_nama+ ";");
    }

    //Insert Data
    public void insertData(ContentValues values){
        db.insert(tabel_nama, null, values);
    }


    public boolean checkUser(String email, String password){
        String[] columns = {row_id};
        SQLiteDatabase db = getReadableDatabase();
        String selection = row_email + "=? AND " + row_password + "=?";
        String[] selectionArgs = {email, password};
        Cursor cursor = db.query(tabel_nama, columns, selection, selectionArgs, null, null, null);
        int count = cursor.getCount();
        cursor.close();
        db.close();

        if (count>0)
            return true;
        else
            return false;
    }
}
