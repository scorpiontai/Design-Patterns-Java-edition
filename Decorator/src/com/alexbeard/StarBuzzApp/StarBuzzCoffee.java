package com.alexbeard.StarBuzzApp;

import com.alexbeard.StarBuzzApp.Beverages.Beverage;
import com.alexbeard.StarBuzzApp.Beverages.Espresso;
import com.alexbeard.StarBuzzApp.Beverages.HouseBlend;
import com.alexbeard.StarBuzzApp.Condiments.Mocha;
import com.alexbeard.StarBuzzApp.Condiments.Whip;

public class StarBuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage1 = new Espresso();
        System.out.println(String.format("%s $ %s", beverage1.getDescription(), beverage1.cost()));

        Beverage beverage2 = new HouseBlend();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(String.format("%s $ %s", beverage2.getDescription(), beverage2.cost()));
    }
}
