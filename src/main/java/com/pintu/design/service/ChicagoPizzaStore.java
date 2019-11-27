package com.pintu.design.service;

import com.pintu.design.PizzaFactory;
import com.pintu.design.model.BaseIngredients;
import com.pintu.design.model.IngredientFactory;
import com.pintu.design.model.Pizza;
import com.pintu.design.utils.PizzaType;

public class ChicagoPizzaStore extends AbstractPizzaStore {

    public ChicagoPizzaStore() {
        super();
        ingredientFactory = new BaseIngredients();
    }

    public ChicagoPizzaStore(IngredientFactory ingredientFactory) {
        super();
        ingredientFactory = ingredientFactory;
    }


    @Override
    public Pizza createLcoalizedPizza(PizzaType type) {
        return PizzaFactory.createLocalzedPizze(type, ingredientFactory);
    }

}
