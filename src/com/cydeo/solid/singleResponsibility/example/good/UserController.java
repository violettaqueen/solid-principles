package com.cydeo.solid.singleResponsibility.example.good;

public class UserController {

    public static void getRequest() {
        // Get the API request
        // Send to validation and security check
        if (Manager.validate() && Manager.checkSecurity()) {
            // Continue with the requested CRUD operation.
        }
    }

    public static String createResponse() {
        // Based on the CRUD operation, create a response.
        return "Response";
    }

    public static void sendResponse() {
        // Implementation for sending the API response.
    }

}
