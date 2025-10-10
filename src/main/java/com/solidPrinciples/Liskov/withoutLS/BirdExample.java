package com.solidPrinciples.Liskov.withoutLS;

// BirdExample.java

class Bird {
    public void fly() {
        System.out.println("Bird is flying...");
    }
}

class Sparrow extends Bird {
    @Override
    public void fly() {
        System.out.println("Sparrow is flying high!");
    }
}

class Ostrich extends Bird {
    @Override
    public void fly() {
        // Ostrich can't fly — this breaks the expectation set by Bird
        throw new UnsupportedOperationException("Ostrich can't fly!");
    }
}

public class BirdExample {
    public static void main(String[] args) {
        Bird sparrow = new Sparrow();
        Bird ostrich = new Ostrich();

        makeBirdFly(sparrow);   // ✅ Works fine
        makeBirdFly(ostrich);   // ❌ Throws exception — violates LSP
    }

    public static void makeBirdFly(Bird bird) {
        bird.fly();
    }
}
