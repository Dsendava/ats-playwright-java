package com.endava.automation.models;

public class User {

    String user;
    String pass;

    public User(String user, String pass) {

        this.user = user;
        this.pass = pass;
    }

    public String getUser() {
        return user;
    }

    public String getPass() {
        return pass;
    }
}
