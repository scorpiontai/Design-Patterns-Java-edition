package com.alexbeard.StarBuzzApp.Condiments;

import com.alexbeard.StarBuzzApp.Beverages.Beverage;

public class Whip extends CondimentDecorator {

    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return String.format("%s , %s",beverage.getDescription(), this.getClass().getSimpleName());
    }

    @Override
    public double cost() {
        return 0.10d + beverage.cost() ;
    }
}