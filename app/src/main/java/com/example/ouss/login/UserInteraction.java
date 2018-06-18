package com.example.ouss.login;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;

/**
 * Created by ouss on 17/06/18.
 */

public class UserInteraction {

    private SQLiteDatabase bdd;

    private UserbaseSql user;

    public UserInteraction(Context context){
        user= new UserbaseSql(context,"User",null,1);

    }
    public void openForWrite(){
        bdd=user.getWritableDatabase();
    }
    public void openForRead(){
        bdd=user.getReadableDatabase();
    }

    public void close(){
        bdd.close();
    }


    public long insertUser(User user){
        ContentValues content=new ContentValues();
        content.put("username",user.getUsername());
        content.put("password",user.getPassword());
        return bdd.insert("User",null,content);
    }

    public ArrayList<User> getAllUser(){
        Cursor c=bdd.query("User",new String[] {"id","username","password"},null,null,null,null,"id");
        if(c.getCount()==0){
            c.close();
            return null;
        }
        ArrayList<User> userList=new ArrayList<User>();
        while(c.moveToNext()){
            User user=new User();
            user.setId(c.getInt(0));
            user.setUsername(c.getString(1));
            user.setPassword(c.getString(2));
            userList.add(user);
        }
        c.close();
        return userList;

    }

}
