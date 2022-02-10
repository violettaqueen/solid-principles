package com.cydeo.solid.openClosed.example.good;

import java.util.List;

public class DrawShape {

    public void draw(List<Shape> shapes) {

        for (Shape shape : shapes) {
            shape.draw();
        }

    }

}
