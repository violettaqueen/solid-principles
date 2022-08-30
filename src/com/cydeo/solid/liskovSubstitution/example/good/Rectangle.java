package com.cydeo.solid.liskovSubstitution.example.good;

public class Rectangle implements Shape{

    private int height;
    private int weight;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public int getArea() {
        return 0;
    }
}
