package com.alexbeard;

import com.alexbeard.PizzaProduct.Pizza;
import com.alexbeard.PizzaStoreFactory.CHGPizzaStore;
import com.alexbeard.PizzaStoreFactory.NYPizzaStore;
import com.alexbeard.PizzaStoreFactory.PizzaStore;

public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyPizzaStore = new NYPizzaStore();
        PizzaStore chgPizzaStore = new CHGPizzaStore();

        Pizza pizza = nyPizzaStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = chgPizzaStore.orderPizza("cheese");
        System.out.println("Bob ordered a " + pizza.getName() + "\n");
    }
}
