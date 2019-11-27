package com.pintu.design.service;

import com.pintu.design.model.IngredientFactory;
import com.pintu.design.model.Pizza;
import com.pintu.design.utils.PizzaType;

public abstract class AbstractPizzaStore implements PizzaStore {
    IngredientFactory ingredientFactory;



    public Pizza orderLocalizedPizza(PizzaType type) {
        final var pizza = createLcoalizedPizza(type);
        pizza.bake();
        pizza.bake();
        pizza.cut();
        return pizza;
    }

    public abstract Pizza createLcoalizedPizza(PizzaType type);

}
