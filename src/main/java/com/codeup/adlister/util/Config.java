package com.codeup.adlister.util;

public class Config {
//    Create a class named com.codeup.adlister.util.Config.java that will hold our database configuration This class should have three public methods, getUrl, getUsername, and getPassword, all of which should return strings for those properties.
    public String getUrl() {
        return "jdbc:mysql://localhost:3306/adlister_db?allowPublicKeyRetrieval=true&useSSL=false";
    }
    public String getUser() {
        return "adlister_user";
    }
    public String getPassword() {
        return "password";
    }


}
