package com.alexbeard.PizzaProduct.PizzaType;

import com.alexbeard.PizzaIngredient.IPizzaIngredientFactory;
import com.alexbeard.PizzaProduct.Pizza;

public class VeggiePizza extends Pizza {

    IPizzaIngredientFactory pizzaIngredientFactory;

    public VeggiePizza(IPizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
        dough = pizzaIngredientFactory.createDough();
        sauce = pizzaIngredientFactory.createSauce();
        cheese = pizzaIngredientFactory.createCheese();
        veggies = pizzaIngredientFactory.createVeggies();
    }

}
