package com.cydeo.solid.singleResponsibility.example.good;

public class Service {

    public static void create(String request) {
        // Do any implementation that needs to be done before creating the user.
        String user = "Mike Smith";
        Repository.create();
    }

    public static String read() {
        // Do any implementation that needs to be done before reading the user.
        Repository.read();
        return "Mike Smith";
    }

    public static void update(String request) {
        // Do any implementation that needs to be done before updating the user.
        Repository.update();
    }

    public static void delete(String request) {
        // Do any implementation that needs to be done before deleting the user.
        Repository.delete();
    }

}
