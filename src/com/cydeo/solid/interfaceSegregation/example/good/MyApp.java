package com.cydeo.solid.interfaceSegregation.example.good;

import java.util.List;

public class App {

    private List<CanFly> flyingBirds;

    public App(List<CanFly> flyingBirds) {
        this.flyingBirds = flyingBirds;
    }

    public void letBirdsFly() {
        for (CanFly flyingBird : flyingBirds) {
            flyingBird.fly();             // No Chicken object can be used in here.
        }
    }

}
