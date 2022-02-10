package com.cydeo.solid.dependencyInversion.example.good;

public class SecurityFilter {

    public static boolean authenticate() {
        boolean flag = false;
        // Implementation for authentication.
        return flag;
    }

    public static boolean authorize() {
        boolean flag = false;
        // Implementation for authorization.
        return flag;
    }

}
