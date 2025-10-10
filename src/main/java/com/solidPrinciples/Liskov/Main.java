package com.solidPrinciples.Liskov;


import com.solidPrinciples.Liskov.model.Ostrich;
import com.solidPrinciples.Liskov.model.Sparrow;
import com.solidPrinciples.Liskov.service.BirdActions;

public class Main {
    public static void main(String[] args) {
        Sparrow sparrow = new Sparrow();
        Ostrich ostrich = new Ostrich();

        // ✅ Only Sparrow can fly
        BirdActions.makeBirdFly(sparrow);

        // ✅ Both can lay eggs
        BirdActions.makeBirdLayEggs(sparrow);
        BirdActions.makeBirdLayEggs(ostrich);

        // ❌ Uncommenting the line below will cause a compile-time error
        // BirdActions.makeBirdFly(ostrich); // Ostrich is not Flyable
    }
}
