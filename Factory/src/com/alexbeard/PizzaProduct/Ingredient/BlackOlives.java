package com.alexbeard.PizzaProduct.Ingredient;

import com.alexbeard.PizzaProduct.IIngredient.IVeggies;

public class BlackOlives implements IVeggies {
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
