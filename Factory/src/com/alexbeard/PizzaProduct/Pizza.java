package com.alexbeard.PizzaProduct;

import com.alexbeard.PizzaProduct.IIngredient.*;

public abstract class Pizza {

    protected String name;
    protected IDough dough;
    protected ISauce sauce;
    protected IVeggies veggies[];
    protected ICheese cheese;
    protected IClams clam;

    public abstract void prepare();

    public void bake(){
        System.out.println("Bake for 25 minutes at 350");
    };

    public void cut(){
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box(){
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
    // Код вывода описания пиццы
        return new String();
    }
}
