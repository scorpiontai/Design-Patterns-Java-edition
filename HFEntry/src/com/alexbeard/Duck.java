package com.alexbeard;

import com.alexbeard.Fly.IFlyBehavior;
import com.alexbeard.Quack.IQuackBehavior;

public abstract class Duck {

    IFlyBehavior flyBehavior;
    IQuackBehavior quackBehavior;

    public Duck() {
    }

    public void swim() {
        System.out.println("All ducks float, even decoys");
    }

    public void perfomQuack(){
        quackBehavior.quack();
    }

    public void perfomFly(){
        flyBehavior.fly();
    }
    abstract public void display();

    public void setFlyBehavior(IFlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(IQuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
