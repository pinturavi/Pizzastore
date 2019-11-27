package com.pintu.design;

import com.pintu.design.model.*;
import com.pintu.design.utils.PizzaType;

public class PizzaFactory {
    public static Pizza createPizza(PizzaType type) {
        return switch (type) {
            case Cheese -> new CheesePizza();
            case Pepperoni -> new PepparoniPizza();
            case Sausage -> new SausagePizza();
            default -> new BasePizza();
        };
    }

    public static Pizza createLocalzedPizze(PizzaType type, IngredientFactory ingredientFactory) {
        return switch (type){
            case Cheese -> new CheesePizza(ingredientFactory);
            case Sausage -> new SausagePizza(ingredientFactory);
            case Unknown -> new BasePizza(ingredientFactory);
            case Pepperoni -> new PepparoniPizza(ingredientFactory);
        };
    };

}
