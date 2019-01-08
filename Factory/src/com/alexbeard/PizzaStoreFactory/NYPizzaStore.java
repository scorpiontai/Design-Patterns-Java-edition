package com.alexbeard.PizzaStoreFactory;

import com.alexbeard.PizzaIngredient.IPizzaIngredientFactory;
import com.alexbeard.PizzaIngredient.NYPizzaIngredientFactory;
import com.alexbeard.PizzaProduct.Pizza;
import com.alexbeard.PizzaProduct.PizzaType.*;

public class NYPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String item){
        Pizza pizza = null;
        IPizzaIngredientFactory iPizzaIngredientFactory = new NYPizzaIngredientFactory();

        if (item.equals("cheese")) {
            pizza = new CheesePizza(iPizzaIngredientFactory);
            pizza.setName("New York Style Cheese Pizza");
        } else if (item.equals("veggie")) {
            pizza = new VeggiePizza(iPizzaIngredientFactory);
            pizza.setName("New York Style Veggie Pizza");
        } else if (item.equals("clam")) {
            pizza = new ClamPizza(iPizzaIngredientFactory);
            pizza.setName("New York Style Clam Pizza");
        } else if (item.equals("pepperoni")) {
            pizza = new PepperoniPizza(iPizzaIngredientFactory);
            pizza.setName("New York Style Pepperoni Pizza");
        }
        return pizza;

    }
}
