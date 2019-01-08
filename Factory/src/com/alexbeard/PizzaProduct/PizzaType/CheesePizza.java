package com.alexbeard.PizzaProduct.PizzaType;

import com.alexbeard.PizzaIngredient.IPizzaIngredientFactory;
import com.alexbeard.PizzaProduct.Pizza;

import javax.sound.midi.Soundbank;

public class CheesePizza extends Pizza {

    IPizzaIngredientFactory pizzaIngredientFactory;

    public CheesePizza(IPizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
        dough = pizzaIngredientFactory.createDough();
        sauce = pizzaIngredientFactory.createSauce();
        cheese = pizzaIngredientFactory.createCheese();
    }

}
