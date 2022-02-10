package com.cydeo.solid.interfaceSegregation.example.good;

public class Owl implements CanEat, CanWalk, CanFly {

    @Override
    public void eat() {
        System.out.println("Eating.");
    }

    @Override
    public void walk() {
        System.out.println("Walking.");
    }

    @Override
    public void fly() {
        System.out.println("Flying");
    }

}
