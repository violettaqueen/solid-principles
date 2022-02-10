package com.cydeo.solid.liskovSubstitution.example.bad;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle();
        rectangle.setHeight(3);
        rectangle.setWidth(5);

        Rectangle square = new Square();
        square.setHeight(4);

        List<Rectangle> rectangles = Arrays.asList(rectangle, square);

        changeHeightAndWidth(rectangles);

    }

    public static void changeHeightAndWidth(List<Rectangle> rectangles) {

        for (Rectangle rectangle : rectangles) {
            rectangle.setHeight(5);                             // Square will have 5 height and 5 width
            rectangle.setWidth(6);                              // Square will have 6 height and 6 width
            System.out.println(rectangle.getArea() == 30);      // Area of a Square will be 36
        }

    }

}
