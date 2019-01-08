package com.alexbeard.PizzaProduct.PizzaType;

import com.alexbeard.PizzaIngredient.IPizzaIngredientFactory;
import com.alexbeard.PizzaProduct.Pizza;

public class ClamPizza extends Pizza {
    IPizzaIngredientFactory ingredientFactory;
    public ClamPizza(IPizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing “ + name");
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        clam = ingredientFactory.createClam();

    }
}
