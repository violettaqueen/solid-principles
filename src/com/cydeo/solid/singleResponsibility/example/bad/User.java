package com.cydeo.solid.singleResponsibility.example.bad;

public class User {

    public static void getRequest() {
        // Implementation for getting the API request.
        // Continue with the requested CRUD operation.
    }

    public static boolean validate() {
        boolean flag = false;
        // Check validity of the API request.
        return flag;
    }

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

    public static void create(String request) {
        // Check for authentication and authorization.
        // Create a user by getting the information of the user from the API request.
        // Connect to database
        // Save that user to database.
    }

    public static String read() {
        // Check for authentication and authorization.
        // Connect to database
        // Get the user from the database.
        // Return that user.
        return "Mike Smith";
    }

    public static void update(String request) {
        // Check for authentication and authorization.
        // Connect to database
        // Get the user from the database.
        // Update the user by using the information coming from the API request.
    }

    public static void delete(String request) {
        // Check for authentication and authorization.
        // Connect to database
        // Get the user from the database.
        // Delete the user by using the information coming from the API request.
    }

    public static String createResponse() {
        // Based on the CRUD operation, create a response.
        return "Response";
    }

    public static void sendResponse() {
        // Implementation for sending the API response.
    }

}
