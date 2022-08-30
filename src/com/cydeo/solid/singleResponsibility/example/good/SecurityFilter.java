package com.cydeo.solid.singleResponsibility.example.good;

public class SecurityFilter {

    public static boolean authenticate(){
        // check authentication
        return true;
    }
    public static boolean authorization(){
        // check authorization
        return true;
    }
}
