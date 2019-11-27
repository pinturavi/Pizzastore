package com.pintu.design.service;

import com.pintu.design.model.Pizza;
import com.pintu.design.utils.PizzaType;

public interface PizzaStore {
    Pizza orderLocalizedPizza(PizzaType type);
}
