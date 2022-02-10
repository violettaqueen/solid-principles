package com.cydeo.solid.openClosed.example.good;

public class Circle implements Shape {

    private double radius;

    @Override
    public void draw() {
        System.out.println("Drawing a circle.");
    }

}
