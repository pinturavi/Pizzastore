package com.pintu.design.model;

import com.pintu.design.utils.DoughType;
import com.pintu.design.utils.PizzaType;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BasePizza implements Pizza {

    protected List<String> toppings;
    protected DoughType dough;
    protected String seasonings;
    protected String sausageType;

    public BasePizza(){
        toppings = new ArrayList<>();
        toppings.add("Sausage");
        toppings.add("cheese");
    }

    public BasePizza(IngredientFactory ingredientFactory) {
        this();
        if (null != ingredientFactory) {
            dough = ingredientFactory.getCrust();
            sausageType = ingredientFactory.getSauseType();
            seasonings = ingredientFactory.getSeasonings();
        }
    }

    @Override
    public void bake() {

    }

    @Override
    public void cut() {

    }

    @Override
    public void box() {

    }
}
