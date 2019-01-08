package com.alexbeard.PizzaIngredient;

import com.alexbeard.PizzaProduct.IIngredient.*;

public interface IPizzaIngredientFactory {
    public IDough createDough();
    public ISauce createSauce();
    public ICheese createCheese();
    public IVeggies[] createVeggies();
    public IPepperoni createPepperoni();
    public IClams createClam();
}
