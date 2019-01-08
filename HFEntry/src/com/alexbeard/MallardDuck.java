package com.alexbeard;

import com.alexbeard.Fly.FlyWithWings;
import com.alexbeard.Quack.Quack;

public class MallardDuck extends Duck {

    public void swim() {

    }

    @Override
    public void display() {
        System.out.println("I'm real mallard duck");
    }

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }
}
