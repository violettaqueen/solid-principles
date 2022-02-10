package com.cydeo.solid.openClosed.example1.good;

public class Triangle implements Shape {

    private double height;
    private double base;

    @Override
    public void draw() {
        System.out.println("Drawing a triangle.");
    }

}
