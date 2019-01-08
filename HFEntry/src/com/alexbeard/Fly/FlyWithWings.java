package com.alexbeard.Fly;

public class FlyWithWings implements IFlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying!");
    }
}
