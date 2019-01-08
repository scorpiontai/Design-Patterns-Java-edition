package com.alexbeard.PizzaIngredient;

import com.alexbeard.PizzaProduct.IIngredient.*;
import com.alexbeard.PizzaProduct.Ingredient.*;

public class CHGPizzaIngredientFactory implements IPizzaIngredientFactory {
    public IDough createDough() {
        return new ThickCrustDough();
    }
    public ISauce createSauce() {
        return new PlumTomatoSauce();
    }
    public ICheese createCheese() {
        return new MozzarellaCheese();
    }
    public IVeggies[] createVeggies() {
        IVeggies veggies[] = { new Spinach(), new BlackOlives(), new EggPlant() };
        return veggies;
    }
    public IPepperoni createPepperoni() {
        return new SlicedPepperoni();
    }
    public IClams createClam() {
        return new FrozenClams();
    }
}
