package com.example.ouss.login;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by ouss on 17/06/18.
 */

public class UserbaseSql extends SQLiteOpenHelper {


    public UserbaseSql(Context cont, String name, SQLiteDatabase.CursorFactory factory,int version){
        super(cont,name,factory,version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE User (id  INTEGER PRIMARY KEY AUTOINCREMENT,username TEXT NOT NULL,password TEXT NOT NULL); ");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
      db.execSQL("DROP TABLE User");
      onCreate(db);
    }


}
