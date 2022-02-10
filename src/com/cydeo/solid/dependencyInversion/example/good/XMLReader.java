package com.cydeo.solid.dependencyInversion.example.good;

public class XMLReader implements Reader {

    public String getUsername() {
        return "<username>mikesmith</username>";
    }

}
