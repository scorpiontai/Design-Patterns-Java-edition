package com.alexbeard.StarBuzzApp.Condiments;

import com.alexbeard.StarBuzzApp.Beverages.Beverage;

public class Soy extends CondimentDecorator {

    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return String.format("%s , %s",beverage.getDescription(), this.getClass().getSimpleName());
    }

    @Override
    public double cost() {
        return 0.15d + beverage.cost() ;
    }
}