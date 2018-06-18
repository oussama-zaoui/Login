package com.example.ouss.login;

/**
 * Created by ouss on 17/06/18.
 */

public class User {

    private int id;
    private String username,password;


    public User (){

    }

    public User(String username,String password){
        this.username=username;
        this.password=password;

    }

    public int getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

