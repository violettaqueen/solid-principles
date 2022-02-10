package com.cydeo.solid.interfaceSegregation.example.good;

import java.util.ArrayList;
import java.util.List;

public class MyApp {

    public static void main(String[] args) {

        List<CanFly> flyingBirds = new ArrayList<>();
        flyingBirds.add(new Eagle());
        flyingBirds.add(new Owl());
//        flyingBirds.add(new Chicken());   // This will throw an error, because Chicken class is not a child of CanFly interface.
                                            // So now, the compiler knows that chickens can not fly.
    }

    public void letBirdsFly(List<CanFly> flyingBirds) {
        for (CanFly flyingBird : flyingBirds) {
            flyingBird.fly();               // No Chicken object can be used in here.
        }
    }

}
