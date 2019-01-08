package com.alexbeard.StarBuzzApp.Beverages;

public class Espresso extends Beverage {

    public Espresso() {
        description = this.getClass().getSimpleName();
    }

    @Override
    public double cost() {
        return 1.99d;
    }
}
