package com.pintu.design.model;

public class CheesePizza extends BasePizza {
    public CheesePizza() {
        super();
    }

    public CheesePizza(IngredientFactory ingredientFactory) {
        super(ingredientFactory);
        toppings.add("Cheese");
    }

    @Override
    public String toString() {
        return "CheesePizza{" +
                "toppings=" + toppings +
                ", dough=" + dough +
                ", seasonings='" + seasonings + '\'' +
                ", sausageType='" + sausageType + '\'' +
                '}';
    }
}
