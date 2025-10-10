package com.solidPrinciples.Liskov.service;


import com.solidPrinciples.Liskov.behaviour.Flyable;
import com.solidPrinciples.Liskov.model.Bird;

public class BirdActions {

    public static void makeBirdFly(Flyable bird) {
        bird.fly();
    }

    public static void makeBirdLayEggs(Bird bird) {
        bird.layEggs();
    }
}
