package com.alexbeard.PizzaIngredient;

import com.alexbeard.PizzaProduct.IIngredient.*;
import com.alexbeard.PizzaProduct.Ingredient.*;

public class NYPizzaIngredientFactory implements IPizzaIngredientFactory {
    public IDough createDough() {
        return new ThinCrustDough();
    }
    public ISauce createSauce() {
        return new MarinaraSauce();
    }
    public ICheese createCheese() {
        return new ReggianoCheese();
    }
    public IVeggies[] createVeggies() {
        IVeggies veggies[] = { new Garlic(), new Onion(), new Mushroom(), new RedPepper() };
        return veggies;
    }
    public IPepperoni createPepperoni() {
        return new SlicedPepperoni();
    }
    public IClams createClam() {
        return new FreshClams();
    }
}
