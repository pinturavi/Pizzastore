package com.pintu.design.model;

import com.pintu.design.utils.PizzaType;

public class PepparoniPizza extends CheesePizza {

    public PepparoniPizza() {
    }

    public PepparoniPizza(IngredientFactory ingredientFactory) {
        super(ingredientFactory);
        toppings.add(PizzaType.Pepperoni.toString());
    }
}
