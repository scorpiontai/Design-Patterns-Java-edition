package com.alexbeard.StarBuzzApp.Beverages;

public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = this.getClass().getSimpleName();
    }

    @Override
    public double cost() {
        return 0.89d;
    }
}
