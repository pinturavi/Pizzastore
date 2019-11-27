package com.pintu.design.model;

import com.pintu.design.utils.PizzaType;

public class SausagePizza extends CheesePizza {
    public SausagePizza() {
        super();
    }

    public SausagePizza(IngredientFactory ingredientFactory) {
        super(ingredientFactory);
        toppings.add(PizzaType.Sausage.toString());
    }
}
