package com.solidPrinciples.Liskov.model;

import com.solidPrinciples.Liskov.behaviour.Flyable;

public class Sparrow extends Bird implements Flyable {
    @Override
    public void fly() {
        System.out.println("Sparrow is flying high!");
    }
}
