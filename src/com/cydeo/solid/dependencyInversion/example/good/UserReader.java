package com.cydeo.solid.dependencyInversion.example.good;

public class UserReader {

    private Reader reader;              // Now, it is depends on an interface instead of depending on a concrete class.

    public UserReader(Reader reader) {
        this.reader = reader;
    }

    public String getUsername() {
        return reader.getUsername();
    }

}
