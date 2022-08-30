package com.cydeo.solid.openClosed.example1.good;

public class Rectangle implements Shape{

    private double height;
    private double weight;

    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");
    }
}
